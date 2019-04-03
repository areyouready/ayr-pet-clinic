package de.fnortheim.ayrpetclinic.service;

import de.fnortheim.ayrpetclinic.model.Owner;

import java.util.Set;

/**
 * created by sebastian on Apr, 2019
 */
public interface OwnerService {

    Owner findByLastName(String lastName);

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();
}
