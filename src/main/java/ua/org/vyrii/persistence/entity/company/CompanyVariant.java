package ua.org.vyrii.persistence.entity.company;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import ua.org.vyrii.persistence.entity.BaseEntity;
import jakarta.validation.constraints.Digits;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table(name = "company_variants")
public class CompanyVariant extends BaseEntity {

    @Column(name = "activity_field", nullable = false)
    private String activityField;

    @Column(name = "type", nullable = false)
    private String type;

    @Column(name = "employees_count", nullable = false)
    private Integer employeesCount;

    @Digits(integer = 9, fraction = 2)
    @Column(nullable = false)
    private BigDecimal capitalization;

    @OneToOne
    private Company company;
}
