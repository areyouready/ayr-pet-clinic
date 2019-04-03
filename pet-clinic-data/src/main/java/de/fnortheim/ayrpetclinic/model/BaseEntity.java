package de.fnortheim.ayrpetclinic.model;

import java.io.Serializable;

/**
 * created by sebastian on Apr, 2019
 */
public class BaseEntity implements Serializable {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
