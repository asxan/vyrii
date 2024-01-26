package ua.org.vyrii.service.company.impl;

import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import ua.org.vyrii.exception.EntityUnexistsException;
import ua.org.vyrii.exception.NotValidFieldDataException;
import ua.org.vyrii.persistence.entity.company.Company;
import ua.org.vyrii.persistence.entity.company.CompanyVariant;
import ua.org.vyrii.persistence.repository.company.CompanyVariantRepository;
import ua.org.vyrii.service.company.CompanyVariantService;

import java.util.List;
import java.util.Optional;

import static ua.org.vyrii.util.ExceptionUtil.*;

@Service
@Transactional
@AllArgsConstructor
public class CompanyVariantServiceImpl implements CompanyVariantService {

    private final CompanyVariantRepository companyVariantRepository;

    @Override
    public void create(CompanyVariant entity) {
        if (entity == null) {
            throw new EntityUnexistsException(ENTITY_UNEXISTS_EXCEPTION);
        }
        if (entity.getActivityField() == null) {
            throw new NotValidFieldDataException("Company variant activity field cannot be null");
        }
        if (entity.getType() == null) {
            throw new NotValidFieldDataException("Company variant type field cannot be null");
        }
        if (entity.getEmployeesCount() == null) {
            throw new NotValidFieldDataException("Company variant employees count field cannot be null");
        }
        if (entity.getCapitalization() == null) {
            throw new NotValidFieldDataException("Company variant capitalization field cannot be null");
        }
        if (entity.getCompany() == null) {
            throw new NotValidFieldDataException("Company variant company field cannot be null");
        }

        companyVariantRepository.save(entity);
    }

    @Override
    public CompanyVariant findById(Long id) {
        if (id == null) {
            throw new NotValidFieldDataException("Id cannot be null");
        }
        return companyVariantRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException(ENTITY_NOT_FOUND_EXCEPTION));
    }

    @Override
    public List<CompanyVariant> findAll() {
        List<CompanyVariant> companyVariants = companyVariantRepository.findAll();
        if (CollectionUtils.isEmpty(companyVariants)) {
            throw new EntityNotFoundException("No one entity was found");
        }
        return companyVariants;
    }


    @Override
    public CompanyVariant findByCompany(Company company) {
        if (company == null) {
            throw new NotValidFieldDataException(NOT_VALID_FIELD_DATA_EXCEPTION);
        }
        Optional<CompanyVariant> companyVariant = companyVariantRepository.findByCompany(company);
        if (companyVariant.isEmpty()) {
            throw new EntityNotFoundException("Entity is not exist");
        }
        return companyVariant.get();
    }
}
