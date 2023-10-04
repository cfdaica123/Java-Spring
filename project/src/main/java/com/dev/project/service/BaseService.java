package com.dev.project.service;

import java.util.List;


public interface BaseService<T, ID> {
    List<T> getAll();

    void save(T object);

    T getByID(ID id);

    void deleteById(ID id);
}
