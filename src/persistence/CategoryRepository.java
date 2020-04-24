package persistence;

import entities.BaseEntity;
import entities.Category;
import java.util.ArrayList;

/**
 *
 * @author carls
 * @param <T>
 */
public interface CategoryRepository<T extends BaseEntity> {

    Category find(int id);

    void save(Category entity);

    void delete(Category entity);

    void commit();

    void edit(Category entity);

    void ensureTransaction();

    ArrayList<T> getAll();
}
