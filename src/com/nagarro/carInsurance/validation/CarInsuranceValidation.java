package com.nagarro.carInsurance.validation;

import com.nagarro.carInsurance.carinfo.CarDetails;

public class CarInsuranceValidation {
	 public static boolean infoValidation(CarDetails c)
	    {
	        boolean infoValidation = true;
	        String carType = c.getType();
	        String insurance = c.getInsurance();
	        Double carPrice = c.getPrice();

	        if(!(carType.equalsIgnoreCase("Sedan") || carType.equalsIgnoreCase("SUV") ||carType.equalsIgnoreCase("hatchback")))
	        {
	            infoValidation = false;
	        }
	        if(carPrice!=0 && carPrice<0)
	        {
	            infoValidation = false;
	        }
	        if(!(insurance.equalsIgnoreCase("basic") || insurance.equalsIgnoreCase("premium")))
	        {
	            infoValidation = false;
	        }

	        if(infoValidation==false)
	        {
	            return false;
	        }
	        else
	        {
	            return true;
	        }
	    }

}
