package com.nagarro.carInsurance.controller;

import java.util.Scanner;

import com.nagarro.carInsurance.calculator.CarInsuranceCalculator;
import com.nagarro.carInsurance.carinfo.CarDetails;
import com.nagarro.carInsurance.validation.CarInsuranceValidation;

public class CarInsuranceController {
	 public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         char chr = 0;
         do{
             try {
                 CarInsuranceSet s = new CarInsuranceSet();
                 CarDetails c = new CarDetails();
                 
                 s.getInfo(c);
                 if(CarInsuranceValidation.infoValidation(c)==false){
                     System.out.println("********** Wrong Input Type **********");
                 }
                double insurancePremium= CarInsuranceCalculator.getResult(c);
                System.out.println("-------------Output---------------");
    	        System.out.println("Car Type is: " + c.getType());
    	        System.out.println("Car Model is: " + c.getModel());
    	        System.out.println("Car Cost Price is: " + c.getPrice());
    	        System.out.println("Car Premium Type is: " + c.getInsurance());
    	        System.out.println("Total insurance to be paid :: Rs. " + insurancePremium);
    	        System.out.println("-----------------------------------");
                 System.out.print("Do you want to enter details of any other car (y/n): ");
                 chr = sc.next().charAt(0);
             } catch (Exception e) {
                 System.out.println("Please Enter a Valid Input");
             }
         }while(chr=='y');

     }
}



