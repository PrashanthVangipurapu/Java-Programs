import java.util.Scanner;

public class QuickSort {

	int a[];
	int len;
	int start,end,pIndex;
	public static void main(String[] args)
	{
		new QuickSort().solve();
		
		
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
		
	}
	public void quickSort(int a[],int start,int end)
	{
		if(start<end){
			
		
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
	 System.out.println("I am called for sorting these elements ");
	 for(int i=s;i<=e;i++)
	 {
		 System.out.println(a[i]);
	 }
	 System.out.println();
		int pivot=a[s];
	 int i=s+1;
	 for(int j=s+1;j<=e;j++)
	 {
		 if(a[j]<pivot)
		 {
			 int temp=a[j];
			 a[j]=a[i];
			 a[i]=temp;
		     i=i+1;
		     
		 }
	 }
		 int temp=a[s];
		 a[s]=a[i-1];
		 a[i-1]=temp;
	    System.out.println("the value of pivot returning is "+(i-1));
         return i-1;	
	
	}
}
	

