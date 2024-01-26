package ua.org.vyrii.service.company;

import ua.org.vyrii.persistence.entity.company.Company;
import ua.org.vyrii.service.CrudService;
import ua.org.vyrii.service.FindAllService;

public interface CompanyService extends CrudService<Company>, FindAllService<Company> {
}
