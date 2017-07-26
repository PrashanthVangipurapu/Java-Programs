import java.util.Scanner;

public class StringPermutation {

	public static void main(String[] args) {
		String s;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter your string ");
        s=sc.next();
        StringPermutation sp=new StringPermutation();
        System.out.println("The enetered string is "+s);
        int r=s.length()-1;
        System.out.println("Length is "+r);
        int l=0;
        sp.permute(s,l,r);
	}
	public void permute(String a,int l,int r)
	{
		int i=0;
		if(l==r)
		{
			System.out.println("output "+a);
			return ;
		}
		for( i=l;i<r+1;i++)
		{
			//System.out.println("the value of i is "+i+" the value of l is "+l+" and the value of r is "+r);
			a=swap(a,l,i);
			//System.out.println("String is "+a);
			permute(a,l+1,r);
			//System.out.println("The value of i is "+i+" and l is "+l);
			a=swap(a,l,i);
		}
     }
	public String swap(String a,int p,int q)
	{
		char[] c=a.toCharArray();
		System.out.println("I am here to swap "+c[p]+" "+c[q]);
		char temp=c[p];
		c[p]=c[q];
		c[q]=temp;
		
		String swap=new String(c);
		return swap;
		
	}

}
