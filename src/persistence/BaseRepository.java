package persistence;

import entities.BaseEntity;
import java.util.ArrayList;
import java.util.Arrays;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

public class BaseRepository<T extends BaseEntity> implements Repository<T> {

    private final EntityManager entityManager;
    private final Class<T> cls;

    public BaseRepository(EntityManager entityManager, Class cls) {
        this.entityManager = entityManager;
        this.cls = cls;
    }

  public ArrayList<T> getAll(Class<T> entityClass) {
     Query query = entityManager.createQuery("from " + entityClass.getName() +" c");
     
    ArrayList lista=new ArrayList(query.getResultList());
return lista;
}

    @Override
    public T find(int id) {
        return (T) entityManager.find(cls, id);
    }

    @Override
    public T save(T entity) {
        if(!entityManager.getTransaction().isActive())
        entityManager.getTransaction().begin();
   
        if (entity.getId() == null) {
            this.entityManager.persist(entity);
             entityManager.getTransaction().commit();
            return entity;
        } else {
             entityManager.getTransaction().commit();
            return this.entityManager.merge(entity);
        }
        
    }

    public void edit(T entity){
    entityManager.getTransaction().begin();
    
    
    
     entityManager.getTransaction().commit();
    }
    
    @Override
    public void delete(T entity) {
        entityManager.getTransaction().begin();
        
        
        ensureTransaction();
        entityManager.remove(entityManager.merge(entity));
        
        entityManager.getTransaction().commit();
             
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
