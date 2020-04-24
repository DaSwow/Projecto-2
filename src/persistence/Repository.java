/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence;

import java.util.ArrayList;

/**
 *
 * @author carls
 */
public interface Repository<T> {

    T find(int id);

    void save(T entity);

    void delete(T entity);

    void commit();

    void edit(T entity);

    void ensureTransaction();

    ArrayList<T> getAll();

}
