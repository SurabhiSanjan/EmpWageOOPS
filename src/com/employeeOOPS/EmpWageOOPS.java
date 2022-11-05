package com.employeeOOPS;
import java.util.*;

public class EmpWageOOPS {
    static int wage = 20;
    static int hour;
    public static void main(String args[]) {
        System.out.println("Welcome to Employee Wage Program");
        condition();
    }
    public static void condition() {
        int count = 0; //to keep a count of number of days worked
        while (hour != 100) {
            Random r = new Random();
            int present = r.nextInt(3);
            switch (present) {
                case 0: {
                    System.out.println("Employee is present: Full time");
                    hour = hour + 8;
                    count++;
                }
                break;
                case 1: {
                    System.out.println("Employee is present: Part time");
                    hour = hour + 4;
                    count++;
                }
                break;
                default:
                    System.out.println("Employee is absent");
                    hour = hour + 0;
                    count++;
            }

        }
        if (count == 20) {
            System.out.println("Employee Satisfied total working hours in a month i.e; 100 hours in 20 working days");
        } else {
            System.out.println("Employee Not Satisfied total working hours in a month ");
        }
        int dailyWage = wage * hour;
        System.out.println("Daily Employee wage: " + dailyWage);
        System.out.println("Monthly  wage: " + dailyWage*20);
    }
}





