import java.util.Scanner;
class Percentage
{
  public static void main(String args[])
  {
    Scanner sc= new Scanner(System.in);
	System.out.println("enter the marks");
	double m1= sc.nextDouble();
	double m2= sc.nextDouble();
	double m3= sc.nextDouble();
	double m4= sc.nextDouble();
	double m5= sc.nextDouble();
	
    double total=m1+m2+m3+m4+m5;
	System.out.println("total"+total);
	double percentage=(total/500)*100;
	System.out.println("percentage is :" +percentage);
  }
}