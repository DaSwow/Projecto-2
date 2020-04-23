/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Implementations;

import entities.Provider;
import javax.persistence.EntityManager;
import persistence.ProviderRepository;

/**
 *
 * @author carls
 */
public class ProviderRepositoryImpl <T> extends BaseRepositoryImpl implements ProviderRepository {

    public ProviderRepositoryImpl(EntityManager entityManager) {
        super(entityManager, Provider.class);
    }
    
    
}
