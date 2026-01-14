package polymorphisam;

public class Child extends Parent
{
	public void display(int a , int b)
	{
		int c = a-b;
		System.out.println(c);
		super.display(10, 10);
	}


	public static void main(String[] args)
	{
		Child obj1 = new Child();
		obj1.display(50, 30);

	}

}
