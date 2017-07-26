import java.util.Scanner;
public class MergeSortNlogn
{
	int len;
	int a[];
	int left[];
    int right[];
    int mid;
	public static void main(String [] args)
	{
		new MergeSortNlogn().solve();
	}
	public void solve()
	{
		System.out.print("Enter length of i/p array: ");
		len=new Scanner(System.in).nextInt();
		a=new int[len];
		System.out.println();
		System.out.println("Enter the elements into array ");
		for(int i=0;i<len;i++)
		{
			a[i]=new Scanner(System.in).nextInt();
		}
		
		System.out.println("The original array is ");
		for(int i=0;i<len;i++)
		{
			System.out.print(a[i]+" ");
		}
	   Sort(a);
	}
	
	public void Sort(int a[])
	{
		int start=0;
		int end=len;
		mergeSort(a,a,start,end);
		
		System.out.println("The sorted array is ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	public void mergeSort(int a[],int comp[],int start,int end)
	{
	    
		if(end-start<2 || comp.length==1)
			{
			
			return;
			
			}
		   
		   System.out.println("\nComp array is ");
		   for(int i=0;i<comp.length;i++)
			   System.out.println(comp[i]);
		
			System.out.println("\nEnd is "+end+" and start is "+start+" end-start is"+ (end-start));
			System.out.println("I am here to break this array ");
			for(int z=start;z<end;z++)
				{
				//System.out.println("z is "+z);
				 //System.out.println("a[0] is "+a[0]);
				 System.out.println(a[z]);
				}
			
		  mid=(end-start)/2;  //len=9, start=0,end=9, mid=4;  len=10, start=0,end=10, mid=5,
		  System.out.println("\nMid value is "+mid);
		  left=new int[mid]; //left=4, left=5
		  System.out.println("\nThe comp.length is "+comp.length);
		  if(comp.length>2)
		   right=new int[end-mid];//right=5
		  else if(comp.length<=2)
			  right=new int[end-mid-1];
		  System.out.println("length of left array is "+left.length+" and length of right array is "+right.length);
		  for(int i=0;i<mid;i++)
		  {
			  left[i]=comp[i];
			  
		  }
		  System.out.println("Left array is ");
		  for(int i=0;i<mid;i++)
		  {
			  System.out.println(left[i]);
		  }
		  
		  for(int i=mid;i<end;i++) 
		  {
			 if(i>right.length && comp.length==2)
			 {
				 System.out.println("entered ");
				break;
			 
			 }
			 
			//  System.out.println("\ni is "+i);
			 // System.out.println("i-mid is "+(i-mid));
			  //System.out.println("comp[i] is "+comp[i]);
			  //System.out.println("a[i] is "+a[i]);
			  //System.out.println("stopped here ");
			  System.out.println("comp[i] is "+comp[i]);
			  right[i-mid]=comp[i]; // error here 
		  }
		  System.out.println("Right array is ");
		  for(int i=mid;i<end;i++)
		  {
			 if(i>right.length && comp.length==2)
				 break ;
			  
			  //System.out.println("\ni-mid is "+(i-mid));
			  System.out.println(right[i-mid]);
		  }
		  mergeSort(a,left,start,mid);
		  System.out.println("completed first part ");
		  mergeSort(a,right,mid,end);
		  System.out.println("completed second part ");
		  merge(a,left,mid,right,end-mid);
		  System.out.println("merged in total");
		
		
	}
	public void merge(int a[],int left[],int i,int right[],int j)
	{
		System.out.println("merge called ");
		int k=0;
		int start=0,end=j+1;
		while(start<i && end<j)
		{
			if(left[start]<right[end])
				{
				a[k]=left[start];
				 k++;
				 start++;
				}
				
			else if(right[end]<left[start])
			{
				a[k]=right[end];
				k++;
				end++;
			}
		}
	}
}