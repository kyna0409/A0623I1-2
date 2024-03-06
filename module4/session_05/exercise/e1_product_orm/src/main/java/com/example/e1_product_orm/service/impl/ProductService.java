package com.example.e1_product_orm.service.impl;

import com.example.e1_product_orm.model.Product;
import com.example.e1_product_orm.repository.IProductRepository;
import com.example.e1_product_orm.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
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
    public Product findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public void save(Product product) {
        repository.save(product);
    }

    @Override
    public void remove(Long id) {
        repository.remove(id);
    }

    @Override
    public List<Product> searchByName(String searchTxt) {
        return repository.searchByName(searchTxt);
    }

    @Override
    public List<Product> searchByPrice(String searchTxt) {
        return repository.searchByPrice(searchTxt);
    }

    @Override
    public List<Product> searchByProducer(String searchTxt) {
        return repository.searchByProducer(searchTxt);
    }
}
