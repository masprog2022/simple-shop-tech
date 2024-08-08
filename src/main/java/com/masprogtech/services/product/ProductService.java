package com.masprogtech.services.product;

import com.masprogtech.entities.Product;

import java.util.List;

public class ProductService implements IProductService {
    @Override
    public Product addProduct(Product product) {
        return null;
    }

    @Override
    public List<Product> getAllProducts() {
        return null;
    }

    @Override
    public Product getProductById(Long id) {
        return null;
    }

    @Override
    public void deleteProductByID(Long id) {

    }

    @Override
    public void updateProduct(Product product, Long productId) {

    }

    @Override
    public List<Product> getProductsByCategoryId(Long categoryId) {
        return null;
    }

    @Override
    public List<Product> getProductsByBrand(String brand) {
        return null;
    }

    @Override
    public List<Product> getProductsByCategoryAndBrand(String category, String brand) {
        return null;
    }

    @Override
    public List<Product> getProductsByName(String name) {
        return null;
    }

    @Override
    public List<Product> getProductsByBrandAndName(String category, String name) {
        return null;
    }

    @Override
    public Long countProductsByBrandAndName(String brand, String name) {
        return null;
    }
}
