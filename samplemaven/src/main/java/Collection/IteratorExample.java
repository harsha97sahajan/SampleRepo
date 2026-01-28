package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Set<String> a = new HashSet<String>();
		 a.add("red");
		 a.add("blue");
		 a.add("green");
		 System.out.println(a);
		 Iterator it = a.iterator();
		 while(it.hasNext())
		 {
			 System.out.println(it.next());
		 }
		 it.remove();
		 System.out.println(a);

	}

}
