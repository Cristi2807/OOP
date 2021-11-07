package Lab6;

import java.util.Date;

class FullName{
    String firstName;
    String lastName;
}

class Gender{
    boolean male;
    boolean female;
    boolean unknown;
}

class Address{
    String city;
    String street;
    int flat;
}

class Phone{
    String countryCode;
    String number;
}

class Person{

    String title;
    String givenName;
    String middleName;
    String familyName;
    FullName name;
    Date birthDate;
    Gender gender;
    Address homeaddress;
    Phone phone;
}

class Hospital{
    String name;
    Address address;
    Phone phone;
}


class Department extends Hospital{};

class Patient extends Person{

    String id;
    FullName name;
    Gender gender;
    Date birthdate;
    Integer age;
    Date accepted;
    String prescriptions;
    String allergies;
    String specialReqs;
}


class Staff extends Person{

    Date joined;
    String education;
    String certification;
    String languages;
}

class OperationsStaff extends  Staff{}


class AdministrativeStaff extends Staff{}

class TechnicalStaff extends Staff{}

class Doctor extends OperationsStaff{
    String specialty;
    String locations;
}

class Nurse extends OperationsStaff{
}

class FrontDeskStaff extends AdministrativeStaff{}

class Technician extends TechnicalStaff{}

class Technologist extends TechnicalStaff{}

class Surgeon extends Doctor{}

class Receptionist extends FrontDeskStaff{}

class SurgicalTechnologist extends Technologist{

}


public class Task1 {

    public static void main(String[] args) {

    }


}
