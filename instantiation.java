import java.util.*;
import java.util.ArrayList;
import java.util.Date;

class Shelter {
    private int shelterID;
    private String shelterName;
    private String shelterAddress;
    private int shelterCapacity;
    private List<Individual> shelterOccupants;
    private String shelterType;

    public Shelter() {}
    public Shelter(int shelterID, String shelterName, String shelterAddress, int shelterCapacity, String shelterType) {
        this.shelterID = shelterID;
        this.shelterName = shelterName;
        this.shelterAddress = shelterAddress;
        this.shelterCapacity = shelterCapacity;
        this.shelterType = shelterType;
        this.shelterOccupants = new ArrayList<>();
    }
}

class Individual {
    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private int age;
    private String gender;
    private float heightInches;
    private float weightKg;
    private List<String> languageSpoken;
    private List<String> medicalConditions;
    private Shelter shelter;
    private List<Individual> familyMembers;
    private SocialWorker socialWorker;

    public Individual(String firstName, String lastName, Date dateOfBirth,int age, String gender, float heightInches,
                      float weightKg, List<String> languageSpoken, List<String> medicalConditions,
                      Shelter shelter, SocialWorker socialWorker) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.age = age;
        this.gender = gender;
        this.heightInches = heightInches;
        this.weightKg = weightKg;
        this.shelter = shelter;
        this.languageSpoken = new ArrayList<>();
        this.medicalConditions = new ArrayList<>();
        this.familyMembers = new ArrayList<>();
        this.socialWorker = socialWorker;
    }
}

class ContactLog {
    private Date contactDate;
    private String contactType;
    private String contactPerson;
    private String notes;

    public ContactLog(Date contactDate, String contactType, String contactPerson, String notes) {
        this.contactDate = contactDate;
        this.contactType = contactType;
        this.contactPerson = contactPerson;
        this.notes = notes;
    }
}

class MedicalRecord {
    private Individual individual;
    private List<String> injuries;
    private String treatmentReceived;
    private String assignedDoctor;

    public MedicalRecord(Individual individual) {
        this.individual = individual;
        this.injuries = new ArrayList<>();
    }
}

class Supply {
    private String supplyType;
    private int quantity;
    private Individual recipient;

    public Supply(String supplyType, int quantity) {
        this.supplyType = supplyType;
        this.quantity = quantity;
    }
}

public class SocialWorker {
    private int socialWorkerID;
    private List<Individual> assignedIndividuals;

    public SocialWorker(int socialWorkerID) {
        this.socialWorkerID = socialWorkerID;
        this.assignedIndividuals = new ArrayList<>();
    }

    public void assignIndividual(Individual individual) {
        assignedIndividuals.add(individual);
    }

    public List<Individual> getAssignedIndividuals() {
        return assignedIndividuals;
    }

}