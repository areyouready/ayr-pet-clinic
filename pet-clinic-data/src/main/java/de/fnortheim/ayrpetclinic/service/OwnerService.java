package de.fnortheim.ayrpetclinic.service;

import de.fnortheim.ayrpetclinic.model.Owner;

/**
 * created by sebastian on Apr, 2019
 */
public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
