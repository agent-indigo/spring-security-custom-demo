package com.keyin.hynes.braden.spring.security.custom.demo.entities;
import com.keyin.hynes.braden.spring.security.custom.demo.abstracts.DataEntity;
import java.util.List;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
@Entity
@Table(name = "users")
@Data
@EqualsAndHashCode(callSuper = true)
public final class UserEntity extends DataEntity implements UserDetails {
  @Column(unique = true)
  private String username;
  private String password;
  private List<GrantedAuthority> authorities;
  private boolean accountNonExpired;
  private boolean accountNonLocked;
  private boolean credentialsNonExpired;
  private boolean enabled;
}