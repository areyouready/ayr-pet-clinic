package de.fnortheim.ayrpetclinic.service.map;

import de.fnortheim.ayrpetclinic.model.Owner;
import de.fnortheim.ayrpetclinic.service.OwnerService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * created by sebastian on Apr, 2019
 */
@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object);
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}