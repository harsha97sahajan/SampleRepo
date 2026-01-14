package superkeyword;

public class SuperConstructorChild extends SuperConstructorParent
{

	public  SuperConstructorChild()
	{
		super();
		System.out.println("child constructor");
		
		
	}
	
	
	public static void main(String[] args)
	{
		SuperConstructorChild obj1 = new SuperConstructorChild ();

	}

}
