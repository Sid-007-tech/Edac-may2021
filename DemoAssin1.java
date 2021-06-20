abstract class Parent
{
  abstract void messege();
}
class Child1 extends Parent
{
  void messege()
  {
    System.out.println("this is first subclass");
  }

}
class Child2 extends Parent
{
  void messege()
  {
  System.out.println("this is second subclass");
  }
}
class DemoAssin1
{
  public static void main(String args[])
  {
    Child1 C1=new Child1();
	C1.messege();
	Child2 C2=new Child2();
	C2.messege();
  
  }

}