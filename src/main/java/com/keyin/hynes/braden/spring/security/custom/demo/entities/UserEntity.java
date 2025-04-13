package com.keyin.hynes.braden.spring.security.custom.demo.entities;
import com.keyin.hynes.braden.spring.security.custom.demo.abstracts.DataEntity;
import java.util.List;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
@Entity
@Table(name = "users")
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public final class UserEntity extends DataEntity implements UserDetails {
  @Column(unique = true)
  private String username;
  private String password;
  @Column(columnDefinition = "text[]")
  private List<SimpleGrantedAuthority> authorities;
  private boolean accountNonExpired;
  private boolean accountNonLocked;
  private boolean credentialsNonExpired;
  private boolean enabled;
}