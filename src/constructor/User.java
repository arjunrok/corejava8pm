package constructor;

public class User {

	String userName;
	String password;
	
	//================= default constructor ===================
		User(){
		    userName = "root";
		    password = "123";
		}
		
	//================== parameterized constructor =============
	  User(String userName, String password){
		  
		  this.userName  = userName;
		  this.password  = password;
		  
		  //'this' keyword is use to represent current object.
		  // we can call instance variable,method and constructor by using 
		  // this keyword
	  }
	  
    User(String userName){
		  this.userName  = userName;
	  }
	
	void printUser() {

		System.out.println("UserName = " + userName);
		System.out.println("Password = " + password);
	}

	public static void main(String[] args) {

		User u = new User("admin", "admin123");
		u.printUser();
		
	    //'Object' class is the root or parent class in java.
	    // and automatically inherited when creating new class.
		//Class Object is the root of the class hierarchy.Every class has Object as a superclass. All objects,including arrays, implement the methods of this class

	}
}
