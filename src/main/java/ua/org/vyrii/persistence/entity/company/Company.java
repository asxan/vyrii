package ua.org.vyrii.persistence.entity.company;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.YearMonth;
import java.util.HashSet;
import java.util.Set;

import ua.org.vyrii.persistence.entity.BaseEntity;

@Getter
@Setter
@Entity
@Table(name = "companies")
public class Company extends BaseEntity {
    @Column(nullable = false)
    private String name;

    @Column(nullable = false, length = 80192)
    private String description;

    @Column(nullable = false)
    private String owner;

    @Column(name = "founding_year", nullable = false)
    private Integer foundingYear;

    @ManyToMany
    @JoinTable(
            name = "thumbnails",
            joinColumns = @JoinColumn(name = "company_id"),
            inverseJoinColumns = @JoinColumn(name = "company_image_id")
    )
    private Set<CompanyImage> companyImages;

    public Company() {
        this.companyImages = new HashSet<>();
    }
}
