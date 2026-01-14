package inheritance;

public class HiarchicalChild2 extends HiarchicalParent{
	public void dispaly3()
	{
		System.out.println("child2");
	}

	public static void main(String[] args) {
		HiarchicalChild2 obj2 = new HiarchicalChild2();
		obj2.dispaly();
		obj2.dispaly3();
		// TODO Auto-generated method stub

	}

}
