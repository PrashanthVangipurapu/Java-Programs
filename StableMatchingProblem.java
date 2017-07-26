import java.util.Scanner;

public class StableMatchingProblem {
	public static void main(String [] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number of men and women ");
		int count=s.nextInt();
		int men=count;
		int women=count;
		String[] mL=new String[men];
		String[] wL=new String[women];
		System.out.println("Enter names into men's list ");
		for(int i=0;i<count;i++)
		{
			mL[i]=s.next();
		}
		
		System.out.println("Enter names into women's list");
		for(int i=0;i<count;i++)
		{
			wL[i]=s.next();
		
		}
		
		
	}

}
