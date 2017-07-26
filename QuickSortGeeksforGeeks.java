import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

// Java program for implementation of QuickSort
public class QuickSortGeeksforGeeks
{
	int comp=0;
    /* This function takes last element as pivot,
       places the pivot element at its correct
       position in sorted array, and places all
       smaller (smaller than pivot) to left of
       pivot and all greater elements to right
       of pivot */
    int partition(int arr[], int low, int high)
    {
    	comp=comp+(high-low);
        int pivot = arr[high];
        int i = (low-1); // index of smaller element
        for (int j=low; j<=high-1; j++)
        {
            // If current element is smaller than or
            // equal to pivot
            if (arr[j] <= pivot)
            {
                i++;
 
                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
 
        // swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
 
        return i+1;
    }
 
    /* The main function that implements QuickSort()
      arr[] --> Array to be sorted,
      low  --> Starting index,
      high  --> Ending index */
    public static void main(String[] args)throws Exception
    {
    	System.out.println("Entered");
    	Scanner s=new Scanner(System.in);
    	QuickSortGeeksforGeeks q= new QuickSortGeeksforGeeks();
    	int count=0;
    	File f=new File("F:/books_and_programs/Java_programs/CourseraAlgorithms/CourseraAlgorithms/src/file1.txt");
    	FileReader fr=new FileReader(f);
    	BufferedReader br=new BufferedReader(fr);
    	String line=br.readLine();
    	while(line!=null)
    	{
    		count++;
    		line=br.readLine();
    	}
    	int a[]=new int[count];
    	br=new BufferedReader(new FileReader(f));
    	line=br.readLine();
    	int i=0;
    	while(line!=null)
    	{
    		int p=Integer.parseInt(line);
    		a[i++]=p;
    		line=br.readLine();
    	}
    	
    	int low=0;
    	int high=count-1;
    	q.qSort(a, low, high);
    	
    	/*System.out.println("Length of array is ");
    	int len=s.nextInt();
    	int a[]=new int[len];
    	for(int i=0;i<len;i++)
    	{
    		a[i]=s.nextInt();
    	}
    	int low=0;
    	int high=len-1;
    	
    	q.qSort(a, low, high);
    	
    	System.out.println("Final sorted array is ");
    	for(int i=0;i<len;i++)
    		System.out.println(a[i]);*/
    	
    	System.out.println("total comparisons are "+q.comp);
    }
    void qSort(int arr[], int low, int high)
    {
        if (low < high)
        {
            /* pi is partitioning index, arr[pi] is
              now at right place */
            int pi = partition(arr, low, high);
 
            // Recursively sort elements before
            // partition and after partition
            qSort(arr, low, pi-1);
            qSort(arr, pi+1, high);
        }
    }
}
