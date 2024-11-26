package com.ohgiraffers.jwtrestapi.review.repository;

import com.ohgiraffers.jwtrestapi.review.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, Integer> {

	/* 설명. count는 반환형이 long이다. */
	long countByProductCode(int productCode);

}
