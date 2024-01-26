package ua.org.vyrii.service;

import ua.org.vyrii.persistence.entity.BaseEntity;

import java.util.List;

public interface FindAllService<E extends BaseEntity> {
    List<E> findAll();
}
