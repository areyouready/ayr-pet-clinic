package de.fnortheim.ayrpetclinic.service;

import de.fnortheim.ayrpetclinic.model.Vet;

import java.util.Set;

/**
 * created by sebastian on Apr, 2019
 */
public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();

}
