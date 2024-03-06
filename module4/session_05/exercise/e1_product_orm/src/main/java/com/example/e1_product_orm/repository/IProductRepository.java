package com.example.e1_product_orm.repository;

import com.example.e1_product_orm.model.Product;

import java.util.List;

public interface IProductRepository extends IGeneralRepository<Product> {
    List<Product> searchByProducer(String searchTxt);

    List<Product> searchByPrice(String searchTxt);

    List<Product> searchByName(String searchTxt);
}
