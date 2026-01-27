package abstraction;

public class AbstarctionChild extends AbstractionParent {

	public static void main(String[] args)
	{
		
		AbstarctionChild obj1 = new AbstarctionChild();
		obj1.display1();
		obj1.display(7, 8);
		obj1.display3();
		
		//referance creation
		AbstractionParent obj2 = new AbstarctionChild();
		obj2.display1();
		obj2.display(8, 2);
	}

	public void display3()
	{
		System.out.println("Methode 3");
	}
	
	@Override
	public void display(int a, int b)
	{
		int c = a+b;
		System.out.println(c);
		
	}

}
