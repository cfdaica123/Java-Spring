package edu.pxu.demohello.repository;

import java.util.List;

import edu.pxu.demohello.model.Product;

public interface ProductRepository {
    List<Product> findAll();

    Product findById(int id);

    void save(Product product);
}
