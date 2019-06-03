package de.fnortheim.ayrpetclinic.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * created by sebastian on May, 2019
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "specialties")
public class Specialty extends BaseEntity {

    private String description;

}
