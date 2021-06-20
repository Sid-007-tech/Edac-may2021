interface  fruits{
  void display();
  int quantity();
 
}
 class mango implements fruits
{
  public void display()
  {
  System.out.printtln("mangoes in bucket");
  }
  public int quantity()
  {
  return 7;
  }
}
class apples implements fruits
{
  public void display()
  {
  System.out.printtln("Apples in bucket");
  }

 public int quantity()
 {return 8;}
}
class Total
{
	public static void main(String args[])
	{
		fruits A = new apples();
A.display();
A.quantity();




	}


}