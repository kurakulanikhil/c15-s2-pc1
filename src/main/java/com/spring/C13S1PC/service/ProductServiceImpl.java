//package com.spring.C13S1PC.service;
//
//import com.spring.C13S1PC.domain.Product;
//import com.spring.C13S1PC.repository.ProductRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class ProductServiceImpl implements IProductService {
//
//    private ProductRepository productRepository;
//
//    @Autowired
//    public ProductServiceImpl(ProductRepository productRepository) {
//        this.productRepository = productRepository;
//    }
//
//    @Override
//    public Product saveProduct(Product product) {
//        return productRepository.save(product);
//    }
//
//    @Override
//    public List<Product> getAllProducts() {
//        return (List<Product>) productRepository.findAll();
//    }
//
//    @Override
//    public String deleteProductByProductId(int productId) {
//        if (productRepository.findById(productId).isEmpty()) {
//            return "product does not exist";
//        } else {
//            productRepository.deleteById(productId);
//            return "product deleted succesfully";
//        }
//    }
//
//    @Override
//    public Product updateProduct(Product product, int productId) {
//        Optional<Product> optionalProduct = productRepository.findById(productId);
//        if (optionalProduct.isEmpty()) {
//            return null;
//        }
//        Product existingProduct = optionalProduct.get();
//        if (product.getProductName() != null) {
//            existingProduct.setProductName(product.getProductName());
//        }
//        if (product.getProductDescriprtion() != null) {
//            existingProduct.setProductDescriprtion(product.getProductDescriprtion());
//        }
//
//        return productRepository.save(existingProduct);
//
//
//
//    }
//
//    @Override
//    public List<Product> getProductByName(String productName) {
//        return productRepository.findByproductName(productName);
//    }
//
//    @Override
//    public Product fetchByproductId(Integer productId) {
//        Optional checkId = productRepository.findById(productId);
//        return checkId.isPresent() ? (Product) checkId.get():null;
//    }
//
//
//}
