package superkeyword;

public class SuperVariableChild  extends SuperVariableParent
{
    int a = 15;
    public void display()
    {
    	
    	System.out.println(a);
    	System.out.println(super.a);
    }
	public static void main(String[] args) 
	{
		SuperVariableChild obj = new SuperVariableChild();
		obj.display();

	}

}
