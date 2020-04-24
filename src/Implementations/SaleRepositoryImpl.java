package Implementations;

import entities.Sale;
import entities.SaleItem;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import persistence.SaleRepository;

/**
 *
 * @author carls
 */
public class SaleRepositoryImpl extends BaseRepository<Sale> implements SaleRepository {

  

    public SaleRepositoryImpl(EntityManager em) {
       super(Sale.class);
    }

 

    @Override
    public ArrayList<SaleItem> findAllItemSales(int id) {

        ArrayList<SaleItem> saleItems = new ArrayList();

        BaseRepository brsi = new SaleRepositoryImpl(this.getEntityManager());
        ArrayList<SaleItem> saleItemsSinFiltrar = brsi.getAll(SaleItem.class);

        for (int i = 0; i < saleItemsSinFiltrar.size(); i++) {
            if (saleItemsSinFiltrar.get(i).getSaleId() == id) {
                saleItems.add(saleItemsSinFiltrar.get(i));
            }
        }
        return saleItems;
    }
    
     
    @Override
    public Sale find(int id) {
      return (Sale)super.find(id);
    }


    @Override
    public void save(Sale entity) {
        super.save(entity);
    }

  
    @Override
    public void delete(Sale entity) {
       super.delete(entity);
    }

    
    @Override
    public void commit() {
        super.commit();
    }


    @Override
    public void edit(Sale entity) {
        super.edit(entity);
    }

    @Override
    public ArrayList getAll() {
        return super.getAll(Sale.class);
    }
    
    
    
    

}
