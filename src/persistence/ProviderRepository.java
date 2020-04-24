package persistence;

import entities.BaseEntity;
import entities.Provider;
import java.util.ArrayList;

public interface ProviderRepository<T extends BaseEntity> {

    ArrayList<Provider> getAll();
    
    Provider find(int id);

    void save(Provider entity);

    void delete(Provider entity);

    void commit();

    void edit(Provider entity);

    void ensureTransaction();

}
