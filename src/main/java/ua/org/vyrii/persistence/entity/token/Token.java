package ua.org.vyrii.persistence.entity.token;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import ua.org.vyrii.persistence.entity.BaseEntity;
import ua.org.vyrii.persistence.entity.user.User;

@Getter
@Setter
@Entity
@Table(name = "tokens")
public class Token extends BaseEntity {

    @Column(unique = true, nullable = false)
    private String token;

    @Column(nullable = false)
    public Boolean expired;

    @ManyToOne
    public User user;

    public Token(){

    }
}
