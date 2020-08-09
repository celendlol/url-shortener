package com.example.celendlol.urlshortener.repositry;

import com.example.celendlol.urlshortener.model.Url;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UrlRepository extends JpaRepository<Url, Long> {
    Url findByName(String name);
}
