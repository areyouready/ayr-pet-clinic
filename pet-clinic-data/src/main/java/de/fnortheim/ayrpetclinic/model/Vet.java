package de.fnortheim.ayrpetclinic.model;

import java.util.Set;

/**
 * created by sebastian on Apr, 2019
 */
public class Vet extends Person {

    private Set<Specialty> specialties;

    public Set<Specialty> getSpecialties() {
        return specialties;
    }

    public void setSpecialties(Set<Specialty> specialties) {
        this.specialties = specialties;
    }
}
