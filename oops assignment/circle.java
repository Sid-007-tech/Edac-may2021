import java.util.Scanner;
class circle
{
  public static void main(String args[])
  {
    Scanner sc= new Scanner(System.in);
	System.out.println("enter the value");
	double r= sc.nextDouble();
	
	double area= 3.14*r*r*r;
	System.out.println("Area of a circle"+area);
	
	double circumference=2*3.14*r;
	System.out.println("Circumference is: "+circumference);
  }
}