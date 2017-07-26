import java.util.Scanner;

public class IntegerPermuteSum {
   
	  int a;
	  int total;
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the numeber ");
		IntegerPermuteSum iP=new IntegerPermuteSum();
		iP.a=s.nextInt();
		int i;
		int count=0;
		for(i=iP.a;i>0;i=i/10)
		{
			count++;
		}
		System.out.println("Number of digits are "+count);
        int l=0,r=count-1;
		int res=+iP.permuteSum(iP.a,l,r);
		System.out.println("Result is "+res);
	}
	public int permuteSum(int a,int l,int r)
	{
		int i=0;
		
		if(l==r)
		{
			System.out.println("a is "+a);
			total=total+a;
		    
		}
		for(i=l;i<r+1;i++)
		{
			System.out.println("Entered with i as "+i+" L as "+l+" and r as "+r);
			a=swap(a,l,i);
			permuteSum(a,l+1,r);
			a=swap(a,l,i);
		}	
		System.out.0println("Entered here ");
		return total;
		//System.out.println("Entered ");
	}
	public int swap(int a,int l,int r)
	{
		char[] ch=(""+a).toCharArray();
		System.out.println("I am here to swap "+ch[l]+" "+ch[r]);
		char temp=ch[l];
		ch[l]=ch[r];
		ch[r]=temp;
		String s=new String(ch);
		int p=Integer.parseInt(s);
		return p;
		
	}
	

}
