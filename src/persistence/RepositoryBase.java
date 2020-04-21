package persistence;

import entities.BaseEntity;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public abstract class RepositoryBase<T extends BaseEntity> implements Repository<T> {

    private final EntityManager entityManager;
    private final Class<T> cls;

    public RepositoryBase(EntityManager entityManager, Class cls) {
        this.entityManager = entityManager;
        this.cls = cls;
    }

    @Override
    public T find(int id) {
        return (T) entityManager.find(cls, id);
    }

    @Override
    public T save(T entity) {
        if (entity.getId() == null) {
            this.entityManager.persist(entity);
            return entity;
        } else {
            return this.entityManager.merge(entity);
        }
    }

    @Override
    public void delete(T entity) {
        ensureTransaction();
        entityManager.remove(entityManager.merge(entity));
    }

    @Override
    public void commit() {
        EntityTransaction transaction = this.entityManager.getTransaction();
        if (transaction.isActive()) {
            entityManager.getTransaction().commit();
        }
    }

    protected void ensureTransaction() {
        EntityTransaction transaction = this.entityManager.getTransaction();
        if (!transaction.isActive()) {
            transaction.begin();
        }
    }
}
