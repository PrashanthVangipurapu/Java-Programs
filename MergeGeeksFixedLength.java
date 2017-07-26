/* This is given an input file of 100000 integers.*/
import java.util.Scanner;

public class MergeGeeksFixedLength
{
	int arr[];
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
            System.out.println("arr.length is "+arr.length);
            sort(arr , m+1, r);
            System.out.println("arr.length now is "+arr.length);
            // Merge the sorted halves
            merge(arr, l, m, r);
            System.out.println("The array till here is ");
            for(int i=0;i<arr.length;i++)
            {
            	System.out.print(arr[i]+" ");
            }
            System.out.println();
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
    	MergeGeeksFixedLength ob=new MergeGeeksFixedLength();
    	System.out.println("Enter length of input array ");
    	Scanner s=new Scanner(System.in);
    	int len=s.nextInt();
        ob.arr=new int[len];
    	System.out.println("Enter your elements ");
        for(int i=0;i<len;i++)
    	{
    		ob.arr[i]=s.nextInt();
    	}
    	
        System.out.println("Given Array is");
        
        ob.printArray();
        ob.sort(ob.arr, 0, ob.arr.length-1);
        System.out.println("\nSorted array");
        ob.printArray();
        
        System.out.println("total is "+ob.count);
    }
}


