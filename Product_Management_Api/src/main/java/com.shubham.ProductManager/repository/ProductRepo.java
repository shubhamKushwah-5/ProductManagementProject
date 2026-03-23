package com.shubham.ProductManager.repository;

import com.shubham.ProductManager.model.Product;
import com.shubham.ProductManager.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepo extends JpaRepository<Product,Long> {

  List<Product> findByCategory(String category);

  Page<Product> findByCategory(String category,Pageable pageable);

  Page<Product> findAll(Pageable pageable);


}
