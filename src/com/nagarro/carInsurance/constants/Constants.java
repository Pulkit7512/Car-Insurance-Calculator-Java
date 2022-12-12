package com.nagarro.carInsurance.constants;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Constants {
   
	public static final List<String>car_Type=new ArrayList<String>() {{
	add("sedan");
	add("suv");
	add("hatchback");
	}
	};
	public static final List<String>insurance_Type=new ArrayList<String>() {{
		add("basic");
		add("premium");
	}
	};
	
	public static final List<Pair>insurancePercent=new ArrayList<Pair>() {{
		add(new Pair("sedan", 8));
		add(new Pair("suv",10));
		add(new Pair("hatchback",5));
	}
	};
	
}
