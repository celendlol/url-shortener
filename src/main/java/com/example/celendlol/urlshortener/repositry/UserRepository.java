package com.example.celendlol.urlshortener.repositry;

import com.example.celendlol.urlshortener.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
