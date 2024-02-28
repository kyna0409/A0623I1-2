package com.example.uploadfile.service.impl;

import com.example.uploadfile.model.Product;
import com.example.uploadfile.repository.IProductRepository;
import com.example.uploadfile.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductService implements IProductService {
    @Autowired
    private IProductRepository repository;
    @Override
    public List<Product> findAll() {
        return repository.findAll();
    }

    @Override
    public void save(Product product) {
        repository.save(product);
    }

    @Override
    public Product findById(int id) {
        return repository.findById(id);
    }

    @Override
    public void update(int id, Product product) {
        repository.update(id,product);
    }

    @Override
    public void remove(int id) {
        repository.remove(id);
    }
}
