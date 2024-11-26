package com.ohgiraffers.jwtrestapi.purchase.repository;

import com.ohgiraffers.jwtrestapi.purchase.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Integer> {

}
