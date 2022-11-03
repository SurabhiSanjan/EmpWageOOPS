package com.employeeOOPS;
import java.util.*;
public class EmpWageOOPS {
    public static void main(String args[]) {
        int wage = 20;
        int hour = 0;
        System.out.println("Welcome to Employee Wage Program");
        int count = 0;
        while(hour==100){
            Random r = new Random();
            int present = r.nextInt(3);
            switch (present) {
                case 0: {
                    System.out.println("Employee is present: Full time");
                    hour = 8;
                    // System.out.println("Employee is present: Full time");
                    hour = hour + 8;
                    count++;
                }
                break;
                case 1: {
                    System.out.println("Employee is present: Part time");
                    hour = 4;
                    // System.out.println("Employee is present: Part time");
                    hour = hour+ 4;
                    count++;
                }
                break;
                default:
                    System.out.println("Employee is absent");
                    hour = 0;
                    hour = hour + 0;
                    count++;
            }

        }
        if(count==20){
        System.out.println("Employee Satisfied total working hours in a month i.e; 100 hours in 20 working days");
    }
        else {
        System.out.println("Employee Not Satisfied total working hours in a month ");
    }
    int dailyWage = wage * hour;
    System.out.println("Daily Employee wage: " + dailyWage);
    System.out.println("Monthly  wage: " + dailyWage*20);
    }
}
