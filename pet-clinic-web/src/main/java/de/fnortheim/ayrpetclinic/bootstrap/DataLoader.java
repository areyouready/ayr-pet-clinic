package de.fnortheim.ayrpetclinic.bootstrap;

import de.fnortheim.ayrpetclinic.model.Owner;
import de.fnortheim.ayrpetclinic.model.Vet;
import de.fnortheim.ayrpetclinic.service.OwnerService;
import de.fnortheim.ayrpetclinic.service.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * created by sebastian on Apr, 2019
 */
@Component
public class DataLoader implements CommandLineRunner {

    private OwnerService ownerService;
    private VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {

        Owner firstOwner = new Owner();
        firstOwner.setFirstName("Owner One");
        firstOwner.setLastName("first owner");

        ownerService.save(firstOwner);

        Owner secondOwner = new Owner();
        secondOwner.setFirstName("Owner Two");
        secondOwner.setLastName("second owner");

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
