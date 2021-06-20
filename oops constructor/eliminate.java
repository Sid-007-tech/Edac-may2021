import java.util.*;
class eliminate
{
  public static void main(String args[])
  {
  List<String> l= new ArrayList<String>();
  l.add("man");
  l.add("women");
  l.add("legends");
  l.add("me");
  l.add("me");
  System.out.println(l.toString());
  
  Set<String> s = new LinkedHashSet<String>(l);
  System.out.println(s);
  }
}