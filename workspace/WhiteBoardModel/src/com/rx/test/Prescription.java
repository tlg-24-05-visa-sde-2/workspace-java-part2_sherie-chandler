package com.rx.test;

// Business Class
public class Prescription {

    private String drugName;
    private int drugStrength;
    private int numberOfDays;
    private int numberOfRefills;

    // Generate Constructors
    public Prescription(String drugName, int drugStrength, int numberOfDays, int numberOfRefills) {
        this.drugName = drugName;
        this.drugStrength = drugStrength;
        this.numberOfDays = numberOfDays;
        this.numberOfRefills = numberOfRefills;
    }

    // Business or "Action Methods
    public void verifyDrugStrength() {
        System.out.println("Verifying the patient's dose: " + getDrugStrength() + " mg");
    }

    public void discontinueNumberOfDays() {
        System.out.println("Discontinuing your " + getDrugName() + " after " + getNumberOfDays() + " days.");
    }

    public void prescribeNumberOfRefills(int numberOfRefills) {
        System.out.println("Prescribing " + numberOfRefills + " refills for " + getNumberOfDays() + " days.");
    }

    // Accessor (Get/Set) Methods
    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public int getDrugStrength() {
        return drugStrength;
    }

    public void setDrugStrength(int drugStrength) {
        if (drugStrength == 100 || drugStrength == 200) {
            this.drugStrength = drugStrength;
        } else {
            System.out.println("Invalid prescription strength: " + drugStrength + " mg. Must be 100 mg or 200 mg.");
        }
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public void setNumberOfDays(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    public int getNumberOfRefills() {
        return numberOfRefills;
    }

    public void setNumberOfRefills(int numberOfRefills) {
        this.numberOfRefills = numberOfRefills;
    }

    @Override
    public String toString() {
        return String.format("%s: drugName=%s, drugStrength=%d mg, numberOfDays=%d, numberOfRefills=%d",
                getClass().getSimpleName(), drugName, drugStrength, numberOfDays, numberOfRefills);
    }
}
