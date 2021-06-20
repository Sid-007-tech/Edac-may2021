//10.	Write a program to convert temperature from Fahrenheit to Celsius.
 //Take Fahrenheit as input using Scanner class. [ formula : C= 5*(f-32)/9 ]
 
 import java.util.Scanner;
 public class Temperature
 {   
 
	 
      public void CalcTemp(float farenhite){
       
	    float C= (farenhite-32)*5/9 ;
        System.out.println("TEMPERATURE IN CELCIUS IS :"+C);		
	   }	  
 
     
     public static void main(String args[])
	 {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the farenhite temperature to be converted");
         float farenhite =sc.nextFloat();	
	   Temperature mytemp = new Temperature();
	   mytemp.CalcTemp(farenhite);
	 }
 }   