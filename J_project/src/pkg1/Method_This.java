package pkg1;

public class Method_This {
		
		public void method1() 		
		{
			this.method3(4, 6);
			System.out.println("Default parametrized");
			this.method2(4);
		}
		public void method2(int a)
		{
			System.out.println("one parametrized");
			
		}
	
		public void method3(int a, int b) 
		{
			this.method4(3, 4, 6);
			System.out.println("two parametrized");
		
		}
	
		public void method4(int a, int b, int c) 
		{
			System.out.println("three parametrized");
			
	
		}
		
		public static void main(String[] args) {
			Method_This ref_v=new Method_This();
			ref_v.method1();
		}


}
