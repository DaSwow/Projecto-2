
package persistence;

import entities.SaleItem;
import java.util.ArrayList;

/**
 *
 * @author carls
 * @param <T>
 */
public interface SaleRepository  <T extends Repository> {
    
     public ArrayList<SaleItem> findAllItemSales(int id);
    
    
    
}
