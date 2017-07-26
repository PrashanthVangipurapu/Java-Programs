/*This program is for quicksort whose pivot is at first element in the array */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class QuickSortCoursera {

	int a[];
	int len;
	int start,end,pIndex;
	int comparecount=0;
	public static void main(String[] args) throws Exception
	{
		new QuickSortCoursera().solve();
	}
	public void solve() throws Exception
	{
		int count=0;
		File f=new File("F:/books_and_programs/Java_programs/CourseraAlgorithms/CourseraAlgorithms/src/file1.txt");
		FileReader fr= new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		
		while(br.readLine()!=null)
		{
			count++;
		}
		System.out.println("count is "+count);
		 br=new BufferedReader(new FileReader(f));
		a=new int[count];
		int cou=0;
		String line=br.readLine();
		System.out.println("line at br2 is "+line );
		int p;
		while(line!=null)
		{
			p=Integer.parseInt(line);
			//System.out.println("p is "+p);
			a[cou]=p;
		    cou++;
		    line=br.readLine();
		}
			
		System.out.println("Initial array is ");
		for(int i=0;i<count;i++)
		{
			System.out.println(a[i]);
		}
		start=0;
		end=count-1;
		//int pindex=partition(a,start,end);
		quickSort(a,start,end);
		
		
		System.out.println("\nfinal array is ");
		for(int i=0;i<=end;i++)
			System.out.println(a[i]);
		
		System.out.println("comparecount is "+comparecount);
	}
	public void quickSort(int a[],int start,int end)
	{
		
		if(start<end)
		{
			comparecount=comparecount+(end-start);
		  //System.out.println("Start value is "+start+" and end value is "+end );
		  int pIndex=partition(a,start,end);
          //System.out.println("end element is "+a[end]);
		  //System.out.println("for the first time the array is ");
		  //for(int i=0;i<len;i++)
			 //System.out.println(a[i]);
		
		  //System.out.println(" ");
		  //System.out.println("partition index is "+pIndex); 
		  if(pIndex<0)
		    return ;
		
		  quickSort(a,start,pIndex-1);
		  //System.out.println("**first part over**");
		  //System.out.println("pIndex is "+pIndex+" End is "+end );
		  quickSort(a,pIndex+1,end);
		 
		
		
		}
	}
	public int partition(int a[],int s,int e)
	{
	 //System.out.println("I am called for sorting these elements ");
	 /*for(int i=s;i<=e;i++)
	 {
		 System.out.println(a[i]);
	 }*/
	// System.out.println();
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
	   // System.out.println("the value of pivot returning is "+(i-1));
         return i-1;	
	
	}
}
	



