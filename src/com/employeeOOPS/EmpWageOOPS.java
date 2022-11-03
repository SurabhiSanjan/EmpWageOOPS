package com.employeeOOPS;
import java.util.Random;
public class EmpWageOOPS {
    public static void main(String args[]) {


        int wage = 20;
        int hour;
        System.out.println("Welcome to Employee Wage Program");
        Random r = new Random();
        int present = r.nextInt(2);
        if (present == 0) {
            System.out.println("Employee is Present");
            hour = 8;
        } else {
            System.out.println("Employee is Absent");
            hour=0;
        }
        int dailywage = wage*hour;
        System.out.println("Daily wage is : "+ dailywage);
    }
}
