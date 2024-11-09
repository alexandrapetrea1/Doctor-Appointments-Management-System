package src.Repository;

public interface IRepository<T> {
    void create(T obj);
    T read(int id);
    void update(T obj);
    void delete(int id);
}
