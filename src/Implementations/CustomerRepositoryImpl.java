
package Implementations;

import entities.Customer;
import javax.persistence.EntityManager;
import persistence.CustomerRepository;


public class CustomerRepositoryImpl <T> extends BaseRepositoryImpl implements CustomerRepository  {

    
    public CustomerRepositoryImpl(EntityManager entityManager) {
        super(entityManager, Customer.class);
    }
    
    
    
    
    
    
}
