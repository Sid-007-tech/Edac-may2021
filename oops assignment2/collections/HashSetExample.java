import java.util.*;
class HashSetExample
{
    public static void main(String args[])
	{
	HashSet <String> hs= new HashSet<String>();
	hs.add("Amit");
	hs.add("raghav");
	hs.add("yogesh");
	hs.add("vipin");
	
	Iterator<String> it=hs.iterator();
	while(it.hasNext())
	{
	System.out.println(it.next());
	}
	
	
	}

}
