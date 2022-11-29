package com.spring.C13S1PC.service;

import com.spring.C13S1PC.domain.Product;

import java.util.List;

public interface IProductService {

    Product saveProduct(Product product) ;
    List<Product> getAllProducts();
    String deleteProductByProductId(int productId);
    public Product updateProduct(Product product,int productId);
    List<Product> getProductByName(String productName);
    public Product fetchByproductId(Integer productId);

}
