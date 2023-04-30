package com.nandoamori.course.repository;

import com.nandoamori.course.entities.Category;
import com.nandoamori.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
