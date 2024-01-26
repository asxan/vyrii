package ua.org.vyrii.persistence.entity.user;


import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import ua.org.vyrii.persistence.type.RoleType;

@Getter
@Setter
@Entity
@DiscriminatorValue("ADMIN")
public class Admin extends User{

    public Admin(){
        super();
        this.setAccount(null);
        setRoleType(RoleType.ADMIN);
    }
}
