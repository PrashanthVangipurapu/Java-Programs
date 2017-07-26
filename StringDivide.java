import java.util.*;
public class StringDivide {
    public static void main(String[] args)
    {
    	Scanner s =new Scanner(System.in);
    	System.out.println("Enter your string");
    	String s1 = s.nextLine();
    	StringTokenizer st =new StringTokenizer(s1,"+");
    	int len =st.countTokens();
    	String [] list= new String[len];
    	int i=0;
    	while (st.hasMoreTokens())
    	{
    	  	list[i]=st.nextToken();
    	  	list[i] =list[i].replaceAll("\\(","").replaceAll("\\)","").replaceAll(" ", "").replaceAll("->","");
    	  	list[i]=list[i];
    	  	i++;
    	}    	
    	NodeRandom[] a;
    	for (int j=0;j<len;j++)
    	{
     	  	for (int p =0;p<list[j].length();p++)
     	  			{
     	  		       
     	  			}
     	  	System.out.println();
    	}
    	
    }
}
