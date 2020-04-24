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
public interface CustomerRepository<T extends BaseEntity> {

    Customer find(int id);

    void save(Customer entity);

    void delete(Customer entity);

    void commit();

    void edit(Customer entity);

    void ensureTransaction();
    
       ArrayList<T> getAll();

}
