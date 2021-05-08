import java.util.*;
class A6
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter 2 integer nos :");
int i= sc.nextInt();
int j= sc.nextInt();
int k= i+j;
int l= i-j;
int m= i*j;
int n= i/j;
int o= i%j;
System.out.println("Addition :"+i+"+"+j+"="+k);
System.out.println("Substraction:"+i+"-"+j+"="+l);
System.out.println("Product :"+i+"*"+j+"="+m);
System.out.println("Division :"+i+"/"+j+"="+n);
System.out.println("Modulus :"+i+"%"+j+"="+o);
}
}