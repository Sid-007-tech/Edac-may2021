class Bird
{
   void fly()
   {
   System.out.println("i am flying");
   }
}
class sparrow extends Bird
{
   void eat()
   {
   System.out.println("i am eating");
   }
  public static void main(String args[])
   {
     sparrow b =new sparrow();
	 b.fly();
	 b.eat();
   
   }
}