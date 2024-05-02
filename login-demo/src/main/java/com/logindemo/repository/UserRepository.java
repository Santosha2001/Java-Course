package com.logindemo.repository;

import com.logindemo.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {

    @Query(value = "select * from user where email = ?1", nativeQuery = true)
    Optional<UserEntity> findByEmail(String email);
}
