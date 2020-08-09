package com.example.celendlol.urlshortener.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;

@Entity
@Table(name="user")
public class User {

    @Id
    private Long id;
    private String name;
    private String email;

    @OneToMany
    private Set<Url> url;

    public User() {}

    public User(Long id, String name, String email, Set<Url> url) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.url = url;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Set<Url> getUrl() {
        return url;
    }

    public void setUrl(Set<Url> url) {
        this.url = url;
    }
}
