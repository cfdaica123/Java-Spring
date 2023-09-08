package edu.pxu.demohello.services;

import java.util.List;

import edu.pxu.demohello.model.Product;

public interface ProductService {
    List<Product> findAll();

    Product findById(int id);

    void save(Product product);
}
