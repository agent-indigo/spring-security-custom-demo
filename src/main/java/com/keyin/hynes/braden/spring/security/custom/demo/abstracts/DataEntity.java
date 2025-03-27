package com.keyin.hynes.braden.spring.security.custom.demo.abstracts;
import java.util.UUID;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;
@MappedSuperclass
@Data
public abstract class DataEntity {
  @Id
  private final UUID id = UUID.randomUUID();
}