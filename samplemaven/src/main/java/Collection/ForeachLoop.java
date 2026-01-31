package Collection;

import java.util.HashSet;
import java.util.Set;

public class ForeachLoop {



	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Set<String> a = new HashSet<String>();
		 a.add("red");
		 a.add("blue");
		 a.add("green");
		 System.out.println(a);
		 for(String s : a)
		 {
			 System.out.println(s);
		 }
		 
		 int a2[][]= {{1,2,3},{3,4,6}};
	       for(int i[]:a2)
	       {
	    	   for(int j:i)
	    	   { System.out.print(j+" ");
	    	   
	    	   }
	    	   System.out.println();
	       }

	}

}
