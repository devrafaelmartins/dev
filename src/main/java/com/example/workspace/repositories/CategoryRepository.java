package com.example.workspace.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.workspace.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>  {

}
