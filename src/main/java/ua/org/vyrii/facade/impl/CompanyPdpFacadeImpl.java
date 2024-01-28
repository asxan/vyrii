package ua.org.vyrii.facade.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ua.org.vyrii.api.dto.response.company.CompanyPdpDto;
import ua.org.vyrii.facade.CompanyPdpFacade;
import ua.org.vyrii.persistence.entity.company.Company;
import ua.org.vyrii.persistence.entity.company.CompanyVariant;
import ua.org.vyrii.service.company.CompanyService;
import ua.org.vyrii.service.company.CompanyVariantService;

@Service
@AllArgsConstructor
public class CompanyPdpFacadeImpl implements CompanyPdpFacade {
    private final CompanyVariantService companyVariantService;
    private final CompanyService companyService;

    @Override
    public CompanyPdpDto findByCompanyId(Long companyId) {
        Company company = companyService.findById(companyId);
        CompanyVariant companyVariant = companyVariantService.findByCompany(company);
        return new CompanyPdpDto(company, companyVariant);
    }
}
