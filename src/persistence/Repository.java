/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence;

import entities.BaseEntity;

/**
 *
 * @author carls
 */
public interface Repository <T extends BaseEntity> {

    T find(int id);

    T save(T entity);

    void delete(T entity);

    void commit();

}
