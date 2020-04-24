package persistence;

import entities.BaseEntity;
import entities.Product;
import java.util.ArrayList;

/**
 *
 * @author carls
 * @param <T>
 */
public interface ProductRepository<T extends BaseEntity> {

    Product find(int id);

    void save(Product entity);

    void delete(Product entity);

    void commit();

    void edit(Product entity);

    void ensureTransaction();

    ArrayList<Product> getAll();

}
