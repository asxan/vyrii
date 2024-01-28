package ua.org.vyrii.facade.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ua.org.vyrii.api.dto.response.company.CompanyPlpDto;
import ua.org.vyrii.facade.CompanyPlpFacade;
import ua.org.vyrii.persistence.entity.company.CompanyVariant;
import ua.org.vyrii.service.company.CompanyService;
import ua.org.vyrii.service.company.CompanyVariantService;

import java.util.List;

@Service
@AllArgsConstructor
public class CompanyPlpFacadeImpl implements CompanyPlpFacade {

    private final CompanyService companyService;
    private final CompanyVariantService companyVariantService;

    @Override
    public List<CompanyPlpDto> findAll() {
        return companyService.findAll()
                .stream()
                .map(
                        company -> {
                            CompanyVariant companyVariant = companyVariantService.findByCompany(company);
                            return new CompanyPlpDto(company, companyVariant);
                        }
                )
                .toList();
    }
}
