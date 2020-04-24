
package Implementations;

import entities.Customer;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import persistence.CustomerRepository;


public class CustomerRepositoryImpl extends BaseRepository<Customer> implements CustomerRepository  {

    
    public CustomerRepositoryImpl(EntityManager entityManager) {
        super(Customer.class);
    }
    
     
    @Override
    public Customer find(int id) {
      return (Customer)super.find(id);
    }


    @Override
    public void save(Customer entity) {
        super.save(entity);
    }

  
    @Override
    public void delete(Customer entity) {
       super.delete(entity);
    }

    
    @Override
    public void commit() {
        super.commit();
    }


    @Override
    public void edit(Customer entity) {
        super.edit(entity);
    }
    
    @Override
    public void ensureTransaction(){
    super.ensureTransaction();
    }

    @Override
    public ArrayList getAll() {
        return super.getAll(Customer.class);
    }
    
    
}
