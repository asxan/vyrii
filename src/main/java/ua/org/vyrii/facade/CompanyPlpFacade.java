package ua.org.vyrii.facade;

import ua.org.vyrii.api.dto.response.company.CompanyPlpDto;
import ua.org.vyrii.persistence.entity.company.Company;

import java.util.List;

public interface CompanyPlpFacade {
    List<CompanyPlpDto> findAll();
}
