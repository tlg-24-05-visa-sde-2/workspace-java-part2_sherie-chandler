package com.javatunes.personnel;

import org.junit.Before;
import org.junit.Test;

import java.sql.Date;

import static org.junit.Assert.*;

public class SalariedEmployeeTest {
    private SalariedEmployee emp;

    @Before
    public void setUp() {
        emp = new SalariedEmployee("John", Date.valueOf("2024-05-13"), 1500.00);
    }

    @Test
    public void testPayTaxes() {
assertEquals(450.0, emp.payTaxes(), .001);      // 30% of the salary
    }

    @Test
    public void testPay() {
        assertEquals(1500.0, emp.pay(), .001);       // fixed salary

    }

}