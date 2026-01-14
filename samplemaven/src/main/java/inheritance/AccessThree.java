package inheritance;

import accessmodifiers.AccessOne;

public class AccessThree extends AccessOne{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AccessOne obj3 = new AccessOne ();
		obj3.display();
		AccessThree obj4= new AccessThree();
		obj4.display2();

	}

}
