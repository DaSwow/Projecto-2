/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Implementations;

import entities.Category;
import javax.persistence.EntityManager;
import persistence.ProductRepository;

/**
 *
 * @author carls
 */
public class CategoryRepositoryImpl<T> extends BaseRepositoryImpl implements ProductRepository {

    public CategoryRepositoryImpl(EntityManager entityManager) {
        super(entityManager, Category.class);
    }
    
    
}
