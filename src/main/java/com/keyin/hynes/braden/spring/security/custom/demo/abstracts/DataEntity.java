package com.keyin.hynes.braden.spring.security.custom.demo.abstracts;
import java.util.UUID;
import org.springframework.data.annotation.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
@MappedSuperclass
public abstract class DataEntity {
  @Id
  @Getter
  private UUID id = UUID.randomUUID();
}