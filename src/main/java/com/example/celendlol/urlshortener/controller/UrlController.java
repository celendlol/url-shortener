package com.example.celendlol.urlshortener.controller;

import javax.validation.Valid;

import com.example.celendlol.urlshortener.model.Url;
import com.example.celendlol.urlshortener.repositry.UrlRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class UrlController {

    private UrlRepository urlRepository;

    public UrlController(UrlRepository urlRepository) {
        super();
        this.urlRepository = urlRepository;
    }

    @GetMapping("/urls")
    Collection<Url> urls(){
        return urlRepository.findAll();
    }

    @GetMapping("/url/{id}")
    ResponseEntity<?> getCategory(@PathVariable Long id){
        Optional<Url> url = urlRepository.findById(id);
        return url.map(response -> ResponseEntity.ok().body(response))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/url")
    ResponseEntity<Url> createUrl(@Valid @RequestBody Url url) throws URISyntaxException {
        Url result = urlRepository.save(url);
        return ResponseEntity.created(new URI("/api/url" + result.getId())).body(result);
    }
}
