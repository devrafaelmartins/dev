package com.example.workspace.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.workspace.entities.User;

public interface UserRepository extends JpaRepository<User, Long>  {

}
