package com.keyin.hynes.braden.spring.security.custom.demo.interfaces.repositories;
import com.keyin.hynes.braden.spring.security.custom.demo.entities.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.UUID;
@Repository
public interface UserRepository extends CrudRepository<UserEntity, UUID> {
  UserEntity findByUsername(String username);
}