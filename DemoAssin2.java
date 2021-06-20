interface Shapes
{
 
  int rectangleArea(int lenght,int breadth);
  int squareArea(int side);
  double circleArea(int radius);

}

class Area implements Shapes
{
  public int rectangleArea(int lenght,int breadth)
  {
    return lenght*breadth;	
  }
  public int squareArea(int side)
  {
   return side*side;
  }
  public double circleArea(int radius)
  {
  return 3.14*radius*radius;
  }
}
class DemoAssin2
{
   public static void main(String args[])
   {
	    int lenght,breadth,side;
  int radius;
   Area A=new Area();
   
   System.out.println(A.rectangleArea(10,12));
   System.out.println(A.squareArea(23));
   System.out.println(A.circleArea(19));
      }
}