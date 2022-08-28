package pkg1;

public class Constructors {
	
	public  Constructors()
	{
		this(3);
		System.out.println("Default parameterized");
		
	}
	public  Constructors(int a) {
		System.out.println("one Parametrized");
		
	}
	public  Constructors(int a, int b) {
		this();
		System.out.println("two Parametrized");
		
	}
	public static void main(String[] args) {
		
		Constructors ref_v=new Constructors(3,3);
		
	}

}
