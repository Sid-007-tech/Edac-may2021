
class Shape{
   
     void print(){
        System.out.println("this is shape");
    }
}
class Polygon extends Shape{
 
    void print(){
        System.out.println("polygon is a shape");
    }
}
class Rectangle extends Polygon{
    
    void print(){
       System.out.println("rectangle is a polygon");
    }
}
class Triangle extends Polygon{
   
    
    void print(){
       System.out.println("Triangle is a polygon");
    }
}
class Square extends Rectangle{
   
    void print(){
        System.out.println("Square is a Rectangle");
    }
}
class AllShape{
	public static void main(String args[]){
    Shape S=new Shape();
    Polygon P=new Polygon();
    Rectangle R=new Rectangle();
    Triangle T=new Triangle();
    Square Sq=new Square();
    S.print();
    P.print();
    R.print();
    T.print();
    Sq.print();
    
} 
}