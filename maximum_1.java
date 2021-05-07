import java.util.Scanner;
public class maximum_1{
    public static void main(String args[])
	{
	
	Scanner sc = new Scanner(System.in);
	int a1[] = new int [5];
	System.out.println("enter 5 elements");
	
	for (int i=0; i<=4; i++)
	  {
	    a1 [i]= sc.nextInt();
	   }
	int max=a1[0];
	int min=a1[0];
	
	for(int i=0; i<=4;i++)
	{
	  if (a1[i]>max)
	     max=a1[i];
	 else if (a1[i]<min)
		 min=a1[i];
	
	}
	 
	System.out.println("maximum number is is " +max);
	System.out.println("minimum number is is " +min);
}
}