package com.example.celendlol.urlshortener.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Data
@Table(name="url")
public class Url {

    @Id
    private Long id;
    private String name;

    @ManyToOne(cascade= CascadeType.PERSIST)
    private User user;
}
