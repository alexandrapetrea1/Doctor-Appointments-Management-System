package src.Repository;

import src.Model.Identifiable;

import java.util.Map;

public interface IRepository<T> {
    void create(T obj);
    T read(int id);
    void update(T obj);
    void delete(int id);
    Map<Integer,T> getAll();
}
