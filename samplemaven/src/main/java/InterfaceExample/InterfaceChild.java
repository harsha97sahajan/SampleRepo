package InterfaceExample;

public class InterfaceChild implements Interface1 {

	public static void main(String[] args)
	{
//		InterfaceChild obj1 = new InterfaceChild();
//		obj1.Display();
//		obj1.Print();
//		obj1.Print1();
		
		Interface1 obj1 = new InterfaceChild();
		obj1.Display();
		obj1.Print();
	}

	public void Display() 
	{
      System.out.println("Methode 1");	
	}

	@Override
	public void Print()
	{
		System.out.println("Methode 2");
	}
	
	public void Print1()
	{
		System.out.println("Child Methode");
	}

}
