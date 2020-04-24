/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Implementations;

import entities.SaleItem;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import persistence.SaleItemRepository;

/**
 *
 * @author carls
 */
public class SaleItemRepositoryImpl extends BaseRepository<SaleItem> implements SaleItemRepository<SaleItem> {

    public SaleItemRepositoryImpl(EntityManager em) {
        super(SaleItem.class,em);

    }

    @Override
    public SaleItem find(int id) {
        return (SaleItem) super.find(id);
    }

    @Override
    public void save(SaleItem entity) {
        super.save(entity);
    }

    @Override
    public void delete(SaleItem entity) {
        super.delete(entity);
    }

    @Override
    public void commit() {
        super.commit();
    }

    @Override
    public void edit(SaleItem entity) {
        super.edit(entity);
    }

    @Override
    public ArrayList getAll() {
        return super.getAll();
    }

}
