
public class FunctionArgTest {
	
	public static void main(String[] args)
	{
		new FunctionArgTest().solve();
	}
	public void solve()
	{
	  int a=10;
	  int b=20;
	  test(a,b);
	}
	public void test(int a,int b)
	{
		System.out.println("b is "+b);
		int mid=find(a,b);
		if(b==13)
            return ;
			
			test(a,mid-1);
		
		test(mid+1,b);
	}
	public int find(int a,int b)
	{
	   b=24;
	   int mid=14;
	   return mid;
	}

}
