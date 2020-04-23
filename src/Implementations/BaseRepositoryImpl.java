package Implementations;

import entities.BaseEntity;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import persistence.Repository;
import projecto2.Principal;

public abstract class BaseRepositoryImpl<T extends BaseEntity> implements Repository<T> {

    private EntityManager entityManager;
    private final Class<T> cls;

    public BaseRepositoryImpl(EntityManager entityManager, Class cls) {
        this.entityManager = entityManager;
        this.cls = cls;
    }

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
        T t=(T) entityManager.find(cls, id);
        entityManager.close();
        return t;
    }

    @Override
    public T save(T entity) {
        ensureTransaction();
        if (entity.getId() == null) {
            this.entityManager.persist(entity);
            entityManager.getTransaction().commit();
            entityManager.close();
            return entity;
        } else {
            entityManager.getTransaction().commit();
           T t= this.entityManager.merge(entity);
           entityManager.close();
            return t;
        }

    }

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

    protected void ensureTransaction() {
  if (!entityManager.isOpen()) {
            this.entityManager=(new Principal().getNewEM());
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

    public void setEntityManager(EntityManager em) {
        this.entityManager = em;
    }

    public Class<T> getCls() {
        return cls;
    }

}
