/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence;

import entities.BaseEntity;
import entities.SaleItem;
import java.util.ArrayList;

/**
 *
 * @author carls
 * @param <T>
 */
public interface SaleItemRepository<T extends BaseEntity > {

     SaleItem find(int id);

     void save(SaleItem entity);

     void delete(SaleItem entity);

     void commit();

     void edit(SaleItem entity);

     void ensureTransaction();
     
     ArrayList<SaleItem> getAll();
}
