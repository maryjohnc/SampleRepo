package abstraction;

public class Child extends Parent {

	public static void main(String[] args) 
	{
		Child obj=new Child();
		obj.display();
		obj.print();
		obj.show();

	}

	@Override
	public void print() {
		System.out.println("print method of abstract");
		
	}

	@Override
	public void display() {
		System.out.println("display method of abstract");
		
	}
	

}
