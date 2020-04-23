package persistence;

import entities.BaseEntity;
import java.util.ArrayList;
import java.util.Arrays;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

public class BaseRepositoryImpl<T extends BaseEntity> implements Repository<T> {

    private final EntityManager entityManager;
    private final Class<T> cls;

    public BaseRepositoryImpl(EntityManager entityManager, Class cls) {
        this.entityManager = entityManager;
        this.cls = cls;
    }

    public ArrayList<T> getAll(Class<T> entityClass) {
           if (!entityManager.getTransaction().isActive()) {
            entityManager.getTransaction().begin();
        }

        Query query = entityManager.createQuery("from " + entityClass.getName() + " c");

        ArrayList lista = new ArrayList(query.getResultList());
          entityManager.close();
        return lista;
    }

    @Override
    public T find(int id) {
          if (!entityManager.getTransaction().isActive()) {
            entityManager.getTransaction().begin();
        }
        return (T) entityManager.find(cls, id);
    }

    @Override
    public T save(T entity) {
        if (!entityManager.getTransaction().isActive()) {
            entityManager.getTransaction().begin();
        }

        if (entity.getId() == null) {
            this.entityManager.persist(entity);
            entityManager.getTransaction().commit();
              entityManager.close();
            return entity;
        } else {
            entityManager.getTransaction().commit();
              entityManager.close();
            return this.entityManager.merge(entity);
        }

    }

    public void edit(T entity) {
        if (!entityManager.getTransaction().isActive()) {
            entityManager.getTransaction().begin();
        }
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    @Override
    public void delete(T entity) {
        if (!entityManager.getTransaction().isActive()) {
            entityManager.getTransaction().begin();
        }
        ensureTransaction();
        entityManager.remove(entityManager.merge(entity));

        entityManager.getTransaction().commit();
        entityManager.close();

    }

    @Override
    public void commit() {
         if (!entityManager.getTransaction().isActive()) {
            entityManager.getTransaction().begin();
        }
        EntityTransaction transaction = this.entityManager.getTransaction();
        if (transaction.isActive()) {
            entityManager.getTransaction().commit();
        }
          entityManager.close();
    }

    protected void ensureTransaction() {
         if (!entityManager.getTransaction().isActive()) {
            entityManager.getTransaction().begin();
        }
        EntityTransaction transaction = this.entityManager.getTransaction();
        if (!transaction.isActive()) {
            transaction.begin();
        }
             entityManager.close();
    }
}
