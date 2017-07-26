//This program is used to add linked list elements at random positions.

class NodeRandom
{
	int data;
	NodeRandom next;
    
	public NodeRandom()
	{		
	}
	public NodeRandom(int data)
	{
		this.data=data;
		next =null;		
	}
	
}
public class LinkedListRandomInsert {
 
	NodeRandom start=null;
	public static void main(String[] args)
	{
		LinkedListRandomInsert l =new LinkedListRandomInsert();
		l.add(1,1);
		l.add(2,2);
		l.add(3,3);
		l.add(4,4);
		    //l.add(2,20);
		l.add(5, 5);
		l.add(6, 6);
		l.add(7, 7);
		l.add(8,8);
		int count=0;
	    NodeRandom curr12=l.start;
	    while(curr12!=null)
	    {
	    	count=count+1;
	    	curr12=curr12.next;
	    }
	    System.out.println("length is "+count);
	    
		System.out.println("Before reordering");
		l.display(l.start);
	    NodeRandom curr=l.oddEvenList(l.start);
	    System.out.println("\nAfter reordering");
	    l.display(curr);
	    
	}
	
	
	public NodeRandom oddEvenList(NodeRandom head) {
        //System.out.println(head.val);
        NodeRandom temp=null;
		if (head==null)
           {
               //System.out.println("came inside");
           return head;
               
           }
        else{
        int count =0;
        NodeRandom curr=head;
        NodeRandom prev=head;
        NodeRandom endcurr=head;
        while(endcurr.next!=null)
        {
            count= count+1;           //make a pointer endcurr point to the end of the list.            
            endcurr=endcurr.next;
        }
        //System.out.println("Count is "+count);
        if (count == 1)
        	return head;  //If there are only 2 nodes then there is no need to process.
        int i=0;
        while(i<=count)
        {
            if (i%2 !=0)
            {
                //Even node
            	temp=curr;   //store curr in temp and make endcurr point to temp
                prev.next=curr.next;
                curr=curr.next;  //make our curr point to next node.
                endcurr.next=temp;
                endcurr=temp;
                temp.next=null;
               
            }
            else
            {
                prev=curr;
                curr=curr.next;
            }
            i=i+1;
        }
        
        return head;
        }
    }
	
	
	
	public boolean isEmpty()
	{
		if (start == null)
		{
			return true;
			
		}
		else
		{
			return false;
		}
	}
	
	public void add(int pos,int data)
	{
		NodeRandom n =new NodeRandom(data);		
		
		if (pos==1)
		{
		//	System.out.println("We need to insert at starting position");
		    if (isEmpty())
		    {
		  //  	System.out.println("The list is empty ");
		        start=n;		        
		    }
		    else
		    {
		    //	System.out.println("There is a node already in forst psoition");
		    	NodeRandom curr =start;
		    	start=n;
		    	n.next=curr;
		    	
		    }
		}
		else
		{
			
//			System.out.println("Not in first position");
	//		System.out.println("The first psotion value is "+start.data);
			NodeRandom curr=start;
	//		System.out.println("The first psotion curr value is "+curr.data);
			for (int i=0;i<pos-2;i++)
			{
				curr=curr.next;
			}
			n.next=curr.next;
			curr.next=n;
					}
	}

  public void display(NodeRandom start)
  {
	
	  NodeRandom curr=start;
	  while (curr.next!=null)
	  {
		  //System.out.println("In display");
		  System.out.print(curr.data);
		  System.out.print("-->");
		  curr=curr.next;
	  }
	  System.out.print(curr.data);
  }
}



































//Definition for singly-linked list.
/*class ListNode {
  int val;
  ListNode next;
  ListNode(int x) 
  { 
      val = x; 
      
      
  }
}

public class Solution {
public ListNode oddEvenList(ListNode head) {
    //System.out.println(head.val);
    if (head==null)
       {
           //System.out.println("came inside");
       return head;
           
       }
    else{
    int count =0;
    ListNode curr=head;
    ListNode prev=head;
    ListNode endcurr=head;
    while(endcurr.next!=null)
    {
        count= count+1;
        endcurr=endcurr.next;
    }
    int i=0;
    while(i<=count)
    {
        if (i%2 !=0)
        {
            //Even node
            prev.next=curr.next;
            endcurr.next=curr;
            endcurr=curr;
        }
        else
        {
            prev=curr;
            curr=curr.next;
        }
        i=i+1;
    }
    
    return head;
    }
}
}*/