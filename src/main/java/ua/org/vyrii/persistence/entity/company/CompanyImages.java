package ua.org.vyrii.persistence.entity.company;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import ua.org.vyrii.persistence.entity.BaseEntity;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "company_images")
public class CompanyImages extends BaseEntity {

    @Column(name = "image_url", nullable = false)
    private String imageUrl;

    @Column(name = "main_image", nullable = false)
    private Boolean mainImage;

    @ManyToMany(mappedBy = "companyImages")
    private Set<Company> companies;

    public CompanyImages() {
        this.companies = new HashSet<>();
        this.mainImage = false;
    }
}
