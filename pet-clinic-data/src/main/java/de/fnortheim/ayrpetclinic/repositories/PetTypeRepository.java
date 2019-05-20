package de.fnortheim.ayrpetclinic.repositories;

import de.fnortheim.ayrpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

/**
 * created by sebastian on May, 2019
 */
public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
