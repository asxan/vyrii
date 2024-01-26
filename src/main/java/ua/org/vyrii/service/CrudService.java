package ua.org.vyrii.service;

import ua.org.vyrii.persistence.entity.BaseEntity;

public interface CrudService<E extends BaseEntity>{
    void create(E entity);
    E findById(Long id);
}
