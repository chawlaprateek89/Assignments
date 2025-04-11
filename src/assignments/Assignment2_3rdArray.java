package assignments;

public class Assignment2_3rdArray {

	public static void main(String[] args) {

		String[][][] stdDetails = new String[5][2][6];

		stdDetails[0][0][0] = "Matematics";
		stdDetails[0][1][0] = "Pass(78)";
		stdDetails[1][0][0] = "Matematics ||";
		stdDetails[1][1][0] = "Pass(88)";
		
		
		stdDetails[1][0][3] = "Basic Electronics";
		System.out.println("Semester 2 Subject 4 are "+stdDetails[1][0][3]);
		
		stdDetails[1][0][5] = "Engineering Graphics";
		System.out.println("Semester 2 Subject 5 are "+stdDetails[1][0][5]);
		
		stdDetails[3][1][5] = "Pass(87)";
		System.out.println("The Status/Marks of Semester 4 Subject 6 are "+stdDetails[1][0][5]);
		
		
		stdDetails[3][1][2] = "Fail(19)";
		System.out.println("The Status/Marks of Semester 4 Subject 3 are "+stdDetails[1][0][5]);
		

	}

}
