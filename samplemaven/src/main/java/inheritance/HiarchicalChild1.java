package inheritance;

public class HiarchicalChild1 extends HiarchicalParent {
	public void display1()
	{
		System.out.println("child 1");
	}

	public static void main(String[] args) 
	{
		HiarchicalChild1 obj1 = new HiarchicalChild1();
		obj1.dispaly();
		obj1.display1();
		
		// TODO Auto-generated method stub

	}

}
