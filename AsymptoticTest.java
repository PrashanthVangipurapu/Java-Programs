
public class AsymptoticTest {

	public static void main(String[] args) {
		int a[]=new int[20];
		for(int i=0;i<10;i++)
			a[i]=i;
		int i,j;
		for(i=0;i<20;i++)
		{
			System.out.println();
			for(j=i+1;j<20;j=j+2)
			{
				System.out.println(a[i]+" "+a[j]);
			}
				
		}

	}

}
