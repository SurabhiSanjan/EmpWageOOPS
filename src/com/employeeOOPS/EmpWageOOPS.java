package com.employeeOOPS;
import java.util.Random;
public class EmpWageOOPS {
    public static void main(String args[]) {

        System.out.println("Welcome to Employee Wage Program");
        Random r = new Random();
        int present = r.nextInt(2);
        if (present == 0) {
            System.out.println("Employee is Present");
        } else {
            System.out.println("Employee is Absent");
        }
    }
}
