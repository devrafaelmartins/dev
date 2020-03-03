package com.example.workspace.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.workspace.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>  {

}
