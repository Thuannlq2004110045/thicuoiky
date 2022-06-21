package eHealthCare;

import java.util.Date;
import java.util.Random;

public class InsuranceCard {
    private static StoredFiles InsuranceCards = new StoredFiles("insurancecards.json");
    private Integer id;
    private Integer insuranceCardType;
    private String name;
    private String dateOfBirth;
    private String address;
    private String phoneNumber;
    private InfoCustomer infocustomer;

    public InsuranceCard() {
        this.id = null;
        this.insuranceCardType = null;
        this.name = null;
        this.dateOfBirth = null;
        this.address = null;
        this.phoneNumber = null;
        this.infocustomer = null;
    }

    public InsuranceCard(Integer insuranceCardType, String name, String dateOfBirth, String address,
            String phoneNumber, InfoCustomer infocustomer) {
        this.id = createID();
        this.insuranceCardType = insuranceCardType;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.infocustomer = infocustomer;
    }

    public static Integer createID(){
        Random rd = new Random();
        Integer id = 10000 + rd.nextInt(90000);	
        System.out.println("id duoc cap la: " + id);
        return id;
    }

    // public void createInsuranceCard(Integer insuranceCardType, String name, String dateOfBirth, String address,
    // String phoneNumber, InfoCustomer infocustomer) {
    //     this.id = createID();
    //     this.insuranceCardType = insuranceCardType;
    //     this.name = name;
    //     this.dateOfBirth = dateOfBirth;
    //     this.address = address;
    //     this.phoneNumber = phoneNumber;
    //     this.infocustomer = infocustomer;
    //     System.out.println("Id duoc cap la: " + this.id);
    // }

    public static StoredFiles getInsuranceCards() {
        return InsuranceCards;
    }

    public Integer getid() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Integer getInsuranceCardType() {
        return insuranceCardType;
    }

    public InfoCustomer getInfocustomer() {
        return infocustomer;
    }

    @Override
    public String toString() {
        return "  [id=" + id + ", address=" + address + ", dateOfBirth=" + dateOfBirth + ", insuranceCardType=" + insuranceCardType + ", name=" + name + ", phoneNumber=" + phoneNumber + ", infocustomer=" + infocustomer + "]";
    }
    
    
}   
