//IT20118822
//GROUP 9.2
//Sayanthan.K


////student class
package Student_Records_System;

import Student_Records_System.Weekday.IDInvalidException;
// this class defined as abstract
public abstract class Student {
	public abstract void addDetails(String name,String address,String sex,int bornYear,String specialization,String Freeday);
	public abstract void addMark(int m1,int m2,int m3,int m4,int m5);
	public abstract void showDetails();
	public abstract String generateID() throws IDInvalidException, Student_Records_System.Weekend.IDInvalidException;
}

//// Weekday class

package Student_Records_System;
import java.util.Random;
import java.lang.Exception;


public class Weekday extends Student {
	//Initializing addDetails variables
	String name;
	String address;
	String sex;
	int bornYear;
	String specialization;
	String Freeday;
	int rand;
	//
	
	
	// create array in mark
	int mark[] = new int[5];
	
	//Initializing generateID variables
   String fullID;



	
	// implementing the addDetails method
	public void addDetails(String name,String address,String sex,int bornYear,String specialization,String Freeday) {
		this.name = name;
		this.address = address;
		this.sex = sex;
		this.bornYear = bornYear;
		this.specialization = specialization;
		this.Freeday = Freeday;
		
	}
    // implementing the addMark method
	public void addMark(int m1,int m2,int m3,int m4,int m5){
		this.mark[0] = m1;
		this.mark[1] = m2;
		this.mark[2] = m3;
		this.mark[3] = m4;
		this.mark[4] = m5;
	}
	// implementing the showDetails method
	public void showDetails() {
		
	System.out.println("Student name :"+name);
	System.out.println("Student Address :"+address);
	System.out.println("Gender :"+sex);
	System.out.println("Student year :"+bornYear);
	System.out.println("Student specialization :"+specialization);
	System.out.println("Student Freeday :"+Freeday);
		
	
		
	}
	
	

	// create Custom Exception
	public class IDInvalidException extends Exception {

	    public IDInvalidException(String message) {
	        super(message);
	    }
	} 
	
	
	public String generateID() throws IDInvalidException{
		  // create random number object 
		  Random random = new Random();
	      int rand =random.nextInt(20000000);
	      fullID ="IT"+rand;
	      try {
	    	  // check the id length
	      if(fullID.length()<4)  
	          throw new IDInvalidException("not valid");
	      
	      }
	      
	      catch(IDInvalidException ob){
	    	  // if the fullID length is less than four it's  new student ID to be created
	    	  Random random1 = new Random();
		      int rand1 =random1.nextInt(20000000);
		      fullID ="IT"+rand1;
	           
	       } 
	      // if the checking are finished fullID going to be return
	      return fullID;
	    }
	      
	     
	      
		  
	}


//// Weekend class

package Student_Records_System;

import java.util.Random;

import Student_Records_System.Weekday.IDInvalidException;

public class Weekend extends Student {
	//Initializing addDetails variables
	String name;
	String address;
	String sex;
	int bornYear;
	String specialization;
	String jobTitle;
	int rand;
	
	// create array in mark
	int mark[] = new int[5];
	
	//Initializing generateID variables
	String fullID;
	
	
	
	

	
	// implementing the addDetails method
	public void addDetails(String name,String address,String sex,int bornYear,String specialization,String jobTitle) {
		this.name = name;
		this.address = address;
		this.sex = sex;
		this.bornYear = bornYear;
		this.specialization = specialization;
		this.jobTitle = jobTitle;
		
	}
	 // implementing the addMark method
	public void addMark(int m1,int m2,int m3,int m4,int m5){
		this.mark[0] = m1;
		this.mark[1] = m2;
		this.mark[2] = m3;
		this.mark[3] = m4;
		this.mark[4] = m5;
	}
	// implementing the showDetails method
	public void showDetails() {
		
		System.out.println("Student name :"+name);
		System.out.println("Student Address :"+address);
		System.out.println("Gender :"+sex);
		System.out.println("Student year :"+bornYear);
		System.out.println("Student specialization :"+specialization);
		System.out.println("Student jobtitle :"+jobTitle);
	
		
	}
	
	// create Custom Exception
	public class IDInvalidException extends Exception {

	    public IDInvalidException(String message) {
	        super(message);
	    }
	} 
	
	
	public String generateID() throws IDInvalidException{
		  // create random number object 
		  Random random = new Random();
	      int rand =random.nextInt(20000000);
	      fullID = "IT"+rand;
	      try {
	    	  // check the id length
	      if(fullID.length()<4)  
	          throw new IDInvalidException("not valid");
	      
	      }
	      
	      catch(IDInvalidException ob){
	    	  // if the fullID length is less than four it's  new student ID to be created
	    	  Random random1 = new Random();
		      int rand1 =random1.nextInt(20000000);
		      fullID =  "IT"+rand1;
	           
	       } 
	     // if the checking are finished fullID going to be return
	      return fullID;
	    }
}


////Enroll class

package Student_Records_System;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.lang.NullPointerException;

public  class Enroll   {

	
	  //create the Hash map and store the EnrolledStudent details 
	   HashMap<String, String> EnrolledStudent = new HashMap<>();
	   //assign parameter the get the value
	   public  void enrollStudent(String StudentID , String specialization ) {  
		 
		   //adding the value 
		   EnrolledStudent.put(StudentID, specialization );
		   
		   
	   }
	   
	   void  displayEnrolledStudents() {
	       //Hashmap to set
		   for (Map.Entry<String, String> Studentlist :EnrolledStudent.entrySet()) {
			 
				//display set value 	
			   System.out.println((Studentlist.getKey()+" : "+  Studentlist.getValue()));; 
				
			  
			   
	        }
	   }
		   
		  
		
			
}
	   
	   

////specialization class


package Student_Records_System;

import java.util.*;
import java.util.Map.Entry;

public class Specialization {
	
	
	

	public void addSpecialization(String specialization,Double gpa){

    	   // initialize a HashMap
		 HashMap<String, Double> mapp = new HashMap<String, Double>();
   
         // Add elements using put method
         mapp.put(specialization, gpa);
        
         
    }


    }

//// mainprogram


package Student_Records_System;

import Student_Records_System.Weekend.IDInvalidException;

public class mainProgram {

	public static void main(String[] args) throws IDInvalidException {
		// TODO Auto-generated method stub
		// create weekend object 
		Weekend Student1 = new Weekend();
		Student1.addDetails("Jane", "malabe", "F", 1990, "DS","QA");
		String Studentid = Student1.generateID();
		Student1.addMark(56, 34, 12, 46, 78);
		Student1.showDetails();
		System.out.println("StudentID "+Studentid);
		System.out.println("\n");
		
		//create weekday object
		Weekday Student2 = new Weekday();
		Student2.addDetails("Jim", "Kaluthara", "M", 1991, "SE","Tuesday");
		String Studentid2 = Student1.generateID();
		Student2.addMark(78, 89, 45, 87, 90);
		Student2.showDetails();
		System.out.println("StudentID "+Studentid2);
		System.out.println("\n");
		
		//create Enroll object 
		Enroll sem1 = new Enroll();
		sem1.enrollStudent(Studentid,"IT");
		sem1.enrollStudent(Studentid2,"SE");
		System.out.println("\nEnrolled student details");
		sem1.displayEnrolledStudents();
		
		
		//create specialization object
		Specialization spe = new Specialization();
		spe.addSpecialization("SE", 2.6);
		spe.addSpecialization("DS", 3.76);
		
		
		
		

	}

}






		
		
		
		
		
		
	
	












