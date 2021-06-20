
import java.util.Scanner;
class Calender
{
   public static void main(String args[])
   {
     Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the nomber of days");
	 int Days=sc.nextInt();
	 int Years=Days/365;
	 int months=(Days%365)/30;
	 int days=((Days%365)%30);
	 
	 System.out.println("no of years"+Years);
	 System.out.println("no of months"+months);
	 System.out.println("no of days reamaining"+days);
   }
}