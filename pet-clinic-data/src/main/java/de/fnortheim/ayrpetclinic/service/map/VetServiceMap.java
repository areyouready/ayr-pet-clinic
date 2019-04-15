package de.fnortheim.ayrpetclinic.service.map;

import de.fnortheim.ayrpetclinic.model.Vet;
import de.fnortheim.ayrpetclinic.service.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * created by sebastian on Apr, 2019
 */
@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }
}
