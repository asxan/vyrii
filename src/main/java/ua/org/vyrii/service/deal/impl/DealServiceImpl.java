package ua.org.vyrii.service.deal.impl;

import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import ua.org.vyrii.exception.EntityUnexistsException;
import ua.org.vyrii.exception.NotValidFieldDataException;
import ua.org.vyrii.persistence.entity.deal.Beneficiary;
import ua.org.vyrii.persistence.repository.deal.BeneficiaryRepository;
import ua.org.vyrii.service.deal.DealService;

import java.util.List;

import static ua.org.vyrii.util.ExceptionUtil.ENTITY_NOT_FOUND_EXCEPTION;
import static ua.org.vyrii.util.ExceptionUtil.ENTITY_UNEXISTS_EXCEPTION;

@Service
@Transactional
@AllArgsConstructor
public class DealServiceImpl implements DealService {

    private final BeneficiaryRepository beneficiaryRepository;

    @Override
    public void create(Beneficiary entity) {
        if (entity == null) {
            throw new EntityUnexistsException(ENTITY_UNEXISTS_EXCEPTION);
        }
        if (entity.getCompany() == null) {
            throw new NotValidFieldDataException("Beneficiary company field cannot be null");
        }
        beneficiaryRepository.save(entity);
    }

    @Override
    public Beneficiary findById(Long id) {
        if (id == null) {
            throw new NotValidFieldDataException("Id cannot be null");
        }
        return beneficiaryRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException(ENTITY_NOT_FOUND_EXCEPTION));
    }

    @Override
    public List<Beneficiary> findAll() {
        List<Beneficiary> beneficiaries = beneficiaryRepository.findAll();
        if (CollectionUtils.isEmpty(beneficiaries)) {
            throw new EntityNotFoundException("No one entity was found");
        }
        return beneficiaries;
    }
}
