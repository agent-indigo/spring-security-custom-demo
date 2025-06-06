package com.keyin.hynes.braden.spring.security.custom.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
@ComponentScan(basePackages = {
  "com.keyin.hynes.braden.spring.security.custom.demo.config",
  "com.keyin.hynes.braden.spring.security.custom.demo.entities",
  "com.keyin.hynes.braden.spring.security.custom.demo.interfaces.repositories",
  "com.keyin.hynes.braden.spring.security.custom.demo.services"
})
public class App {
  public static void main(String[] args) {
    SpringApplication.run(
      App.class,
      args
    );
  }
}