package de.fnortheim.ayrpetclinic.model;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * created by sebastian on May, 2019
 */
@Entity
@Table(name = "specialties")
public class Specialty extends BaseEntity {

    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
