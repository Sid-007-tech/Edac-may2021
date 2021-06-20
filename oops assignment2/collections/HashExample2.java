import java.util.*;
class HashExample2
{
    public static void main(String args[])
    {
       HashMap<Integer,String> map=new HashMap<Integer,String>();
         map.put(110,"Anuj");
         map.put(111,"Ankita");
         map.put(112,"Aniket");
         map.put(113,"Pooja");
      

       //iterate
    for(Map.Entry m: map.entrySet())
    { 
       System.out.println(m.getKey()+" "+m.getValue());
    }
System.out.println(map);/*
HashMap<Integer,String> hm= new HashMap<Integer,String>();
      hm.put(114,"Vineeta");
      hm.putAll(map);
     for(Map.Entry x: hm.entrySet())
      {
       System.out.println(x.getKey()+"  "+x.getValue());
       }*/
    }
}