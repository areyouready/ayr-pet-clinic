package de.fnortheim.ayrpetclinic.service.map;

import de.fnortheim.ayrpetclinic.model.BaseEntity;

import java.util.*;

/**
 * created by sebastian on Apr, 2019
 */
abstract class AbstractMapService<T extends BaseEntity, ID extends Long> {

    private Map<Long, T> map = new HashMap<>();

    Set<T> findAll() {
        return new HashSet<>(map.values());
    }

    T findById(ID id) {
        return map.get(id);
    }

    T save(T object) {

        if (object == null) {
            throw new RuntimeException("Object cannot be null");
        } else if (object.getId() == null) {
            object.setId(getNextID());
        }

        map.put(object.getId(), object);

        return object;
    }

    void deleteById(ID id) {
        map.remove(id);
    }

    void delete(T object) {
        map.entrySet().removeIf(entry -> entry.getValue().equals(object)); // this needs equals to be implemented on entities
    }

    private Long getNextID() {

        Long nextId = null;

        try {
            nextId = Collections.max(map.keySet()) + 1;
        } catch (NoSuchElementException e) {
            nextId = 1L;
        }
        return nextId;
    }
}
