/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence;

import entities.BaseEntity;
import entities.Customer;
import java.util.ArrayList;

/**
 *
 * @author carls
 * @param <T>
 */
public interface CustomerRepository  <T extends BaseEntity> extends Repository<Customer>{

    @Override
    Customer find(int id);

    @Override
    void save(Customer entity);

    @Override
    void delete(Customer entity);

    @Override
    void commit();

    @Override
    void edit(Customer entity);

    @Override
    void ensureTransaction();
    
    @Override
     ArrayList<Customer> getAll();

}
