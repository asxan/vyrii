//package ua.org.vyrii.service.user.impl;
//
//import jakarta.persistence.EntityNotFoundException;
//import jakarta.transaction.Transactional;
//import lombok.AllArgsConstructor;
//import org.springframework.stereotype.Service;
//import org.apache.commons.collections4.CollectionUtils;
//import ua.org.vyrii.exception.EntityUnexistsException;
//import ua.org.vyrii.exception.NotValidFieldDataException;
//import ua.org.vyrii.persistence.entity.user.Account;
//import ua.org.vyrii.persistence.repository.user.AccountRepository;
//import ua.org.vyrii.service.user.AccountCrudService;
//
//import java.util.List;
//
//import static ua.org.vyrii.util.ExceptionUtil.ENTITY_NOT_FOUND_EXCEPTION;
//import static ua.org.vyrii.util.ExceptionUtil.ENTITY_UNEXISTS_EXCEPTION;
//
//@Service
//@Transactional
//@AllArgsConstructor
//public class AccountCrudServiceImpl implements AccountCrudService {
//
//    private final AccountRepository accountRepository;
//
//    @Override
//    public void create(Account entity) {
//        if (entity == null) {
//            throw new EntityUnexistsException(ENTITY_UNEXISTS_EXCEPTION);
//        }
//        if (entity.getAge() == null) {
//            throw new NotValidFieldDataException("User age field cannot be null");
//        }
//        if (entity.getSex() == null) {
//            throw new NotValidFieldDataException("User sex field cannot be null");
//        }
//        if (entity.getIpn() == null) {
//            throw new NotValidFieldDataException("User ipn  field cannot be null");
//        }
//        if (entity.getPassportNumber() == null) {
//            throw new NotValidFieldDataException("User  passportNumber field cannot be null");
//        }
//        if (entity.getAuthority() == null) {
//            throw new NotValidFieldDataException("User authority field cannot be null");
//        }
//        if (entity.getIssueDate() == null) {
//            throw new NotValidFieldDataException("User issueDate field cannot be null");
//        }
//        accountRepository.save(entity);
//    }
//
//    @Override
//    public Account findById(Long id) {
//        if (id == null) {
//            throw new NotValidFieldDataException("Id cannot be null");
//        }
//        return accountRepository.findById(id)
//                .orElseThrow(() -> new EntityNotFoundException(ENTITY_NOT_FOUND_EXCEPTION));
//    }
//
//    @Override
//    public List<Account> findAll() {
//        List<Account> accounts = accountRepository.findAll();
//        if (CollectionUtils.isEmpty(accounts)) {
//            throw new EntityNotFoundException("No one entity was found");
//        }
//        return accounts;
//    }
//}
