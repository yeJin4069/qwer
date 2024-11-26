package com.ohgiraffers.jwtrestapi.product.repository;

import com.ohgiraffers.jwtrestapi.product.entity.ProductAndCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductAndCategoryRepository extends JpaRepository<ProductAndCategory, Integer>{

}
