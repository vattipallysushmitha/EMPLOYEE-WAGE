package com.bridzelab.EmpWage;

import java.util.Random;

public class EmpWage 
{
	 public static final int IS_PART_TIME = 1;
	    public static final int IS_FULL_TIME = 2;

	    public static int computeEmpWage(String company, int empRatePerHour,
	                                     int  numOfWorkingDays, int maxHoursPerMonth){

	       // Variables

	       int empHrs = 0;
	       int totalEmpHrs = 0;
	       int totalWorkingDays = 0;

	       //Computation
	       while (totalEmpHrs <=maxHoursPerMonth &&
	               totalWorkingDays < numOfWorkingDays)
	        {
	             totalWorkingDays++;
	             int empCheck = (int) Math.floor(Math.random() * 10) % 3;
	             switch (empCheck) {

	                 case IS_PART_TIME:
	                     empHrs = 4;
	                     break;

	                 case IS_FULL_TIME:
	                     empHrs = 8;
	                     break;
	                 default:
	                     empHrs = 0; 

	             }

	             totalEmpHrs += empHrs;
	             System.out.println("Day#: " + totalWorkingDays + " Emp Hr: " + empHrs);

	        }

	        int totalEmpWage = totalEmpHrs * empRatePerHour;
	        System.out.println("Total Emp Wage for Company: " +
	                            company+" is: " + totalEmpWage);
	        return totalEmpWage;
	     }

	     public static void main(String[] args) 
	     {
	    	 System.out.println("Welcome to Employee Wage for multiple companies");

	    	 System.out.println("*********************************");
	        computeEmpWage("ORACLE", 20, 2, 10);
	        System.out.println("*********************************");
	        computeEmpWage("AMAZON", 10, 4, 20);
	        System.out.println("*********************************");
	        computeEmpWage("IBM", 50, 30, 200);
	        System.out.println("*********************************");
	        computeEmpWage("BRIDZELAB", 50, 3, 50);
	     }
	}