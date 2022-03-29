package inheritance;

public class TypesOfInheritance {
	
	/*
	 *    ===================== Types of Inheritance =============
	 *    1> Single Inheritance        : only one child of a parent A <- B
	 *    2> Multilevel Inheritance    : A <- B <- C
	 *    3> Hierarchical Inheritance  : more than one child of a parent. A <- B , A <- C, A <- D
	 *    
	 *    //=========== not supported in java ============================
	 *    4> Multiple Inheritance      :  A,D <- B    {  B extends A,D {  }
	 *    5> Hybrid Inheritance 
	 */
	
	  class A {
		  
		    void print() {
		    	
		    }
	  }
	  
	 
	  class D extends A{
		  
		  void msg() {
		    	
		    }
	  }
	
	  
	  class B extends A {
		  
		    void display() {
		}
	  }
	  
	  class X extends A{
		  
		  
	  }
	

}
