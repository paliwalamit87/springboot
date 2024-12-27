package com.paliwal.demo1.repository;

import com.paliwal.demo1.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product, Integer> {
}
