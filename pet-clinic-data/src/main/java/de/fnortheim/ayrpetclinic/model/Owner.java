package de.fnortheim.ayrpetclinic.model;

import java.util.HashSet;
import java.util.Set;

/**
 * created by sebastian on Apr, 2019
 */
public class Owner extends Person {

    private String address;
    private String city;
    private String telephone;
    private Set<Pet> pets;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Set<Pet> getPets() {
        if (pets == null) {
            pets = new HashSet<>();
        }
        return pets;
    }

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }
}
