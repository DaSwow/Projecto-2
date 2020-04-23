package Implementations;

import Implementations.BaseRepositoryImpl;
import entities.Sale;
import entities.SaleItem;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import persistence.SaleRepository;

/**
 *
 * @author carls
 * @param <T>
 * @param <BaseRepositoryImpl>
 */
public class SaleRepositoryImpl<T> extends BaseRepositoryImpl implements SaleRepository {

  

    public SaleRepositoryImpl(EntityManager em) {
       super(em,Sale.class);
    }

 

    public ArrayList<SaleItem> findAllItemSales(int id) {

        ArrayList<SaleItem> saleItems = new ArrayList();

        BaseRepositoryImpl brsi = new SaleRepositoryImpl(super.getEntityManager());
        ArrayList<SaleItem> saleItemsSinFiltrar = brsi.getAll(Sale.class);

        for (int i = 0; i < saleItemsSinFiltrar.size(); i++) {
            if (saleItemsSinFiltrar.get(i).getSaleId() == id) {
                saleItems.add(saleItemsSinFiltrar.get(i));
            }
        }
        return saleItems;
    }

}
