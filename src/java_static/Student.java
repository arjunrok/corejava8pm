package java_static;

public class Student {
	
  //instance variable
	int id;
	String name;
	int rollno;
	//static variable
    static String college = "KEC"; //8 byte
    
	void printStudent() {
		System.out.println("Id = "+id);
		System.out.println("Name = "+name);
		System.out.println("Rollno = "+rollno);
		System.out.println("College = "+college);
	}
}
