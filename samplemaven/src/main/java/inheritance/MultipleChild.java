package inheritance;

public class MultipleChild implements MultipleParent1 , MultipleParent2{

	
	public void display()
	{
		System.out.println("Multiple Child"); 
		
	}
	public static void main(String[] args) {
		MultipleChild obj1 =new MultipleChild();
		obj1.print();
		obj1.display();
		obj1.Print1();

	}
	@Override
	public void Print1() {
		System.out.println("Parent 1"); 
		
	}
	@Override
	public void print() {
		System.out.println("Parent 2"); 
		
	}

}
