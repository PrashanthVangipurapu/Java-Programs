import java.util.Scanner;

public class RecursionMemory {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number ");
		int a=s.nextInt();
		RecursionMemory rm=new RecursionMemory();
		rm.calc(a);

	}
	void calc(int n)
	{
		int memo[]=new int[n+1];
		int i=0;
		for(i=0;i<n+1;i++)
		{
			System.out.println(i+" "+fib(n,memo));
		}    
	}

	int fib(int n,int memo[])
	{
		if(n<=0)
		{System.out.println("Entered inside ");
			return 0;
		}
		else if (n==1)
			return 1;
		else if (memo[n]>0)
		{
			return memo[n];
		}
		
		memo[n]= fib(n-1,memo)+fib(n-2,memo);
	    return memo[n];
	}
}
