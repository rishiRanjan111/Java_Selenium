//  Assignment1
//((((10+2)+2)-2)*2)/2)

package pkg1;

public class Assignment1 {
	
	public int add(int a, int b )
	{
		int a1=a;
		int b1=b;
		return a1+b1;
	}
	public int sub(int a, int b)
	{
		int c1=a;
		int d1=b;
		return c1-d1;
	}
	public int mul(int a,int b)
	{
		int e1=a;
		int f1=b;
		return e1*f1;
	}
	public void div(int a, int b)
	{
		int g1=a;
		int h1= b;
		int s=g1/h1;
		System.out.println(s);
		
	}

	public static void main(String[] args) {
		Assignment1 ref_v=new Assignment1();
		int x=ref_v.add(10, 2);
		int y=ref_v.add(x, 2);
		int z=ref_v.sub(y, 2);
		int w=ref_v.mul(z, 2);
		ref_v.div(w, 2);
		
	}
}
