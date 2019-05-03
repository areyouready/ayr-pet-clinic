package de.fnortheim.ayrpetclinic.model;

import java.util.Set;

/**
 * created by sebastian on Apr, 2019
 */
public class Owner extends Person {

    private Set<Pet> petSet;

    public Set<Pet> getPetSet() {
        return petSet;
    }

    public void setPetSet(Set<Pet> petSet) {
        this.petSet = petSet;
    }
}
