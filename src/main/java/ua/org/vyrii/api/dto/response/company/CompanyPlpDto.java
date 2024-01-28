package ua.org.vyrii.api.dto.response.company;

import lombok.Getter;
import lombok.Setter;

import org.apache.commons.collections4.CollectionUtils;
import ua.org.vyrii.api.dto.response.ResponseDto;
import ua.org.vyrii.exception.NotValidFieldDataException;
import ua.org.vyrii.persistence.entity.company.Company;
import ua.org.vyrii.persistence.entity.company.CompanyVariant;
import ua.org.vyrii.persistence.entity.company.CompanyImage;

import java.util.Set;

import static org.springframework.util.CollectionUtils.*;


@Getter
@Setter
public class CompanyPlpDto extends ResponseDto {
    private String name;
    private String image;
    private String owner;
    private Integer founding_year;
    private String description;

    public CompanyPlpDto(Company company, CompanyVariant companyVariant) {
        setId(company.getId());
        setName(company.getName());
        setOwner(company.getOwner());
        setFounding_year(company.getFoundingYear());
        setDescription(company.getDescription());
        Set<CompanyImage> images = company.getCompanyImages();
        if (CollectionUtils.isNotEmpty(images)) {
            CompanyImage companyImage = images
                    .stream()
                    .filter(CompanyImage::getMainImage)
                    .findFirst()
                    .orElseThrow(() -> new NotValidFieldDataException("Main image is not exist"));
            this.image = companyImage.getImageUrl();
        }
        if (companyVariant == null) {
            throw new NotValidFieldDataException("Company variant is not present");
        }
    }
}
