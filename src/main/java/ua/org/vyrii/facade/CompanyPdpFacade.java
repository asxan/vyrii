package ua.org.vyrii.facade;

import ua.org.vyrii.api.dto.response.company.CompanyPdpDto;

public interface CompanyPdpFacade {
    CompanyPdpDto findByCompanyId(Long companyId);
}
