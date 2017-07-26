
public class OneDtoTwoD {

	public static void main(String[] args) {
		int a[]={1,10,4,22,35};
		int b[][]=new int[5][5];
		int sum,p;
		int i,j;
		for( i=0;i<a.length;i++)
		{
			sum=0;
			for( j=i+1;j<a.length;j++)
			{ 
			  for( p=i;p<j;p++)
				  
			  {
				  System.out.println("The value of a[p] is "+a[p]);
				  sum=sum+a[p];
				  
			  }
			  System.out.println(" ");
			  b[i][j]=sum;
			  sum=0;
			}
			System.out.println("The value of i and j is "+i+" "+j);
			
		}
		for(int x=0;x<a.length;x++)
		{
			for(int z=0;z<a.length;z++)
			{
				System.out.print(b[x][z]);
				System.out.print(" ");
			}
			System.out.println();
		}

	}

}
