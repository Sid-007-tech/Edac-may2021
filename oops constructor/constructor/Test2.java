class Test1
{
    Object show()
   {
   System.out.println("1");
   return null;
   }
}
class Test2 extends Test1
{
     String show()
   {
   System.out.println("2");
   return null;
     }
	 public static void main(String args[])
	 {
	 Test1 t=new Test1();
	 t.show();
	 Test2 t2=new Test2();
	 t2.show();
	 }
}