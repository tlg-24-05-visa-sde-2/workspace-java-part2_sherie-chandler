package com.rx.test;

public enum PrescriptionFormType {
    SUPPOSITORIES("suppositories"),
    INJECTIONS("injections"),
    PATCHES("patches");

    // Regular Class Definition Stuff: fields, ctors, and methods
    private final String display;

    private PrescriptionFormType(String display) {
        this.display = display;
    }

    public String getDisplay() {
        return display;
    }

    public String toString() {
        return display;
    }
}


