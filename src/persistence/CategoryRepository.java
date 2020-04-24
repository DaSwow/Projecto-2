package persistence;

import entities.BaseEntity;
import entities.Category;
import java.util.ArrayList;

/**
 *
 * @author carls
 * @param <T>
 */
public interface CategoryRepository <T extends BaseEntity> extends Repository<Category>{

    @Override
    Category find(int id);

    @Override
    void save(Category entity);

    @Override
    void delete(Category entity);

    @Override
    void commit();

    @Override
    void edit(Category entity);

    @Override
    void ensureTransaction();

    @Override
    ArrayList<Category> getAll();

}
