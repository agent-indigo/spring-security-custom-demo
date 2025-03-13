package com.keyin.hynes.braden.spring.security.custom.demo.services;
import com.keyin.hynes.braden.spring.security.custom.demo.interfaces.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
@Service
public final class UserService implements UserDetailsService {
  @Autowired
  private UserRepository repo;
  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    return repo.findByUsername(username);
  }
}