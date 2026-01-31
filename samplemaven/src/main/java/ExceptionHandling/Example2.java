package ExceptionHandling;

public class Example2 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int age = 15;
		if(age > 20)
		{
			System.out.println("eligible");
		}
		
		else
		{
			throw new ArithmeticException("not eligible");	
		}

	}

}
