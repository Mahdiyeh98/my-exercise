package com.mahdiyeh.dss.sales.dao;

import com.mahdiyeh.dss.sales.model.Product;

import java.util.List;

public interface ProductDAO {
    List<Product> findAllProducts();
    Product getProductById(int id);
    void insertProduct(Product product);
    void updateProduct(Product product);
    void deleteProduct(Product product);

}
