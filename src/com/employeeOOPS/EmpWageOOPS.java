package com.employeeOOPS;
import java.util.*;

public class EmpWageOOPS {
static final int FULLTIME=2;
static final int PARTTIME=1;
final String CNAME;
final int WAGE;
final int HOUR;
final int DAYS;

EmpWageOOPS(String company_name, int wage_per_hr, int work_hr, int work_days)
{
    CNAME = company_name;
    WAGE = wage_per_hr;
    HOUR = work_hr;
    DAYS = work_days;

}
int getworkinghour(){
    Random r = new Random();
    int present = r.nextInt(3);
    switch (present) {
        case FULLTIME:{
            // System.out.println("Employee is present: Full time");
            return 8;}

        case PARTTIME:
            //System.out.println("Employee is present: Part time");
            return 4;


        default:
            //System.out.println("Employee is absent");
            return 0;
    }
}
    public static void main(String args[]) {
        System.out.println("Welcome to Employee Wage Program");
        EmpWageOOPS tcs = new EmpWageOOPS("TCS", 20, 100, 18);
        EmpWageOOPS hcl = new EmpWageOOPS("HCL", 22, 80, 20);

        tcs.calculate();
        System.out.println(" ------------------------------------------");
        hcl.calculate();

    }
    public void calculate() {

        int count = 0;//to keep a count of number of days worked
        int workingHR;
        int totHour=0;

        System.out.println(" Company Name is - "+CNAME);
        System.out.println(" Company Wage is - "+WAGE);
        System.out.println(" Company's Working hour' - "+HOUR);
        System.out.println(" Company's Satisfactory attendance days' - "+DAYS);
        while(totHour!= HOUR && count!=DAYS) {
        workingHR = getworkinghour();
        totHour=totHour+workingHR;
        count++;
        }
        int TotalWage = WAGE * HOUR;

        //System.out.println("Daily Employee wage: " + WAGE);
        System.out.println("Monthly  wage: " + TotalWage);
    }
}






