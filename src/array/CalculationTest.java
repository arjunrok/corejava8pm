package array;

public class CalculationTest {

	public static void main(String[] args) {
		
		
		int[][]  populations = {{1999,3434,4545},
								{343434,565565,798998},
								{5000,30000,23232}
		};
			 
	     String[] students =   {"Ram","Hari","Shiva"};	
	    
		   System.out.print("Student Name \t\t"+"sub1\t"+"sub2\t"+"sub1\t"+"Total\t"+"Remarks\n");
	     
		for(int i = 0; i<3; i++) {
			System.out.print(students[i]+"\t\t");
			int total = 0;
			
			for(int j=0; j<populations[i].length; j++) {
				System.out.print("\t"+populations[i][j]);
                total += populations[i][j];
			}
			System.out.print("\t"+total);
			String result = (total>50000)?"Pass" : "Fail";
			System.out.print("\t"+result);
			
			System.out.println();
		}
		
	   	
		/*
		 *    studentName                  Subjects                       Total    Remarks
		 *                     Math	 Science  Computer Nepali  Social      600  	pass
		 *     Ram  									 			
		 *     Hari 												
		            
		 * 
		 */
		
		
		

//		int mat1[][] = { { 30, 70 }, { 10, 90 } };
//		int mat2[][] = { { 5, 7 }, { 9, 5 } };
//		int mat3[][] = new int[2][2];
//
//		for (int i = 0; i < 2; i++) {
//
//			for (int j = 0; j < 2; j++) {
//
//				mat3[i][j] = mat1[j][i] + mat2[i][j];
//				System.out.print(mat3[i][j] + " ");
//			}
//			System.out.println();
//		}
	}
}
