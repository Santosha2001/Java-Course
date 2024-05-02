package com.logindemo.configuration;

import com.logindemo.entity.UserEntity;
import com.logindemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.Optional;

public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

        Optional<UserEntity> user = userRepository.findByEmail(email);

        return user.map(UserDetailsImpl::new).orElseThrow(() -> new UsernameNotFoundException("User not found."));
    }
}
