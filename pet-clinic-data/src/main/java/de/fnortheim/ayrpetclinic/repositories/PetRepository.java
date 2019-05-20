package de.fnortheim.ayrpetclinic.repositories;

import de.fnortheim.ayrpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

/**
 * created by sebastian on May, 2019
 */
public interface PetRepository extends CrudRepository<Pet, Long> {
}
