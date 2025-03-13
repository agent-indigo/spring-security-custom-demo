package com.keyin.hynes.braden.spring.security.custom.demo.entities;
import com.keyin.hynes.braden.spring.security.custom.demo.abstracts.DataEntity;
import java.util.List;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Entity
@Table(name = "users")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public final class UserEntity extends DataEntity implements UserDetails {
  @Column(unique = true)
  private String username;
  private String password;
  private List<GrantedAuthority> authorities;
}