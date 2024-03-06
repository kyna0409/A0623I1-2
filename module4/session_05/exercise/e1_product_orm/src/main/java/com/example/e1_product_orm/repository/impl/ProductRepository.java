package com.example.e1_product_orm.repository.impl;

import com.example.e1_product_orm.model.Product;
import com.example.e1_product_orm.repository.IProductRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import javax.transaction.Transactional;
import java.util.List;
@Repository
@Transactional
public class ProductRepository implements IProductRepository {
    @PersistenceContext
    EntityManager entityManager;
    @Override
    public List<Product> findAll() {
        TypedQuery<Product> query = entityManager.createQuery("select p from Product p",Product.class);
        return query.getResultList();
    }

    @Override
    public Product findById(Long id) {
        TypedQuery<Product> query = entityManager.createQuery("select p from Product p where p.id =:id", Product.class);
        query.setParameter("id",id);
        try{
            return query.getSingleResult();
        }catch (NoResultException e)
        {
            return null;
        }
    }

    @Override
    public void save(Product product) {
        if(product.getId()!=null)
        {
            entityManager.merge(product);
        }else {
            entityManager.persist(product);
        }
    }

    @Override
    public void remove(Long id) {
        Product product = this.findById(id);
        if(product.getId()!=null)
        {
            entityManager.remove(product);
        }
    }

    @Override
    public List<Product> searchByProducer(String searchTxt) {
        TypedQuery<Product> query = entityManager.createQuery("select p from Product p where p.producer like :producer", Product.class);
        query.setParameter("producer","%" + searchTxt + "%");
        return query.getResultList();
    }

    @Override
    public List<Product> searchByPrice(String searchTxt) {
//        TypedQuery<Product> query = entityManager.createQuery("select p from Product p where p.price like :price", Product.class);
//        query.setParameter("price",searchTxt);
//        return query.getResultList();
        return null;
    }

    @Override
    public List<Product> searchByName(String searchTxt) {
        TypedQuery<Product> query = entityManager.createQuery("select p from Product p where p.name like :name", Product.class);
        query.setParameter("name","%" + searchTxt + "%");

        return query.getResultList();
    }


}
