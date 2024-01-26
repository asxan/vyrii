package ua.org.vyrii.service.company;

import ua.org.vyrii.persistence.entity.company.Company;
import ua.org.vyrii.persistence.entity.company.CompanyVariant;
import ua.org.vyrii.service.CrudService;
import ua.org.vyrii.service.FindAllService;

import java.util.List;

public interface CompanyVariantService extends CrudService<CompanyVariant>, FindAllService<CompanyVariant> {
    CompanyVariant findByCompany(Company company);
}
