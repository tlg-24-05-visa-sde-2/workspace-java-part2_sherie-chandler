package com.rx.client;

// Client main-class for testing a few instances of Prescription:

import com.rx.test.Prescription;

class PrescriptionClient {
    public static void main(String[] args) {
        // Create a Prescription Object and Set its Properties via Individual Setter Calls
        Prescription p1 = new Prescription("Metoclopramide", 100, 30, 2);

        // Call Methods
        p1.verifyDrugStrength();
        p1.discontinueNumberOfDays();
        p1.prescribeNumberOfRefills(2);

        System.out.println();

        // Create a 3-Arg Constructor (Adjusted to match the class constructor)
        Prescription p2 = new Prescription("Metoclopramide", 200, 30, 3);
        p2.verifyDrugStrength();
        p2.discontinueNumberOfDays();
        p2.prescribeNumberOfRefills(3);

        System.out.println();

        // Show toString() Methods in Action
        System.out.println(p1.toString());
        System.out.println(p2.toString()); // toString() will be automatically called.
    }
}
