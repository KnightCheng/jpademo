package com.example.demo.Service;

import java.util.List;

public interface BaseService<T> {
    public List<T> getList();

    public T findById(long id);


    public void save(T t);

    public void edit(T t);

    public void delete(long id);
}
