package assignments;

import java.util.HashSet;
import java.util.Set;

public class Assignment4_2 {

	public static void main(String[] args) {
	
		
		 Set<String> touristAttractiveplaces = new HashSet<String>();
		 touristAttractiveplaces.add("Jama Masjid");
		 touristAttractiveplaces.add("Red Fort");
		 touristAttractiveplaces.add("NainiLake");
		 touristAttractiveplaces.add("BhimTal");
		 touristAttractiveplaces.add("Nainital");
		 touristAttractiveplaces.add("Pink City: Jaipur");
		 touristAttractiveplaces.add("Mussorrie");
		 touristAttractiveplaces.add("Agra:Taj Mahal");
		 touristAttractiveplaces.add("Akshardham");
		 touristAttractiveplaces.add("Rajghat");
	        System.out.println("Number of Tourist Attractive Places are: " + touristAttractiveplaces.size());
	        
	        
	        
	        
	        for(String places :touristAttractiveplaces )

	        {
	        	System.out.println(places);
	        	
	        }
	}

}
