//package ua.org.vyrii.service.user.impl;
//
//import jakarta.persistence.EntityNotFoundException;
//import jakarta.transaction.Transactional;
//import lombok.AllArgsConstructor;
//import org.springframework.stereotype.Service;
//import org.apache.commons.collections4.CollectionUtils;
//import ua.org.vyrii.exception.EntityUnexistsException;
//import ua.org.vyrii.exception.NotValidFieldDataException;
//import ua.org.vyrii.persistence.entity.user.Personal;
//import ua.org.vyrii.persistence.repository.user.PersonalRepository;
//import ua.org.vyrii.service.user.PersonalCrudService;
//
//import java.util.List;
//
//import static ua.org.vyrii.util.ExceptionUtil.ENTITY_NOT_FOUND_EXCEPTION;
//import static ua.org.vyrii.util.ExceptionUtil.ENTITY_UNEXISTS_EXCEPTION;
//
//@Service
//@Transactional
//@AllArgsConstructor
//public class PersonalCrudServiceImpl implements PersonalCrudService {
//
//    private final PersonalRepository personalRepository;
//
//    @Override
//    public void create(Personal entity) {
//        if (entity == null) {
//            throw new EntityUnexistsException(ENTITY_UNEXISTS_EXCEPTION);
//        }
//        if (entity.getUsername() == null) {
//            throw new NotValidFieldDataException("User login field cannot be null");
//        }
//        if (entity.getPassword() == null) {
//            throw new NotValidFieldDataException("User password field cannot be null");
//        }
//        if (entity.getFirstName() == null) {
//            throw new NotValidFieldDataException("User first name field cannot be null");
//        }
//        if (entity.getLastName() == null) {
//            throw new NotValidFieldDataException("User last name field cannot be null");
//        }
//        if (entity.getAccountNonExpired() == null) {
//            throw new NotValidFieldDataException("User accountNonExpired field cannot be null");
//        }
//        if (entity.getAccountNonLocked() == null) {
//            throw new NotValidFieldDataException("User accountNonLocked field cannot be null");
//        }
//        if (entity.getCredentialsNonExpired() == null) {
//            throw new NotValidFieldDataException("User credentialsNonExpired field cannot be null");
//        }
//        if (entity.getEnabled() == null) {
//            throw new NotValidFieldDataException("User enabled field cannot be null");
//        }
//        if (entity.getRoleType() == null) {
//            throw new NotValidFieldDataException("User roleType field cannot be null");
//        }
//        personalRepository.save(entity);
//    }
//
//    @Override
//    public Personal findById(Long id) {
//        if (id == null) {
//            throw new NotValidFieldDataException("Id cannot be null");
//        }
//        return personalRepository.findById(id)
//                .orElseThrow(() -> new EntityNotFoundException(ENTITY_NOT_FOUND_EXCEPTION));
//    }
//
//    @Override
//    public List<Personal> findAll() {
//        List<Personal> personals = personalRepository.findAll();
//        if (CollectionUtils.isEmpty(personals)) {
//            throw new EntityNotFoundException("No one entity was found");
//        }
//        return personals;
//    }
//}
