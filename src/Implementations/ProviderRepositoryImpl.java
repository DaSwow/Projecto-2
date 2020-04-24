/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Implementations;

import entities.Provider;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import persistence.ProviderRepository;

/**
 *
 * @author carls
 */
public class ProviderRepositoryImpl extends BaseRepository<Provider> implements ProviderRepository<Provider> {

    public ProviderRepositoryImpl(EntityManager em) {
        super( Provider.class,em);
    }
    
     
    @Override
    public Provider find(int id) {
      return (Provider)super.find(id);
    }


    @Override
    public void save(Provider entity) {
        super.save(entity);
    }

  
    @Override
    public void delete(Provider entity) {
       super.delete(entity);
    }

    
    @Override
    public void commit() {
        super.commit();
    }


    @Override
    public void edit(Provider entity) {
        super.edit(entity);
    }

   
    @Override
    public ArrayList getAll() {
      return super.getAll();
    }
    
}
