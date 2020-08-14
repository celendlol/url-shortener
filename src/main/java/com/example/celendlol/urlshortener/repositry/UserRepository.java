package com.example.celendlol.urlshortener.repositry;

import com.example.celendlol.urlshortener.model.User;
import org.springframework.data.repository.Repository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Optional;

@RepositoryRestResource(exported = false)
public interface UserRepository extends Repository<User, Long> {

    User findByUsername(String userName);

    User save(User user);
}
