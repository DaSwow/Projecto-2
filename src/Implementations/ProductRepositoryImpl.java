/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Implementations;

import entities.Product;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import persistence.ProductRepository;

/**
 *
 * @author carls
 */
public class ProductRepositoryImpl  extends BaseRepository<Product> implements ProductRepository<Product> {

    public ProductRepositoryImpl(EntityManager em) {
        super( Product.class,em);
    }
     
    @Override
    public Product find(int id) {
      return (Product)super.find(id);
    }


    @Override
    public void save(Product entity) {
        super.save(entity);
    }

  
    @Override
    public void delete(Product entity) {
       super.delete(entity);
    }

    
    @Override
    public void commit() {
        super.commit();
    }


    @Override
    public void edit(Product entity) {
        super.edit(entity);
    }

    @Override
    public ArrayList getAll() {
       return super.getAll();
    }
    
    
    
}
