package de.fnortheim.ayrpetclinic.bootstrap;

import de.fnortheim.ayrpetclinic.model.Owner;
import de.fnortheim.ayrpetclinic.model.Pet;
import de.fnortheim.ayrpetclinic.model.PetType;
import de.fnortheim.ayrpetclinic.model.Vet;
import de.fnortheim.ayrpetclinic.service.OwnerService;
import de.fnortheim.ayrpetclinic.service.PetTypeService;
import de.fnortheim.ayrpetclinic.service.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

/**
 * created by sebastian on Apr, 2019
 */
@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("Dogname");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        dog.setName("Catname");
        PetType savedCatPetType = petTypeService.save(cat);

        Owner firstOwner = new Owner();
        firstOwner.setFirstName("Owner One");
        firstOwner.setLastName("first owner");
        firstOwner.setAddress("Foostreet");
        firstOwner.setCity("Berlin");
        firstOwner.setTelephone("0815");
        Pet firstOwnersPet = new Pet();
        firstOwnersPet.setPetType(savedDogPetType);
        firstOwnersPet.setOwner(firstOwner);
        firstOwnersPet.setName("FirstOwnersDog");
        firstOwnersPet.setBirthDate(LocalDate.now());
        firstOwner.getPets().add(firstOwnersPet);

        ownerService.save(firstOwner);

        Owner secondOwner = new Owner();
        secondOwner.setFirstName("Owner Two");
        secondOwner.setLastName("second owner");
        secondOwner.setAddress("Baravenue");
        secondOwner.setCity("Philadelphia");
        secondOwner.setTelephone("4711");
        Pet secondOwnersPet = new Pet();
        secondOwnersPet.setPetType(savedCatPetType);
        secondOwnersPet.setOwner(secondOwner);
        secondOwnersPet.setName("SecondOwnersCat");
        secondOwnersPet.setBirthDate(LocalDate.now());
        secondOwner.getPets().add(secondOwnersPet);

        ownerService.save(secondOwner);

        System.out.println("Loaded owners");

        Vet firstVet = new Vet();
        firstVet.setFirstName("Vet one");
        firstVet.setLastName("first vet");

        vetService.save(firstVet);

        Vet secondVet = new Vet();
        secondVet.setFirstName("Vet two");
        secondVet.setLastName("second vet");

        vetService.save(secondVet);

        System.out.println("Loaded vets");
    }
}
