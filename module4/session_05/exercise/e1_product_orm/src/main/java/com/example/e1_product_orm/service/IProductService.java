package com.example.e1_product_orm.service;

import com.example.e1_product_orm.model.Product;

import java.util.List;

public interface IProductService extends IGeneralService<Product> {
    List<Product> searchByName(String searchTxt);

    List<Product> searchByPrice(String searchTxt);

    List<Product> searchByProducer(String searchTxt);
}
