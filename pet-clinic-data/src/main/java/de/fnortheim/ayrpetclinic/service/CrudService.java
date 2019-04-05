package de.fnortheim.ayrpetclinic.service;

import java.util.Set;

/**
 * created by sebastian on Apr, 2019
 */
public interface CrudService<T, ID> { // T=Type

    Set<T> findAll();

    T findById(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);
}
