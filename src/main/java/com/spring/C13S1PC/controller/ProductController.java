//package com.spring.C13S1PC.controller;
//
//import com.spring.C13S1PC.domain.Product;
//import com.spring.C13S1PC.exception.ProductAlreadyExistException;
//import com.spring.C13S1PC.exception.ProductNotFoundException;
//import com.spring.C13S1PC.service.IProductService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/api/v2")
//public class ProductController {
//
//    private IProductService productService;
//
//    @Autowired
//    public ProductController(IProductService productService) {
//        this.productService = productService;
//    }
//
//    @GetMapping("/products")
//    public ResponseEntity<?> getAllProduct(){
//        return new ResponseEntity<>(productService.getAllProducts(), HttpStatus.OK);
//    }
//
//    @GetMapping("/products/{productName}")
//
//    public ResponseEntity<?> getUseersByName(@PathVariable String productName){
//        return new ResponseEntity<>(productService.getProductByName(productName),HttpStatus.FOUND);
//    }
//
//    @GetMapping("/product/{productId}")
//    public ResponseEntity<?> getProduct(@PathVariable Integer productId)
//    {
//        Product product = productService.fetchByproductId(productId);
//        if(product == null)
//        {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }else
//            return new ResponseEntity<>(product,HttpStatus.FOUND);
//    }
//
//
//
//    @PostMapping("/products")
//
//    public ResponseEntity<?> saveProduct(@RequestBody Product product) throws ProductAlreadyExistException {
//        return new ResponseEntity<>(productService.saveProduct(product),HttpStatus.CREATED);
//    }
//
//    @PutMapping("/products/{productId}")
//    public ResponseEntity<?> updateProduct(@RequestBody Product product,@PathVariable int productId){
//        return new ResponseEntity<>(productService.updateProduct(product,productId),HttpStatus.CREATED);
//    }
//
//    @DeleteMapping("/products/{productId}")
//    public ResponseEntity<?> deleteProduct(@PathVariable int productId) throws ProductNotFoundException {
//        return new ResponseEntity<>(productService.deleteProductByProductId(productId),HttpStatus.OK);
//    }
//}
