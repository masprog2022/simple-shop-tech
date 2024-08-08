package com.masprogtech.services.product;

import com.masprogtech.entities.Product;

import java.util.List;

public interface IProductService {

    Product addProduct(Product product);
    List<Product> getAllProducts();
    Product getProductById(Long id);
    void deleteProductByID(Long id);
    void updateProduct(Product product, Long productId);
    List<Product> getProductsByCategoryId(Long categoryId);
    List<Product> getProductsByBrand(String brand);
    List<Product> getProductsByCategoryAndBrand(String category, String brand);
    List<Product> getProductsByName(String name);
    List<Product> getProductsByBrandAndName(String category, String name);
    Long countProductsByBrandAndName(String brand, String name);

}
