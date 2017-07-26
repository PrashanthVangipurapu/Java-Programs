
public class arrayParameterTest {

	int a[];
	public static void main(String[] args)
	{
		new arrayParameterTest().solve();
	}
	public void solve()
	{
		a=new int[5];
		for(int i=0;i<5;i++)
			a[i]=i;
	    int c=5;	
		replace(a,3,c);
		System.out.println("In main");
		for(int i=0;i<5;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("\n in main c is "+c);
	}
	public void replace(int b[],int i,int c)
	{
		b[i]=100;
		System.out.println("in function ");
		c=100;
		for(int j=0;j<5;j++)
		{
			System.out.println(b[j]);
		}
		System.out.println("in function c is "+c);
	}
}
