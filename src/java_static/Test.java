package java_static;

public class Test {
	
	public static void main(String[] args) {
		
		Student s1 = new Student();
		/*
		 *    s1[
		 *    
		 *         id
		 *         name
		 *         rollno
		 *    ]
		 */
		
		s1.id = 509;
		s1.name = "Ram";
		s1.rollno = 707;
		s1.printStudent();
		
		Student s2 = new Student();
		/*
		 *    s2[
		 *    
		 *         id
		 *         name
		 *         rollno
		 *    ]
		 */
		
		s2.id = 309;
		s1.name = "Hari";
		s1.rollno = 209;
		//s1.college = "KEC"; // 8 byte
		
		s2.printStudent();
		
		
		//10 objects => 8 x 1000 = 8000 byte
		
		
	}

}
