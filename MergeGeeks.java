/* This is given an input file of 100000 integers.*/
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class MergeGeeks
{
	int arr[]=new int[100000];
	long count=0;
	//int total=0;
    // Merges two subarrays of arr[].
    // First subarray is arr[l..m]
    // Second subarray is arr[m+1..r]
    long  merge(int arr[], int l, int m, int r)
    {
        
    	//System.out.println("r is "+r+" m is "+m+" l is "+l);
    	// Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;   
 
        /* Create temp arrays */
        int L[] = new int [ n1];
        int R[] = new int [ n2];
        //System.out.println("length of left array is "+L.length);
        /*Copy data to temp arrays*/
        for (int i=0; i<n1; ++i)
            L[i] = arr[ (l + i)];
        for (int j=0; j<n2; ++j)
            R[j] = arr[ (m + 1+ j)];
 
 
        /* Merge the temp arrays */
 
        // Initial indexes of first and second subarrays
        int i = 0, j = 0;
 
        // Initial index of merged subarry array
        int k = l;
        while (i < n1 && j < n2)
        {
            if (L[i] <= R[j])
            {
          //      System.out.println("from left array ");
            	arr[k] = L[i];
                i++;
            }
            else
            {
            //	System.out.println("From right array ");
            	
                count+=n1-i;
            	//System.out.println("count added is "+count);
                arr[k] = R[j];
                j++;
            }
            k++;
        }
 
        /* Copy remaining elements of L[] if any */
        while (i < n1)
        {
        	//System.out.println("entering left array remaining elts ");
            arr[k] = L[i];
            i++;
            k++;
        }
 
        /* Copy remaining elements of L[] if any */
        while (j < n2)
        {
        	//System.out.println("entering right array remaining elts ");
        	arr[k] = R[j];
            j++;
            k++;
        }
        return count;
    }
 
    // Main function that sorts arr[l..r] using
    // merge()
    void sort(int arr[], int l, int r)
    {
        if (l < r)
        {
            // Find the middle point
            int m = (l+r)/2;
 
            // Sort first and second halves
            sort(arr, l, m);
            sort(arr , m+1, r);
 
            // Merge the sorted halves
            merge(arr, l, m, r);
            
        }
    }
 
    /* A utility function to print array of size n */
    public void printArray()
    {
    	System.out.println("Entered");
        int n = arr.length;
        System.out.println("n is "+n);
        for (int i=0; i<n; ++i)
            System.out.println(arr[i] + " ");
        //System.out.println();
        
        
        
    }
 
    // Driver method
    public static void main(String args[]) throws Exception
    {
        //int arr[] = {3,2,5,4,1,6};
    	MergeGeeks ob = new MergeGeeks();

    	File f=new File("F:/books_and_programs/Java_programs/CourseraAlgorithms/CourseraAlgorithms/src/Inversions.txt"); 
         System.out.println(f.exists());
         FileReader fr=new FileReader(f);
         BufferedReader br=new BufferedReader(fr);
         //int len=0;
         String line;
         line=br.readLine();
         
         int p;
         int z=0;
         while(line!=null)
         {
        	 p=Integer.parseInt(line);
        	 ob.arr[z]=p;
        	 //System.out.println("p is "+p);
        	 z++;
        	 line=br.readLine();
         }
        
        System.out.println("Given Array");
        //for(int i=0;i<100000;i++)
        	//System.out.println(ob.arr[i]);
       ob.printArray();
 
      
               ob.sort(ob.arr, 0, ob.arr.length-1);
 
        System.out.println("\nSorted array");
        ob.printArray();
        
        System.out.println("total is "+ob.count);
    }
}

