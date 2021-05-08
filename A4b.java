import java.util.*;
class A4b
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter 3 integer nos :");
int i= sc.nextInt();
int j= sc.nextInt();
int k= sc.nextInt();
int l= (i+j)%k;
System.out.println("output :"+l);
}
}