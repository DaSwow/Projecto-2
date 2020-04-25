/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence;

import entities.BaseEntity;
import entities.SaleItem;
import java.util.ArrayList;
import javax.persistence.EntityManager;

/**
 *
 * @author carls
 * @param <T>
 */
public interface SaleItemRepository<T extends BaseEntity > extends Repository<SaleItem>{

     @Override
     SaleItem find(int id);

     @Override
     void save(SaleItem entity);

     @Override
     void delete(SaleItem entity);

     @Override
     void commit();

     @Override
     void edit(SaleItem entity);

     @Override
     void ensureTransaction();
     
     @Override
     ArrayList<SaleItem> getAll();
     

}
