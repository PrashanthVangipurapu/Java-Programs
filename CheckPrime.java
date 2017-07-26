import java.util.Scanner;

public class CheckPrime {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        System.out.println("Enter the number to which you want to check whetehr it is prime or not ? ");
        int a=s.nextInt();
        //int count=0;
        for(int i=2;i<Math.sqrt(a);i++)
        {
        	System.out.println("Value of a is "+a);
        	if(a%i==0)
        	{
        		System.out.println("This is not a prime number ");
        	    break;
        	}
        	else
        	{
        		System.out.println("Yes it is a prime number");
        	}
        }
	}

}
