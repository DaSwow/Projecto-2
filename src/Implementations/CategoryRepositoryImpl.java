/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Implementations;

import entities.Category;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import persistence.CategoryRepository;

/**
 *
 * @author carls
 */
public class CategoryRepositoryImpl <T> extends BaseRepository implements CategoryRepository {

    public CategoryRepositoryImpl(EntityManager entityManager) {
        super(Category.class);
    }

    @Override
    public Category find(int id) {
        return (Category) super.find(id);
    }

    @Override
    public void save(Category entity) {
        super.save(entity);
    }

    @Override
    public void delete(Category entity) {
        super.delete(entity);
    }

    @Override
    public void commit() {
        super.commit();
    }

    @Override
    public void edit(Category entity) {
        super.edit(entity);
    }
    
    @Override
    public void ensureTransaction(){
    super.ensureTransaction();
    }

    @Override
    public ArrayList getAll() {
       return super.getAll(Category.class);
    }

}
