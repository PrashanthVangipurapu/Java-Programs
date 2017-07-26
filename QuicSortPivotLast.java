/* this program is having pivot at the end. We read input of the array from the user */
import java.util.Scanner;

public class QuicSortPivotLast {

	int a[];
	int len;
	int start,end,pIndex,compSort=0;
	public static void main(String[] args)
	{
		new QuicSortPivotLast().solve();
		
		
	}
	public void solve()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the length of the array ");
		len=s.nextInt();
		a=new int[len];
		System.out.println("Enter the elements ");
		for(int i=0;i<len;i++)
		{
			a[i]=s.nextInt();
		}
		start=0;
		end=len-1;
		//int pindex=partition(a,start,end);
		quickSort(a,start,end);
		
		System.out.println("final array is ");
		for(int i=0;i<=end;i++)
			System.out.println(a[i]);
		
		System.out.println("number of comparisons are "+compSort);
		
	}
	public void quickSort(int a[],int start,int end)
	{
		if(start<end){
			
		compSort=compSort+(end-start);
		System.out.println("Start value is "+start+" and end value is "+end );
		int pIndex=partition(a,start,end);
        System.out.println("end element is "+a[end]);
		System.out.println("for the first time the array is ");
		for(int i=0;i<len;i++)
			System.out.println(a[i]);
		
		System.out.println(" ");
		System.out.println("partition index is "+pIndex); 
		if(pIndex<0)
		  return ;
		
		quickSort(a,start,pIndex-1);
		System.out.println("**first part over**");
		System.out.println("pIndex is "+pIndex+" End is "+end );
		quickSort(a,pIndex+1,end);
		
		
		
		}
	}
	public int partition(int a[],int s,int e)
	{
		System.out.println("the value of s is "+s+" and the value of e is "+e);
		int pivot=a[e];
		 int i=s-1;
		 for(int j=s;j<e;j++)
		 {
			 if(a[j]<pivot)
			 {
				 i=i+1;
				 int temp=a[j];
				 a[j]=a[i];
				 a[i]=temp;
			    // i=i+1;
			     
			 }
		 }
			 int temp=a[e];
			 a[e]=a[i+1];
			 a[i+1]=temp;
		   // System.out.println("the value of pivot returning is "+(i-1));
	         return i+1;	
	
	
	}
}
	

