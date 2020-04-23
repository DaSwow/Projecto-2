/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Implementations;

import entities.Product;
import javax.persistence.EntityManager;
import persistence.ProductRepository;

/**
 *
 * @author carls
 */
public class ProductRepositoryImpl<T> extends BaseRepositoryImpl implements ProductRepository {

    public ProductRepositoryImpl(EntityManager em) {
        super( Product.class);

    }

}
