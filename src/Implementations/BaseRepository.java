package Implementations;

import entities.BaseEntity;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import persistence.Repository;

public abstract class BaseRepository <T extends BaseEntity> implements Repository<T> {


      EntityManager em ;
      Class cls;

    public BaseRepository(Class cls, EntityManager em) {
        this.em=em;
        this.cls = cls;
    }


    @Override
    public ArrayList<T> getAll() {
      
        Query query = em.createQuery("from " + cls.getName()  + " c");

        ArrayList lista = new ArrayList(query.getResultList());
       
        return lista;
    }

    
    @Override
    public T find(int id) {
        ensureTransaction();
        T t = (T) em.find(cls, id);
       
        return t;
    }

    
    @Override
    public void save(T entity) {
        ensureTransaction();
        if (entity.getId() == null) {
            this.em.persist(entity);
            em.getTransaction().commit();
         

        } else {
            em.getTransaction().commit();
            this.em.merge(entity);
            

        }

    }


    @Override
    public void edit(T entity) {
        ensureTransaction();
        em.merge(entity);
        em.getTransaction().commit();
    ;
    }


    @Override
    public void delete(T entity) {
        ensureTransaction();

        em.remove(em.merge(entity));

        em.getTransaction().commit();
  

    }

 
    @Override
    public void commit() {
        ensureTransaction();
        EntityTransaction transaction = this.em.getTransaction();
        if (transaction.isActive()) {
            em.getTransaction().commit();
        
        }

    }

  
    @Override
    public void ensureTransaction() {
     

        if (!em.getTransaction().isActive()) {
            em.getTransaction().begin();
        }
        EntityTransaction transaction = this.em.getTransaction();
        if (!transaction.isActive()) {
            transaction.begin();
        }

    }

}
