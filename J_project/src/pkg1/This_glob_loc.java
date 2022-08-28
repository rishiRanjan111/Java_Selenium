package pkg1;

public class This_glob_loc {
	
	
//	int a;
//	
//	public void method(int b)
//	
//	{
//		a=b;
//	}
//	
//	public static void main(String[] args) {
//		
//		This_glob_loc ref_v=new This_glob_loc();
//		ref_v.method(34);
//		System.out.println(ref_v.a);
//	}
	
	//this keyword is used for differentiating between local and global variable
	//this.variableName-------it will always point to the global variable
	
	int a;
	
	public void method(int a)
	
	{
		this.a=a;
	}
	
	public static void main(String[] args) {
		
		This_glob_loc ref_v=new This_glob_loc();
		ref_v.method(34);
		System.out.println(ref_v.a);
	}
	
}
