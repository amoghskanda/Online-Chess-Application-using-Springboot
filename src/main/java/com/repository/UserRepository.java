package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.model.users;

@Repository
public interface UserRepository extends JpaRepository<users, Long>{

    users findByUsername(String username);
}
    

