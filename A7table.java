import java.util.*;
class A7table
{
public static void main(String args[])
{
	Scanner SC= new Scanner (System.in);
	int i= SC.nextInt();
	int j;
	int k;
	for(j=1; j<11; j++)
	{
		k= i*j;
	System.out.println(i+ "*" +j+":"+k);
	}
}
}