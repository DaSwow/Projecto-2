package persistence;

import entities.BaseEntity;
import entities.Sale;
import entities.SaleItem;
import java.util.ArrayList;

/**
 *
 * @author carls
 * @param <T>
 */
public interface SaleRepository<T extends BaseEntity> {

    public ArrayList<SaleItem> findAllItemSales(int id);

     Sale find(int id);

     void save(Sale entity);

     void delete(Sale entity);

     void commit();

     void edit(Sale entity);
     
     void ensureTransaction();
     
     public ArrayList<Sale> getAll();
     
     

}
