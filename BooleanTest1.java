import java.util.Random;

public class BooleanTest1 {
	public static void main(String[] args)
	{
		Random r=new Random();
		boolean a[]=new boolean[5];
		for (int i=0;i<a.length;i++)
		{
			a[i]=r.nextBoolean();
		}

	 for (int i=0;i<a.length;i++)
		 System.out.println(a[i]);
	 
	 double d=r.nextDouble();
	 System.out.println(d);
	}

}
