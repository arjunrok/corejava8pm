package abstraction;

import java.io.Serializable;

//inheritance between interface
public interface UserService extends CommonService,Runnable,Serializable{
	
    void addUser();
    void deleteUser();
    
    /*
     *     Note :
     *     
     *       class 		<- implements 	<- interface
     *       class 		<- extends     	<- class (single)
     *       interface  <- extends  	<- interface (multiple)
     *       class		<- extends 		<- class  <- implements <- interface 
     */
}


