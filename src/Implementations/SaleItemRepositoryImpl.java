/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Implementations;

import entities.SaleItem;
import javax.persistence.EntityManager;
import persistence.SaleItemRepository;

/**
 *
 * @author carls
 */
public class SaleItemRepositoryImpl <T> extends BaseRepositoryImpl implements SaleItemRepository{
    
       public SaleItemRepositoryImpl(EntityManager em) {
        super(em, SaleItem.class);

    }
    
}
