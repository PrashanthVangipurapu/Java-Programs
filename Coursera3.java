import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class Coursera3 {
    
	int a[];
	int low=0,high=0;
	int countcomp=0;
	public static void main(String[] args) throws Exception {
		new Coursera3().solve();

	}
	public void solve() throws Exception
	{
	
		System.out.println("Enter the length of the array ");
		Scanner s=new Scanner(System.in);
		int len=s.nextInt();
		int a[]=new int [len];
	   System.out.println("Enter the elements ");
		for(int i=0;i<len;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("Intital array is ");
		for(int i=0;i<len;i++)
			System.out.println(a[i]);
		int start=0;
		int end=len-1;
		quickSort(a,start,end);
		System.out.println("Final array is ");
		for(int i=0;i<len;i++)
			System.out.println(a[i]);
		
		System.out.println("number of comparisons are "+countcomp);
	}
	public void quickSort(int a[],int start,int end)
	{
		if(start<end)
		{
		countcomp=countcomp+(end-start);
	     medianOfThree(a,start,end);
         System.out.println("\n\nchanged array is ");
         for(int i=0;i<a.length;i++)
         {
        	 System.out.println(a[i]);
         }
         System.out.println("\n\n");
			int pIndex=partition(a,start,end);
			quickSort(a,start,pIndex-1);
			quickSort(a,pIndex+1,end);
		}
	}
	public void medianOfThree(int a[],int start,int end)
	{
		int median;
	      int mid = (start + end - 1) / 2;
	      if (a[start] < a[mid]) {
	        if (a[mid] < a[end - 1]) {
	          median = mid;
	        } else if (a[start] < a[end - 1]) {
	          median = end - 1;
	        } else {
	          median = start;
	        }
	      } else {
	        if (a[end - 1] < a[mid]) {
	          median = mid;
	        } else if (a[end - 1] < a[start]) {
	          median = end -1;
	        } else {
	          median = start;
	        }
	        
	        int temp = a[start];
	        a[start] = a[median];
	        a[median] = temp;
	      }
	}
	public int partition(int a[],int start,int end)
	{
		int middle=start+((end-start)/2);
		int temp=a[middle];
		a[middle]=a[start];
		a[start]=temp;
		
		int pivot=a[start];
		 int i=start+1;
		 for(int j=start+1;j<=end;j++)
		 {
			 if(a[j]<pivot)
			 {
				  temp=a[j];
				 a[j]=a[i];
				 a[i]=temp;
			     i=i+1;
			     
			 }
		 }
			  temp=a[start];
			 a[start]=a[i-1];
			 a[i-1]=temp;
		   // System.out.println("the value of pivot returning is "+(i-1));
	         return i-1;	


	}

}

