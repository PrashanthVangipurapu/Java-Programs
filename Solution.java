import java.util.Scanner;
import java.util.StringTokenizer;

class ListNode
{
	int data;
	ListNode next;
    
	public ListNode()
	{
		
	}
	public ListNode(int data)
	{
		this.data=data;
		next =null;		
	}
	
}


public class Solution {
  ListNode[] start=null;
  
  ListNode start3=null;
  public static void main(String[] args)
   {
	  Solution al=new Solution();
	  al.start=new ListNode[2];
	  for (int i=0;i<2;i++)
	  {
		  al.start[i]=new ListNode();
	  }
	    
	Scanner s =new Scanner(System.in);
  	//System.out.println("Enter your string");
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
  	//System.out.println("The lists are");
  	/*for (int j=0;j<len;j++)
  	{
  		System.out.println(list[j]);
  	}*/
  	for (int j=0;j<len;j++)
  	{
  	int pass=Integer.parseInt(list[j]);	
  	 al.start[j]=al.makeList(pass, al.start[j]);  	  
  	 //System.out.println("The linked list after passing the string is");
  	 //al.display(al.start[j]);  	  
  	}
  	ListNode start3=al.addTwoNumbers(al.start[0], al.start[1]);
    al.display(start3);
	  
	  
	  /*Scanner s =new Scanner(System.in);
	   System.out.println("Enter the first number");
	   int a=s.nextInt();
	   System.out.println("Enter the second number");
	   int b =s.nextInt();
	   Add2Lists al=new Add2Lists();
	   al.start1=al.makeList(a,al.start1);
	   al.start2=al.makeList(b,al.start2);
	   al.display(al.start1);
	   al.display(al.start2);
	   al.addlists(al.start1,al.start2,al.start3);*/
   }
  
  public ListNode makeList(int a,ListNode node)
  {
	  //System.out.println("In makelist function");
	  node=null;
	  //System.out.println("Value of a is "+a);
	  int b=a;
	  int rem=0;
	  while(b>0)
	  {
		  rem = b%10;
		  b=b/10;
		  //System.out.println("value of rem is"+rem);
		  ListNode n =new ListNode(rem);
		  if (isEmpty(node))
		  {
			  node=n;
		  }
		  else
		  {
			 ListNode curr=node;
			 n.next=curr;
			 node=n;
		  }
		  
	  }
	  //System.out.println("at the end before passing In makelist function");
	  //display(node);
	  return node;
  }
  
  public boolean isEmpty(ListNode node)
  {
	  if (node== null)
	    return true;
	  else
		  return false;  
  }
  public void display(ListNode n)
  {
	  ListNode curr=n;
	  while (curr.next!=null)
	  {
		  System.out.print(curr.data);
		  System.out.print("-->");
		  curr=curr.next;
	  }
	  System.out.print(curr.data);
	  System.out.println();
  }
  
  public ListNode addTwoNumbers(ListNode l1,ListNode l2)
  {
	ListNode start3=null;
	ListNode finallist;
	int len1 = len(l1);
	int len2= len(l2);
	//System.out.println("length of first list is "+len1);
	//System.out.println("length of secodn list is "+len2);
	if (len1==len2)
	{
		//System.out.println("both the length are equal");
		ListNode n11=reverse(l1);
		//display(n11);
		ListNode n22 =reverse(l2);
		//display(n22);
		start3= process(n11,n22,start3);
		//display(start3);
		finallist=reverse(start3);
		//display(finallist);
	}
	else
	{
		//System.out.println("lengths not equal");
		if (len1 <len2)		
			{
	      		//System.out.println("The first list is smaller");
			    //int count =1;
			    int diff = len2-len1;
			    for (int count =1;count<=diff;count++)
		     	{
			    	ListNode n = new ListNode(0);
				    if (l1==null)
			     	{
				    	l1=n;					
				    }
				    else
				    {
					  ListNode curr= l1;
				      l1=n;
					  n.next=curr;					
				     }
						
	             }
			    ListNode n11=reverse(l1);
			    ListNode n22=reverse(l2);
			    start3= process(n11,n22,start3);
				//display(start3);
				finallist=reverse(start3);
				//display(finallist);
			  }
		  else
		   {
             //System.out.println("The second list is smaller");
             int minus=len1-len2;
             for (int i=1;i<=minus;i++)
              {
        	     ListNode n = new ListNode(0);
				  if (l2==null)				  
					 l2=n;									   
				  else
				   {
				  	 ListNode curr= l2;
					 l2=n;
					 n.next=curr;					
				    }			  
              }			
                ListNode n11=reverse(l1);
			    ListNode n22=reverse(l2);
			    start3= process(n11,n22,start3);
				//display(start3);
				finallist=reverse(start3);
				//display(finallist);

		   }
     }
	return finallist;
  }	
  public ListNode reverse(ListNode n1)
  {
	  //System.out.println("In reversing a list");
	  //System.out.println("start data is "+n1.data);
	  ListNode curr=n1.next,prev1=n1,prev2=null;
	  while(curr!=null)
	  {
		  ListNode tempcurr=curr.next;
		  //ListNode tempprev=prev1.next;
		  curr.next = prev1;
		  prev1.next=prev2;
		  prev2=prev1;
		  prev1=curr;
		  //if (tempcurr!=null)
		   curr=tempcurr;
	  }
	  //System.out.println("curr data is "+curr.data);
	  //System.out.println("prev1 data is "+prev1.data);
	  //System.out.println("prev2 data is "+prev2.data);
	  n1=prev1;
	  return n1;
  }
  public int len(ListNode curr)
  {
	  int count =0;
	  while (curr!=null)
	  {
		  count = count+1;
		  curr=curr.next;
	  }
	  return count;
  }
  public ListNode process(ListNode list1,ListNode list2, ListNode start3)
  {
	//System.out.println("came for adding two lists");
	int sum =0,carry=0,rem=0,div=0;
	ListNode curr1=list1;
	ListNode curr2=list2;
	while (curr1!=null && curr2!=null)
	{
		//System.out.println("curr1.data is "+curr1.data);
		//System.out.println("curr2.data is "+curr2.data);
		sum = curr1.data+curr2.data+carry;
		div = sum/10;
		
			//System.out.println("There exists a carry");
		    carry = div;
		    rem = sum %10;
		    ListNode n =new ListNode(rem);
		    if (start3==null)
		    {
		    	start3=n;
		    }
		    else
		    {
		    	//System.out.println("done with first insertions. Now in second one");
		    	ListNode curr=start3;
		    	while (curr.next!=null)
		    			curr=curr.next;
		    	curr.next=n;
		    	
		    }
		    curr1=curr1.next;
		    curr2=curr2.next;
		
	}
	if (curr1 ==null && curr2==null)
	{
		if (carry ==1)
		{
			ListNode n =new ListNode(1);
			ListNode curr=start3;
	    	while (curr.next!=null)
	    			curr=curr.next;
	    	curr.next=n;
		}
	}
	
	return start3;  
  }
}



