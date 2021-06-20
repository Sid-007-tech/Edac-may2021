interface mammal{
    default void display(){
        System.out.println("i am mammal");
    }
}
interface animal{
    default void show(){
        System.out.println("i am animal");
    }
}

public class BlueWhale implements mammal,animal {
    public void list(){
        System.out.println("i am of catagory mammal and animal");
    }
   public static void main(String args[])
   {
       BlueWhale b = new BlueWhale();
       b.display();
       b.show();
       b.list();
   }    
}
