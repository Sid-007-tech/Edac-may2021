import java.util.Scanner;
class Simple_interest
{
  public static void main(String args[])
  {
    Scanner sc= new Scanner(System.in);
	System.out.println("enter the value of principal");
	double p= sc.nextDouble();
	System.out.println("enter the value of rate of interest");
	double r= sc.nextDouble();
	System.out.println("enter the value of time ");
	double n= sc.nextDouble();
	
	
    double SI= (p*r*n)/100;
	System.out.println("Simple_interest is: "+SI);
	
  }
}