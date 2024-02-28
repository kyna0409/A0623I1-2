package com.example.uploadfile.repository.impl;

import com.example.uploadfile.model.Product;
import com.example.uploadfile.repository.IProductRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository

public class ProductRepository implements IProductRepository {
    @Override
    public List<Product> findAll() {
        return null;
    }

    @Override
    public void save(Product product) {

    }

    @Override
    public Product findById(int id) {
        return null;
    }

    @Override
    public void update(int id, Product product) {

    }

    @Override
    public void remove(int id) {

    }
}
