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
public interface SaleRepository<T extends BaseEntity> extends Repository<Sale>{

    public ArrayList<SaleItem> findAllItemSales(int id);

    @Override
     Sale find(int id);

    @Override
     void save(Sale entity);

    @Override
     void delete(Sale entity);

    @Override
     void commit();

    @Override
     void edit(Sale entity);
     
    @Override
     void ensureTransaction();
     
    @Override
     public ArrayList<Sale> getAll();
     
     

}
