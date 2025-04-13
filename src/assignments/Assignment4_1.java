package assignments;

import java.util.ArrayList;
import java.util.List;

public class Assignment4_1 {

	public static void main(String[] args) {

		List<String> citiesTop5Name = new ArrayList<String>();
		citiesTop5Name.add("Bangalore");

		citiesTop5Name.add("Delhi");

		citiesTop5Name.add("Mumbai");

		citiesTop5Name.add("Hyderabad");

		citiesTop5Name.add("Calcutta");

		 List<Integer> citieIntegers = new ArrayList<Integer>();
		 
		 citieIntegers.add(0, 1122);
		 citieIntegers.add(1, 1123);
		 citieIntegers.add(2, 1124);
		 citieIntegers.add(3, 1125);
		 citieIntegers.add(4, 1126);
		 
		
		 
		Integer sum= citieIntegers(2)+ citieIntegers(3);
		
		System.out.println("Average of 3rd and 4th cities are:"+sum/2);


		  System.out.println("3 rd citi is " + citiesTop5Name.get(3));
		  System.out.println("3 rd citi is " + citiesTop5Name.get(4));
		 
		for (String totalCities : citiesTop5Name) { System.out.println(totalCities);
 
}
 
 int totalCities = citiesTop5Name.size();
 System.out.println("Total Cities are :" + totalCities);
		 
	}
	
}
