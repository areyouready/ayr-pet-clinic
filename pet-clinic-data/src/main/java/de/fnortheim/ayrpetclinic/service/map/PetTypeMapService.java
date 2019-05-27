package de.fnortheim.ayrpetclinic.service.map;

import de.fnortheim.ayrpetclinic.model.PetType;
import de.fnortheim.ayrpetclinic.service.PetTypeService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * created by sebastian on May, 2019
 */
@Service
public class PetTypeMapService extends AbstractMapService<PetType, Long> implements PetTypeService {
    @Override
    public Set<PetType> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(PetType petType) {
        super.delete(petType);
    }

    @Override
    public PetType save(PetType petType) {
        return super.save(petType);
    }

    @Override
    public PetType findById(Long id) {
        return super.findById(id);
    }
}
