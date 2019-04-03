package de.fnortheim.ayrpetclinic.service;

import de.fnortheim.ayrpetclinic.model.Pet;

import java.util.Set;

/**
 * created by sebastian on Apr, 2019
 */
public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();

}
