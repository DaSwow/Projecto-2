/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence;

import entities.BaseEntity;
import entities.Sale;
import entities.SaleItem;
import java.util.ArrayList;
import javax.persistence.EntityManager;

/**
 *
 * @author carls
 */
public class SaleRepositoryImpl<T extends BaseEntity> implements SaleRepository  {

    EntityManager em;
    Class cls=SaleItem.class;

    public SaleRepositoryImpl(EntityManager em) {

        this.em = em;
    }

    
    public ArrayList<SaleItem> findAllItemSales(int id) {

        ArrayList<SaleItem> saleItems = new ArrayList();

        BaseRepositoryImpl brsi = new BaseRepositoryImpl(em, cls);
        ArrayList<SaleItem> saleItemsSinFiltrar = brsi.getAll(cls);

        for (int i = 0; i < saleItemsSinFiltrar.size(); i++) {
            if(saleItemsSinFiltrar.get(i).getSaleId()==id){
            saleItems.add(saleItemsSinFiltrar.get(i));
            }
        }
        return saleItems;
    }

}
