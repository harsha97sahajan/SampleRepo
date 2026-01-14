package accessmodifiers;

public class AccessOne 
{

	public void display()
	{
		System.out.println("public");
	}
	private void display1()
	{
		System.out.println("private");
	}
	protected void display2()
	{
		System.out.println("protected");
	}
	
	void display3()
	{
		System.out.println("Default");
	}
	
	public static void main(String[] args)
	{
		
    AccessOne obj1 = new AccessOne();
    obj1.display();
    obj1.display1();
    obj1.display2();
    obj1.display3();
	}

}
