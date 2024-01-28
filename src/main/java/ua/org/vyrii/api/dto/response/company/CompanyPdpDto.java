package ua.org.vyrii.api.dto.response.company;

import lombok.Getter;
import lombok.Setter;
import org.apache.commons.collections4.CollectionUtils;
import ua.org.vyrii.api.dto.response.ResponseDto;
import ua.org.vyrii.persistence.entity.company.Company;
import ua.org.vyrii.persistence.entity.company.CompanyImage;
import ua.org.vyrii.persistence.entity.company.CompanyVariant;

import java.util.List;
import java.util.Set;

@Getter
@Setter
public class CompanyPdpDto extends ResponseDto {
    private String name;
    private String owner;
    private String founding_year;
    private String description;
    private List<String> images;
    private CompanyVariantDto variant;

    public CompanyPdpDto(Company company, CompanyVariant companyVariant) {
        setId(company.getId());
        setName(company.getName());
        setOwner(company.getOwner());
        setFounding_year(company.getFoundingYear()
                .toString());
        setDescription(company.getDescription());
        Set<CompanyImage> images = company.getCompanyImages();
        if (CollectionUtils.isNotEmpty(images)) {
            setImages(images.stream()
                    .map(CompanyImage::getImageUrl)
                    .toList());
        }
        if (companyVariant != null) {
            variant = new CompanyVariantDto(companyVariant);
        }
    }
}
