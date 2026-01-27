package Collection;

import java.util.HashSet;
import java.util.Set;

public class GenericSetCollection {

	public static void main(String[] args)
	{
	    Set<String> a = new HashSet<String>();
	    a.add("red");
	    a.add("blue");
	    a.add("green");
	    Set<String> a1 = new HashSet<String>();
	    a1.add("white");
	    a1.add("orange");
	    a.addAll(a1);
	    System.out.println(a);
	    System.out.println(a.contains(a1));
	    System.out.println(a.containsAll(a1));
	    System.out.println(a.isEmpty());
	    System.out.println(a.removeAll(a1));
	    System.out.println(a.size());
	    a.clear();
	    System.out.println(a);
	    
	  

	}

}
