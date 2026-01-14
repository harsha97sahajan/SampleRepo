package inheritance;

public class MultiLevelChild extends MultiLevelParent
{
	public void dislpay2()
	{
		System.out.println("child");
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		MultiLevelChild obj1 = new MultiLevelChild();
		obj1.displaye();
		obj1.display1();
		obj1.dislpay2();
	}

}
