package org.example;

import org.example.enums.Plan;

public class Main {
    public static void main(String[] args) {
        runApplication();
    }

    public static void runApplication() {
        System.out.println("--- Uygulama Başlatılıyor ---");

        Healthplan basicPlan = new Healthplan(1, "Standart Paket", Plan.BASIC);
        System.out.println(basicPlan.toString());

        String[] healthplans = new String[2];
        Employee employee = new Employee(1, "Ahmet Yılmaz", "ahmet@test.com", "12345", healthplans);

        employee.addHealthPlan(0, "A Sigorta");
        employee.addHealthPlan(0, "B Sigorta");
        employee.addHealthPlan(5, "C Sigorta");

        System.out.println(employee.toString());

        String[] developers = new String[3];
        Company company = new Company(1, "Tekno Corp", 150000.0, developers);

        company.addEmployee(0, employee.getFullName());
        company.addEmployee(0, "Mehmet Can");

        company.setGiro(-5000);

        System.out.println(company.toString());
    }
}