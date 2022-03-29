package inheritance;

public class Programmer extends Employee{
	
	 String progLang;
	 String projectName;
	 int bonus;
	 
      public static void main(String[] args) {
		
    	  Programmer pg = new Programmer();
    	  
    	  pg.id = 5555;
    	  pg.name = "Suman Rana";
    	  pg.company = "AppTech";
    	  pg.age = 24;
    	  pg.salary = 800000;
    	  pg.bonus = 20000;
    	  pg.progLang = "java";
    	  pg.projectName = "E-Bank";
    	  
    	  System.out.println("Id = "+pg.id);
    	  System.out.println("Name = "+pg.name);
    	  System.out.println("Company = "+pg.company);
    	  System.out.println("Total Salary = "+(pg.salary+pg.bonus));
    	  
	}
      
}
