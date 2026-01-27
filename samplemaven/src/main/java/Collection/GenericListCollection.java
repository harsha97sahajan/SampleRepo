package Collection;

import java.util.ArrayList;
import java.util.List;

public class GenericListCollection {

	public static void main(String[] args) 
	{
		
    List<String> data = new ArrayList<String>();
    
    data.add("red");
    data.add("black");
    data.add("blue");
    data.add("green");
    data.add("black");
    data.add("red");
    System.out.println(data);
    System.out.println(data.get(1));
    System.out.println(data.indexOf("red"));
    System.out.println(data.lastIndexOf("red")) ;
    System.out.println(data.remove("red"));
    System.out.println(data.indexOf("red"));
    System.out.println(data.contains("Red"));
    System.out.println(data.size());
    System.out.println(data.contains("red"));
    System.out.println(data.isEmpty());
	}

}
