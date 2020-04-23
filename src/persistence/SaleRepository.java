
package persistence;

import entities.SaleItem;
import java.util.ArrayList;

/**
 *
 * @author carls
 * @param <T>
 */
public interface SaleRepository  <T extends BaseRepositoryImpl> {
    
     public ArrayList<SaleItem> findAllItemSales(int id);
    
    
    
}
