package Implementations;

import entities.BaseEntity;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import persistence.Repository;

public abstract class BaseRepository <T extends BaseEntity> implements Repository<T> {

    private final EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("Projecto2PU");
    private EntityManager entityManager = managerFactory.createEntityManager();
    private Class<T> cls;

    public BaseRepository(Class cls) {
        this.cls = cls;
    }


    @Override
    public ArrayList<T> getAll(Class<T> entityClass) {
        ensureTransaction();
        Query query = entityManager.createQuery("from " + entityClass.getName() + " c");

        ArrayList lista = new ArrayList(query.getResultList());
        entityManager.close();
        return lista;
    }

    
    @Override
    public T find(int id) {
        ensureTransaction();
        T t = (T) entityManager.find(cls, id);
        entityManager.close();
        return t;
    }

    
    @Override
    public void save(T entity) {
        ensureTransaction();
        if (entity.getId() == null) {
            this.entityManager.persist(entity);
            entityManager.getTransaction().commit();
            entityManager.close();

        } else {
            entityManager.getTransaction().commit();
            this.entityManager.merge(entity);
            entityManager.close();

        }

    }


    @Override
    public void edit(T entity) {
        ensureTransaction();
        entityManager.merge(entity);
        entityManager.getTransaction().commit();
        entityManager.close();
    }


    @Override
    public void delete(T entity) {
        ensureTransaction();

        entityManager.remove(entityManager.merge(entity));

        entityManager.getTransaction().commit();
        entityManager.close();

    }

 
    @Override
    public void commit() {
        ensureTransaction();
        EntityTransaction transaction = this.entityManager.getTransaction();
        if (transaction.isActive()) {
            entityManager.getTransaction().commit();
            entityManager.close();
        }

    }

  
    @Override
    public void ensureTransaction() {
        if (!entityManager.isOpen()) {
            this.entityManager = managerFactory.createEntityManager();
        }

        if (!entityManager.getTransaction().isActive()) {
            entityManager.getTransaction().begin();
        }
        EntityTransaction transaction = this.entityManager.getTransaction();
        if (!transaction.isActive()) {
            transaction.begin();
        }

    }

    public EntityManager getEntityManager() {
        return entityManager;
    }

    

}
