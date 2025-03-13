package com.keyin.hynes.braden.spring.security.custom.demo.config;
import com.keyin.hynes.braden.spring.security.custom.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
@Configuration
@EnableWebSecurity
public final class SecurityConfig extends WebSecurityConfiguration {
  @Autowired
  private UserService userDetailsService = new UserService();
  @Bean
  public AuthenticationManagerBuilder authenticationManagerBuilder(AuthenticationManagerBuilder auth) throws Exception {
    auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
    return auth;
  }
  @Bean
  public DaoAuthenticationProvider authenticationProvider() {
    return new DaoAuthenticationProvider();
  }
  @Bean
  public BCryptPasswordEncoder passwordEncoder() {
    return new BCryptPasswordEncoder();
  }
}