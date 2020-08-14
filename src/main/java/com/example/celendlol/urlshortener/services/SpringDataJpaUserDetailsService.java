package com.example.celendlol.urlshortener.services;

import com.example.celendlol.urlshortener.model.User;
import com.example.celendlol.urlshortener.repositry.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Component
public class SpringDataJpaUserDetailsService implements UserDetailsService {

    private final UserRepository repository;

    @Autowired
    public SpringDataJpaUserDetailsService(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = this.repository.findByUsername(username);

        return new User(user.getUsername(), user.getPassword(), user.getEmail(),
                AuthorityUtils.createAuthorityList(user.getRoles()), user.getUrls());
    }
}
