package com.example.celendlol.urlshortener.repositry;

import com.example.celendlol.urlshortener.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(exported = false)
public interface UserRepository extends JpaRepository<User, Long> {

    User save(User user);

    User findByUsername(String Username);
}
