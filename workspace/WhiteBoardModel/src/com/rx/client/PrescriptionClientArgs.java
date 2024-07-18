package com.rx.client;

import com.rx.test.Prescription;
import com.rx.test.PrescriptionFormType;

import java.util.Arrays;

class PrescriptionClientArgs {

    public static void main(String[] args) {
        if (args.length < 4) {
            printUsage();
            return;
        }

        int drugStrength = Integer.parseInt(args[0]);
        int numberOfDays = Integer.parseInt(args[1]);
        int numberOfRefills = Integer.parseInt(args[2]);
        String drugName = args[3];

        Prescription prescription = new Prescription(drugName, drugStrength, numberOfDays, numberOfRefills);
        printInformation(prescription);
    }

    private static void printInformation(Prescription prescription) {
        String information =
                "Thank you for choosing Vanderbilt Medical Center.\n" +
                        "Your physician has prescribed the following medication:\n" + prescription;
        System.out.println(information);
    }

    private static void printUsage() {
        String types = Arrays.toString(PrescriptionFormType.values());

        String usage = "Usage: java PrescriptionClientArgs <drugStrength> <numberOfDays> <numberOfRefills> <drugName>\n" +
                "Your prescription for Metoclopramide will be increased from 100 mg to 200 mg.\n" +
                "In 30 days you will be weaned from Metoclopramide.\n" +
                "This prescription for suppositories will be discontinued after 30 days.";
        System.out.println(usage);
    }
}
