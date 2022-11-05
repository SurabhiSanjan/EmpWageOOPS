package com.employeeOOPS;
import java.util.*;

public class EmpWageOOPS {

    public static void main(String args[]) {
        System.out.println("Welcome to Employee Wage Program");
        condition("TCS", 20, 100, 18);
        condition("HCL", 22, 80, 20);
    }
    public static void condition(String Name, int wage, int hour, int days) {
        System.out.println("Company Name " + Name);
        System.out.println("Wage per hour: " + wage);
        System.out.println("Maximum working days: " + days);
        System.out.println("Satisfactory working hours: " + hour);
        int count = 0;//to keep a count of number of days worked
        int i=0;
        while(i!= hour) {
            Random r = new Random();
            int present = r.nextInt(3);
            switch (present) {
                case 0: {
                   // System.out.println("Employee is present: Full time");
                    i = i + 8;
                    count++;
                }
                break;
                case 1: {
                    //System.out.println("Employee is present: Part time");
                    i = i + 4;
                    count++;
                }
                break;
                default:
                    //System.out.println("Employee is absent");
                    i = i + 0;
                    count++;
            }

        }
        if (count == days) {
            System.out.println("Employee Satisfied total working hours in a month i.e; 100 hours in 20 working days");
        } else {
            System.out.println("Employee Not Satisfied total working hours in a month ");
        }
        int dailyWage = wage * hour;
        System.out.println("Daily Employee wage: " + dailyWage);
        System.out.println("Monthly  wage: " + dailyWage*days);
    }
}





