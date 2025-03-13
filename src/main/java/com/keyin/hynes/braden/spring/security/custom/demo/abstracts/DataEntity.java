package com.keyin.hynes.braden.spring.security.custom.demo.abstracts;
import java.util.UUID;
import org.springframework.data.annotation.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.EqualsAndHashCode;
import lombok.ToString;
@MappedSuperclass
@EqualsAndHashCode
@ToString
public abstract class DataEntity {
  @Id
  private UUID id;
  public DataEntity() {
    id = UUID.randomUUID();
  }
  public final UUID getId() {
    return id;
  }
}