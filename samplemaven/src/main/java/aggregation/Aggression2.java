package aggregation;

public class Aggression2 {
	
	String city, state;
	Aggregation1 ref;
	public Aggression2(String city , String state, Aggregation1 ref)
	{
		this.city = city;
		this.state = state;
		this.ref = ref;
		
		
	}
	public void display()
	{
		System.out.println(ref.name + " " + ref.roll_no + " "+ref.address +" " +city +" "+ state);
	}

	public static void main(String[] args)
	{
		Aggregation1 obj1 = new Aggregation1("harsha", 1, "affsfs");
		Aggression2 obj2 = new Aggression2("kannur","kerala",obj1);
		obj2.display();

	}

}
