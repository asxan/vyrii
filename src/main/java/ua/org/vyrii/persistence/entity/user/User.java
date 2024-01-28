//package ua.org.vyrii.persistence.entity.user;
//
//import jakarta.persistence.*;
//import lombok.Getter;
//import lombok.Setter;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//import ua.org.vyrii.persistence.entity.BaseEntity;
//import ua.org.vyrii.persistence.type.RoleType;
//
//import java.util.Collection;
//
//@Getter
//@Setter
//@Entity
//@Table(name = "users")
//public class User extends BaseEntity implements UserDetails {
//
//    @Column(unique = true, nullable = false)
//    private String login;
//
//    @Column(nullable = false)
//    private String password;
//
//    @Column(name = "first_name",  nullable = false)
//    private String firstName;
//
//    @Column(name = "last_name",  nullable = false)
//    private String lastName;
//
//    @Column(name = "account_non_expired", nullable = false)
//    private Boolean accountNonExpired;
//
//    @Column(name = "account_non_locked", nullable = false)
//    private Boolean accountNonLocked;
//
//    @Column(name = "credentials_non_expired", nullable = false)
//    private Boolean credentialsNonExpired;
//
//    @Column(name = "enabled", nullable = false)
//    private Boolean enabled;
//
//    @Enumerated(EnumType.STRING)
//    @Column(name = "role_type", nullable = false)
//    private RoleType roleType;
//
//    @OneToOne
//    private Account account;
//
//    @Override
//    public Collection<? extends GrantedAuthority> getAuthorities() {
//        return roleType.getAuthorities();
//    }
//
//    @Override
//    public String getUsername() {
//        return login;
//    }
//
//    @Override
//    public boolean isAccountNonExpired() {
//        return accountNonExpired;
//    }
//
//    @Override
//    public boolean isAccountNonLocked() {
//        return accountNonLocked;
//    }
//
//    @Override
//    public boolean isCredentialsNonExpired() {
//        return credentialsNonExpired;
//    }
//
//    @Override
//    public boolean isEnabled() {
//        return enabled;
//    }
//
//    public User() {
//        this.accountNonLocked = true;
//        this.accountNonExpired = true;
//        this.credentialsNonExpired = true;
//        this.enabled = true;
//    }
//}