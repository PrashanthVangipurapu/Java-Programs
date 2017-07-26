import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class QuickTesting{

	private static long numberOfComparisons;
	
	public static void main(String[] args){
		 Integer[] input = new Integer[9];

	    input = new Integer[9];
	    readInputIntoArray(input);
	    numberOfComparisons = 0; //reset comparison count
		partitionizeUsingMediumOfThreeAndSort(input, 0, input.length-1);
	    System.out.println("Number of comparisons => "+ numberOfComparisons);
	   System.out.println("numtimes is "+numtimes);
	}

	static void readInputIntoArray(Integer[] input) {
		BufferedReader br = null;
		 int i = 0;
		  try {
		  	  String sCurrentLine = null;
		  	  br = new BufferedReader(new FileReader("F:/books_and_programs/Java_programs/CourseraAlgorithms/CourseraAlgorithms/src/file3.txt"));
		  	  while ((sCurrentLine = br.readLine()) != null) {
		  	  	  input[i++] = Integer.parseInt(sCurrentLine);
			  }
		  } catch (IOException e) {
		  	  System.out.println("exception => " + e);
		  }
	}


	


	/**
	 * quick sort algorithm implemented using medium of three as pivot
	 */
	private static Integer[] partitionizeUsingMediumOfThreeAndSort(Integer[] inputArray, int startIndex, int endIndex)
	{
		
		if(startIndex >= endIndex)
		{
			return inputArray;
		}
		else
		{
			System.out.println("The actual array is ");
		    for(int i=0;i<=inputArray.length-1;i++)
		    {
		    	System.out.println(inputArray[i]);
		    }
		    System.out.println();
			int newPivot = partitionizePivotAsMediumOfThree(inputArray, startIndex, endIndex);
			numberOfComparisons += endIndex - startIndex;
		
		
			partitionizeUsingMediumOfThreeAndSort(inputArray, startIndex, newPivot-1);
			
			partitionizeUsingMediumOfThreeAndSort(inputArray, newPivot+1, endIndex);
		}
		return inputArray;
	}
  static int numtimes=0;
	/**
	 * Partitioning method that uses the median of three pivot rule
	 */
	private static int partitionizePivotAsMediumOfThree(Integer[] inputArray, int start, int end){
		int firstElement = inputArray[start];
		System.out.println("End is "+end);
		int finalElement = inputArray[end];

		int medianIndex =  start + (end - start)/2;	
		int middleElement = inputArray[(medianIndex)];
		int median = start;
		if((firstElement > middleElement && firstElement < finalElement) || (firstElement < middleElement && firstElement > finalElement)){
			median = start;
		}

		if((middleElement > firstElement && middleElement < finalElement) || (middleElement < firstElement && middleElement > finalElement)){
			median = medianIndex;
		}

		if((finalElement > firstElement && finalElement<middleElement) || (finalElement < firstElement && finalElement > middleElement)){
			median = end;
		}

		//if(median != start){
			numtimes++;
			int tmpValue = inputArray[median];
			inputArray[median] = inputArray[start];
			inputArray[start] = tmpValue;
		//}
		
		
		/*System.out.println("after median finding the array is ");
		for(int i=0;i<=inputArray.length-1;i++)
		{
			System.out.println(inputArray[i]);
		}
		System.out.println("median is "+median+" inside fn. the median value is "+inputArray[start]);		
		//Putting the last element as the first*/
		
		
		int pivot = inputArray[start];	
		
		//Boundary of the latest element <p
		int innerCounter = start + 1;
		for (int i = start + 1; i <= end; i++) {
			// If the current input is lower that the pivot then swap pivots.
				if (inputArray[i] < pivot) {
					int tmp = inputArray[i];
					inputArray[i] = inputArray[innerCounter];
					inputArray[innerCounter] = tmp;
					innerCounter++;
				}			
		}
		swap(inputArray, start, innerCounter);		
		return innerCounter-1;	
	}

	private static void swap(Integer[] inputArray, int start, int innerCounter){
		int temp = inputArray[start];
		inputArray[start] = inputArray[innerCounter-1];
		inputArray[innerCounter-1] = temp;
	}
}

