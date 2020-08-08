package com.example.celendlol.urlshortener.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Data
@Table(name="url")
public class Url {

    @Id
    private Long id;

    @NonNull
    private String name;

    @ManyToOne(cascade= CascadeType.PERSIST)
    private User user;
}
