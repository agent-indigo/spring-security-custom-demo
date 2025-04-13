package com.keyin.hynes.braden.spring.security.custom.demo.abstracts;
import java.time.LocalDateTime;
import java.util.UUID;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;
@MappedSuperclass
@Data
public abstract class DataEntity {
  @Id
  private final UUID id = UUID.randomUUID();
  @CreatedDate
  private final LocalDateTime createdAt = LocalDateTime.now();
  @LastModifiedDate
  private LocalDateTime updatedAt = LocalDateTime.now();
}