package ua.org.vyrii.persistence.entity.deal;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import ua.org.vyrii.persistence.entity.BaseEntity;
import ua.org.vyrii.persistence.entity.company.CompanyVariant;


@Getter
@Setter
@Entity
@Table(name = "beneficiaries")
public class Beneficiary extends BaseEntity {

    @OneToOne
    private CompanyVariant company;
}
