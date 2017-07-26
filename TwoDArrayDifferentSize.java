
public class TwoDArrayDifferentSize {
	public static void main(String[] args)
	{
		int a[][]=new int[5][];
		for(int i=0;i<a.length;i++)
		{
			a[i]=new int[i+10];
		}
		System.out.println(a[0].length);
		System.out.println(a[1].length);
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=i+j;
			}
		}
		
		System.out.println("The array is");
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
