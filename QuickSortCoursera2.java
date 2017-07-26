/*this problem belongs to coursera assignment 3. not correct solution. Once check it with QuickTest (change the text file path )in QuickTest.java.*/
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class QuickSortCoursera2 {

	int a[];
	int low=0,high=0;
	int countcomp=0;
	public static void main(String[] args) throws Exception {
		new QuickSortCoursera2().solve();

	}
	public void solve() throws Exception
	{
		File f=new File("F:/books_and_programs/Java_programs/CourseraAlgorithms/CourseraAlgorithms/src/file3.txt");
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		int count=0;
		String line=br.readLine();
		while(line!=null)
		{
			count++;
			line=br.readLine();
			
		}
		br=new BufferedReader(new FileReader(f));
		line=br.readLine();
		int copy;
		int i=0;
		int a[]=new int[count];
		while(line!=null)
		{
			copy=Integer.parseInt(line);
			a[i]=copy;
			i++;
			line=br.readLine();
		}
		System.out.println("Initial array is ");
		for(int j=0;j<count;j++)
			System.out.println(a[j]);
		int start=0;
		int end=count-1;
		
		quickSort(a,start,end);
		System.out.println("The final array is ");
		for(int q=0;q<count;q++)
			System.out.println(a[q]);
		
		System.out.println("Number of comparisons are "+countcomp);
		System.out.println("numtimes is "+numtimes);
	}
	public void quickSort(int a[],int start,int end)
	{
		if(start>=end)
		{
		 return;
		}
			
		countcomp=countcomp+(end-start);
		System.out.println("The value of countcomp is "+countcomp);
		medianOfThree(a,start,end);
		
		int pIndex=partition(a,start,end);
		
		if(pIndex<0)
			return ;
		
		
		quickSort(a,start,pIndex-1);
		quickSort(a,pIndex+1,end);
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
    int numtimes=0;
	public void medianOfThree(int a[],int start,int end)
	{
		int first=a[start];
		System.out.println("End is "+end);
		int last=a[end];
		int middle=start+(end-start)/2;
		int middlelt=a[middle];
		
		int median=start;
		if(((first>middlelt)&&(first<last)) || ((first<middlelt)&&(first>last)))
		{
			median=start;
		}
		if(((middlelt>first)&&(middlelt<last))||((middlelt<first)&&(middlelt<last)))
		{
			median=middle;
		}
		if(((last>first)&& (last<middlelt))||((last<first)&&(last>middlelt)))
		{
			median=end;
		}
		//if(median!=start)
		//{
			numtimes++;
			int tmpValue = a[median];
			a[median] = a[start];
			a[start] = tmpValue;
		//}
			
		
		//countcomp=countcomp+3;
		/*int median;
	      int mid = start+(end-start)/2;
	      if (a[start] < a[mid])
	      {
	        if (a[mid] < a[end ]) 
	        {
	          median = mid;
	        }
	        else if (a[start] < a[end ])
	        {
	          median = end;
	        }
	        else
	        {
	          median = start;
	        }
	        //countcomp=countcomp+3;
	      }
	      else
	      {
	        if (a[end ] < a[mid]) 
	        {
	          median = mid;
	        } 
	        else if (a[end ] < a[start]) 
	        {
	          median = end;
	        }
	        else
	        {
	          median = start;
	        }
	        //countcomp=countcomp+3;
	      }
	         if(median!=start)
	        {
	         int temp = a[start];
	        a[start] = a[median];
	        a[median] = temp;
	        }
	      */   
	         System.out.println("After median finding the array is ");
	         for(int i=0;i<a.length;i++)
	         {
	        	 System.out.println(a[i]);
	         }
	}
}
