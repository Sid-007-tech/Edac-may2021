class mammels{
   void m1(String s) {
       System.out.println(s);
   }
}
class marineAnimals extends mammels{
       void m1(String s) {
        System.out.println(s);
       }
}
class blueWhale extends marineAnimals{
     public void m1(String s) {
       System.out.println(s);
    }
}

public class TestMammels {
    public static void main(String [] args){
    mammels m = new mammels();
    marineAnimals ma = new marineAnimals();
    blueWhale b = new blueWhale();
    m.m1("i am mammle");
    ma.m1("i am marine animal");
    b.m1("i am mammel as well as marine animal");
    }
}

