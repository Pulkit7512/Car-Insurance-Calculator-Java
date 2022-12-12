package com.nagarro.carInsurance.calculator;

import com.nagarro.carInsurance.carinfo.CarDetails;
import com.nagarro.carInsurance.constants.Constants;
import com.nagarro.carInsurance.constants.Pair;
import com.nagarro.carInsurance.validation.CarInsuranceValidation;

public class CarInsuranceCalculator {
	 public static double getResult(CarDetails c){
	        String type = c.getType();
	        Double price = c.getPrice();

	        String Insurance = c.getInsurance();
	        double ans = 0;
	    //    Pair p= new Pair();
	        if(Constants.car_Type.contains(type)&&CarInsuranceValidation.infoValidation(c)){
	        	int index=Constants.car_Type.indexOf(type);
	        	
	        	Pair p=Constants.insurancePercent.get(index);
	            ans = price*((double)p.insuranceRate/100.0)  ;
	            
	        }

	        if(Constants.insurance_Type.get(1).equalsIgnoreCase(Insurance)){
	            ans += (0.2*ans);
	        }
	      return ans;

	    }
}
