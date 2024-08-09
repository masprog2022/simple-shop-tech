package com.masprogtech.services.product;

import com.masprogtech.entities.Product;
import com.masprogtech.request.AddProductRequest;
import com.masprogtech.request.ProductUpdateRequest;

import java.util.List;

public interface IProductService {

    Product addProduct(AddProductRequest product);
    List<Product> getAllProducts();
    Product getProductById(Long id);
    void deleteProductByID(Long id);
    Product updateProduct(ProductUpdateRequest product, Long productId);
    List<Product> getProductsByCategory(String category);
    List<Product> getProductsByBrand(String brand);
    List<Product> getProductsByCategoryAndBrand(String category, String brand);
    List<Product> getProductsByName(String name);
    List<Product> getProductsByBrandAndName(String category, String name);
    Long countProductsByBrandAndName(String brand, String name);

}
