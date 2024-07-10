package com.generation.gamestore.repositories;

import com.generation.gamestore.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
