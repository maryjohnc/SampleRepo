package aggregation;

public class Aggregation2 
{
	String city;
	String state;
	Aggregation1 ref;
	public Aggregation2(String city,String state,Aggregation1 ref)
	{
	 this.city=city;
	 this.state=state;
	 this.ref=ref;
	 
	}
	public void display()
	{
		System.out.println("name: "+ref.name);
		System.out.println("rollno: "+ref.rollno);
		System.out.println("address: "+ref.address);
		System.out.println("city: "+city);
		System.out.println("state: "+state);
	}

	public static void main(String[] args) 
	{
		Aggregation1 obj=new Aggregation1("Ann",23,"zarooni");
		Aggregation2 obj1=new Aggregation2("kollam","kerala",obj);
		obj1.display();

	}

}
