import java.util.List;
import java.util.ArrayList;
import java.util.Date;

class Shelter {
    private String name;
    private String address;
    private int capacity;
    private List<Individual> occupants;

    public Shelter(String name, String address, int capacity) {
        this.name = name;
        this.address = address;
        this.capacity = capacity;
        this.occupants = new ArrayList<>();
    }
}

class Individual {
    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private String gender;
    private List<String> languageSpoken;
    private List<String> medicalConditions;
    private Shelter shelter;
    private List<Individual> familyMembers;

    public Individual(String firstName, String lastName, Date dateOfBirth, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.languageSpoken = new ArrayList<>();
        this.medicalConditions = new ArrayList<>();
        this.familyMembers = new ArrayList<>();
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
