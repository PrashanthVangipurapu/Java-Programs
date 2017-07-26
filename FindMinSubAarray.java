import java.util.Scanner;
public class FindMinSubAarray {
	int nums[];
	public static void main(String[] args)
	{
		FindMinSubAarray f=new FindMinSubAarray();
		Scanner s=new Scanner(System.in);
		int len=s.nextInt();
		f.nums=new int[len];
		for (int i=0;i<len;i++)
		{
			f.nums[i]=s.nextInt();
		}
		int l=f.findUnsortedSubarray(f.nums);
		System.out.println(l);
	}
    public int findUnsortedSubarray(int[] nums) {
        
    	int len1=nums.length;
        System.out.println("Length is "+len1);
    	int ptr1=0,ptr2=len1-1;
        //int index1,index2,flag;
        
        while(ptr1<len1)
        {    if (ptr1==len1-1)
        	  return 0;
             if(nums[ptr1]<nums[ptr1+1])
            	 ptr1=ptr1+1;
        	//System.out.println("nums[ptr1] "+nums[ptr1]);
        	//System.out.println("nums[rtr1"+nums[ptr1-1]);
        	
        }
        	
        System.out.println("ptr1 is "+ptr1);    
        while(ptr2>-1)
        {
        	if(ptr2==0)
        		break;
        	if(nums[ptr2]>nums[ptr2-1])
        		ptr2=ptr2-1;
        	//System.out.println("nums[ptr2] "+nums[ptr2]);
        	//System.out.println("nums[rtr2 "+nums[ptr2-1]);
               
        }
               System.out.println("Ptr2 is "+ptr2);
        int diff = (ptr2-ptr1)+1;
        return diff;
        
    }
}
