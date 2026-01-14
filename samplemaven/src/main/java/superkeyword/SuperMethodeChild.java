package superkeyword;

public class SuperMethodeChild extends SuperMethodeParent
{
     
	public void display()
	{
		System.out.println("Child Methode");
		super.display();
	}
	public static void main(String[] args)
	{
		SuperMethodeChild obj1 = new SuperMethodeChild();
		obj1.display();

	}

}
