class Test
{
   void animal(Object o)
   {
   System.out.println("1");
   }
   void animal()
   {
   System.out.println("2");
   }
   


 public static void main(String args[])
 {
	 
	Test t = new Test();
	t.animal('v');
	t.animal(" ");
 }
 
 
}