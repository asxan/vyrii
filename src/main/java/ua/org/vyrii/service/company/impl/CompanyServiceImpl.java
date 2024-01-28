package ua.org.vyrii.service.company.impl;

import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.apache.commons.collections4.CollectionUtils;
import ua.org.vyrii.exception.EntityUnexistsException;
import ua.org.vyrii.exception.NotValidFieldDataException;
import ua.org.vyrii.persistence.entity.company.Company;
import ua.org.vyrii.persistence.repository.company.CompanyRepository;
import ua.org.vyrii.service.company.CompanyService;

import java.util.List;

import static ua.org.vyrii.util.ExceptionUtil.ENTITY_NOT_FOUND_EXCEPTION;
import static ua.org.vyrii.util.ExceptionUtil.ENTITY_UNEXISTS_EXCEPTION;

@Service
@Transactional
@AllArgsConstructor
public class CompanyServiceImpl implements CompanyService {

    private final CompanyRepository companyRepository;


    @Override
    public void create(Company entity) {
        if (entity == null) {
            throw new EntityUnexistsException(ENTITY_UNEXISTS_EXCEPTION);
        }
        // Check for null values in individual fields
        if (entity.getName() == null) {
            throw new NotValidFieldDataException("Company name cannot be null");
        }
        if (entity.getDescription() == null) {
            throw new NotValidFieldDataException("Company description cannot be null");
        }
        if (entity.getOwner() == null) {
            throw new NotValidFieldDataException("Company owner cannot be null");
        }
        if (entity.getFoundingYear() == null) {
            throw new NotValidFieldDataException("Company founding year cannot be null");
        }
        // Additional checks for other fields as needed

        // Save the entity to the repository if all checks pass
        companyRepository.save(entity);
    }

    @Override
    public Company findById(Long id) {
        if (id == null) {
            throw new NotValidFieldDataException("Id cannot be null");
        }
        return companyRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException(ENTITY_NOT_FOUND_EXCEPTION));
    }

    @Override
    public List<Company> findAll() {
        List<Company> companies = companyRepository.findAll();
        if (CollectionUtils.isEmpty(companies)) {
            throw new EntityNotFoundException("No one entity was found");
        }
        return companies;
    }
}
