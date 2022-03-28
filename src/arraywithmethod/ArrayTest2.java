package arraywithmethod;

import java.util.Scanner;

public class ArrayTest2 {
	
	/*
	 *    Q1)  WAP to sort array data in ascending order using method
	 *    Q2)  WAP to generate following output :
	 *    
	 *         StudentName                Subjects                 Total Marks    Percentage      Remarks
	 *         
	 *                            Math    Science   English 
	 *                            
	 *         Ram                90        60       60                210             70%          pass
	 *         Hari               70        80       80                230             79.39%       pass
	 *         
	 *         
	 *         
	 *      Q3) WAP to find sum of even and odd numbers that contains in an array.
	 *      Q4) WAP to calculate total and average price of 8 mobile.
	 *      Q5) WAP to print 10 country name in ascending order.
	 *      Q6) WAP to display following output :
	 *      
	 *           CountryName          Capital City
	 *           ------------ 	     ----------------
	 *           Nepal					Kathmandu
	 *           India                  Delhi
	 *         
	 */
	
	
	public static void main(String[] args) {
		
		
		String[]  subjects= {"English","Math","Computer","Science","Social"};
		int[]  marks  =  new int[subjects.length];
		
		Scanner sc = new Scanner(System.in);
		
		//write values in marks 
		for(int i=0; i<marks.length; i++) {
			
			System.out.println("Enter marks of "+subjects[i]);
			 marks[i]  = sc.nextInt();
		}
		
		
	   //read marks from array 
		int totalMarks = 0;
		
		for(int mk : marks) {
			System.out.println(mk);
			totalMarks = totalMarks + mk;
		}
		
		System.out.println("Total marks = "+totalMarks);
		System.out.println("Percentage = "+totalMarks/5+"%");
		
	}

}
