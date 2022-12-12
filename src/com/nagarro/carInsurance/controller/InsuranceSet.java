package com.nagarro.carInsurance.controller;

import java.util.Scanner;

import com.nagarro.carInsurance.carinfo.CarDetails;


	class CarInsuranceSet {
	    public void getInfo(CarDetails c) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter model" + " ");
	        String Model = sc.next();
	        c.setModel(Model);

	        System.out.print("Enter type" + " ");
	        String Type = sc.next();
	        c.setType(Type);

	        System.out.print("Enter price" + " ");
	        Double Price = sc.nextDouble();
	        c.setPrice(Price);

	        System.out.print("Enter insuranceType" + " ");
	        String Insurance = sc.next();
	        c.setInsurance(Insurance);
	    }
	}

