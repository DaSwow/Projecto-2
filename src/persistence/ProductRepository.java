package persistence;

import entities.BaseEntity;
import entities.Product;
import java.util.ArrayList;

/**
 *
 * @author carls
 * @param <T>
 */
public interface ProductRepository <T extends BaseEntity> extends Repository<Product> {

    @Override
    Product find(int id);

    @Override
    void save(Product entity);

    @Override
    void delete(Product entity);

    @Override
    void commit();

    @Override
    void edit(Product entity);

    @Override
    void ensureTransaction();

    @Override
    ArrayList<Product> getAll();

}
