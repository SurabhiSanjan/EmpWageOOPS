package com.employeeOOPS;
import java.util.*;
public class EmpWageOOPS {
    public static void main(String args[]) {
        int wage = 20;
        int hour;
        System.out.println("Welcome to Employee Wage Program");
        Random r = new Random();
        int present = r.nextInt(3);
        if (present == 0) {
            System.out.println("Employee is present: Full time");
            hour = 8;
        } else if (present == 1) {
            System.out.println("Employee is present: Part time");
            hour = 4;
        } else {
            System.out.println("Employee is absent");
            hour = 0;
            switch (present) {
                case 0: {
                    System.out.println("Employee is present: Full time");
                    hour = 8;
                }
                break;
                case 1: {
                    System.out.println("Employee is present: Part time");
                    hour = 4;
                }
                break;
                default:
                    System.out.println("Employee is absent");
                    hour = 0;
            }
            int dailyWage = wage * hour;
            System.out.println("Daily Employee wage: " + dailyWage);
        }
        int dailyWage = wage * hour;
        System.out.println("Daily Employee wage: " + dailyWage);
    }
}
