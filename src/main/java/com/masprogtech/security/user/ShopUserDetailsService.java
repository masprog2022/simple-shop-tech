package com.masprogtech.security.user;

import com.masprogtech.entities.User;
import com.masprogtech.repositories.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ShopUserDetailsService implements UserDetailsService {

    private final UserRepository userRepository;

    public ShopUserDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        //User user = userRepository.findByEmail(email).orElseThrow(() -> new UsernameNotFoundException("User not found"));
        User user = Optional.ofNullable(userRepository.findByEmail(email)).orElseThrow(() -> new UsernameNotFoundException("User not found!"));
        return ShopUserDetails.buildUserDetails(user);
    }
}
