package ua.org.vyrii.persistence.repository.company;

import org.springframework.stereotype.Repository;
import ua.org.vyrii.persistence.entity.BaseEntity;
import ua.org.vyrii.persistence.entity.company.Company;
import ua.org.vyrii.persistence.repository.BaseRepository;

@Repository
public interface CompanyRepository extends BaseRepository<Company> {
}
