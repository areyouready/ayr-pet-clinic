package de.fnortheim.ayrpetclinic.bootstrap;

import de.fnortheim.ayrpetclinic.model.*;
import de.fnortheim.ayrpetclinic.service.*;
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
    private final SpecialtyService specialtyService;
    private final VisitService visitService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService,
                      SpecialtyService specialtyService, VisitService visitService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.specialtyService = specialtyService;
        this.visitService = visitService;
    }

    @Override
    public void run(String... args) throws Exception {

        int count = petTypeService.findAll().size();

        if (count == 0) {
            loadData();
        }
    }

    private void loadData() {
        PetType dog = new PetType();
        dog.setName("Dogname");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        dog.setName("Catname");
        PetType savedCatPetType = petTypeService.save(cat);

        Specialty radiology = new Specialty();
        radiology.setDescription("radiology");
        Specialty savedRadiology = specialtyService.save(radiology);

        Specialty surgery = new Specialty();
        surgery.setDescription("surgery");
        Specialty savedSurgery = specialtyService.save(surgery);

        Specialty dentistry = new Specialty();
        dentistry.setDescription("dentistry");
        Specialty savedDentistry = specialtyService.save(dentistry);

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

        Visit catVisit = new Visit();
        catVisit.setPet(secondOwnersPet);
        catVisit.setDate(LocalDate.now());
        catVisit.setDescription("foo cat flu");

        visitService.save(catVisit);

        System.out.println("Loaded owners");

        Vet firstVet = new Vet();
        firstVet.setFirstName("Vet one");
        firstVet.setLastName("first vet");
        firstVet.getSpecialties().add(savedRadiology);

        vetService.save(firstVet);

        Vet secondVet = new Vet();
        secondVet.setFirstName("Vet two");
        secondVet.setLastName("second vet");
        secondVet.getSpecialties().add(savedSurgery);

        vetService.save(secondVet);

        System.out.println("Loaded vets");
    }
}
