package com.masprogtech.repositories;

import com.masprogtech.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Long, Product> {
}
