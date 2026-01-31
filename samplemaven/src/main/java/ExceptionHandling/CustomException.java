package ExceptionHandling;

public class CustomException {

	public static void main(String[] args) throws VotingException {
		// TODO Auto-generated method stub
		int age = 15;
		if(age > 20)
		{
			System.out.println("eligible");
		}
		
		else
		{
			throw new VotingException("not eligible");	
		}
	}

}
