abstract class parent
{
  abstract void m1();
  abstract void m2();
  abstract void m3();
}
 abstract class child extends parent
 {
   void m1(){
   System.out.println("m2");
   
   }
   void m2(){
   System.out.println("m2");
   }
 }
 class child2 extends child
 {
	 void m3()
	 {
		 System.out.println("m3");
	 }
	 
 }
 class demo1
 {
    public static void main(String args[])
	{
	child2 c1=new child2();
	c1.m1();
	c1.m2();
	c1.m3();
	
	}
 }
