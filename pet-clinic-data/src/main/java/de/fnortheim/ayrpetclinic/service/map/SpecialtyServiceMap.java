package de.fnortheim.ayrpetclinic.service.map;

import de.fnortheim.ayrpetclinic.model.Specialty;
import de.fnortheim.ayrpetclinic.service.SpecialtyService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * created by sebastian on May, 2019
 */
@Service
public class SpecialtyServiceMap extends AbstractMapService<Specialty, Long> implements SpecialtyService {

    @Override
    public Set<Specialty> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Specialty object) {
        super.delete(object);
    }

    @Override
    public Specialty save(Specialty object) {
        return super.save(object);
    }

    @Override
    public Specialty findById(Long id) {
        return super.findById(id);
    }
}
