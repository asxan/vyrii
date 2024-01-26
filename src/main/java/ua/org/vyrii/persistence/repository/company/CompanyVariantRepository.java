package ua.org.vyrii.persistence.repository.company;

import ua.org.vyrii.persistence.entity.company.Company;
import ua.org.vyrii.persistence.entity.company.CompanyVariant;
import ua.org.vyrii.persistence.repository.BaseRepository;

import java.util.Optional;

public interface CompanyVariantRepository extends BaseRepository<CompanyVariant> {
    Optional<CompanyVariant> findByCompany(Company company);
}
