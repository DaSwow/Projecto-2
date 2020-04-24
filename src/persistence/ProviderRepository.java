package persistence;

import entities.BaseEntity;
import entities.Provider;
import java.util.ArrayList;

public interface ProviderRepository<T extends BaseEntity> extends Repository<Provider>{

    @Override
    ArrayList<Provider> getAll();
    
    @Override
    Provider find(int id);

    @Override
    void save(Provider entity);

    @Override
    void delete(Provider entity);

    @Override
    void commit();

    @Override
    void edit(Provider entity);

    @Override
    void ensureTransaction();

}
