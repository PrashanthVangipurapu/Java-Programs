
public class BuildLinkList {
	NodeRandom start=null,curr=null;
	public static void main(String[] args)
	{
		BuildLinkList b =new BuildLinkList();
		b.add(1);
		b.add(2);
		b.add(3);
		b.add(4);
		b.add(5);
		b.add(6);
		b.add(4);
		b.add(3);
		b.add(2);
		b.add(1);		
		b.display(b.start);
		b.length();
		//b.deleteNode(3);
        boolean val=b.isPalindrome(b.start);
        if (val==true)
        	System.out.println("yes");
        else
        	System.out.println("no");
	}
	public void length()
	{
		int count=0;
		NodeRandom curr= start;
		while(curr!=null)
		{
			count=count+1;
			System.out.println("count is "+count+" and data is "+curr.data);
			curr=curr.next;
			
		}
		System.out.println("count is "+count);
	}
	public void add(int data)
	{
		//System.out.println("The data to be displayed is "+data);
		NodeRandom n;
		n= new NodeRandom(data);
		if (start==null)
		{
			System.out.println("The list is empty");
			//n.next=null;
		    start= n;
		    curr=n;
		}
		else
		{
			//System.out.println("The list is not empty");
			//System.out.println("nodelink.curr value is "+Nodelink.curr.data);
		    curr.next= n;
			curr=curr.next;
			n.next=null;
			
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
public void deleteNode(int d) {
			NodeRandom node=start;
			while(node.data!=d)
			{
				node=node.next;
				
			}
	        System.out.println("node.data is "+node.data);
			while(node.next!=null)
	        {
	            node.data=node.next.data;
	            
	            if (node.next.next ==null)
	            {
	            	node.next=null;
	            	break;
	            }
	            else
	            {
	            	node=node.next;
	            }
	        }
	        
	        System.out.println();
	        display(start);
		}
		/**
		 * Definition for singly-linked list.
		 * public class NodeRandom {
		 *     int val;
		 *     NodeRandom next;
		 *     NodeRandom(int x) { val = x; }
		 * }
		 */
		
public boolean isPalindrome(NodeRandom head) {
		       if (head==null)
		          return true;
		       boolean val;
		       NodeRandom curr=head;
		       NodeRandom ptr1=head;
		       NodeRandom prev=head;
		       int length = 0;
		       while(curr!=null)
		       {
		           curr=curr.next;
		           length=length+1;
		           
		       }
		       curr=head;
		       prev=head;
		       if (length==1)
		       {
		           return false;
		       }
		       if (length==2)
		       
		       {
		           //NodeRandom curr12=head;
		           if(curr.data==curr.next.data)
		           {
		               return true;
		           }
		           else
		           return false;
		       }

		       if (length % 2==0)
		       {
		           System.out.println("Even number of nodes in the list.");
		           
		            int i=0;
		           while(i<length/2)
		           {
		               prev=curr;
		               curr=curr.next;
		               //System.out.println("prev is "+prev.data);
		               //System.out.println("curr is "+curr.data);
		               i++;
		           }
		           //System.out.println("at division curr is "+curr.data);
		           //System.out.println("prev is "+prev.data);
		           //NodeRandom temp=curr.next;
		           //prev=temp;
		           //curr.next=null;
		           NodeRandom start1=reverse(curr,prev);
		           System.out.println("The 2 lists are ");
                   System.out.println("first list ");
                   display(ptr1);
                   System.out.println("second list is");
                   display(start1);
                   System.out.println("Now compare ");
		           val=compare(ptr1,start1);
		       }
		       else
		       {
		           //odd number of nodes in the list
		           int i=0;
		           while(i<=length/2)
		           {
		               prev=curr;
		               curr=curr.next;
		               i++;
		           }
		           //NodeRandom temp=curr.next;
		           //prev=temp;
		           //curr.next=null;
		           NodeRandom start=reverse(curr,prev);
		           val=compare(ptr1,start);
		       }
		       if (val==true)
		         return true;
		       else
		        return false;
		       
		    }
		    
		    public NodeRandom reverse(NodeRandom curr, NodeRandom prev1)
		    {
		      //curr=curr.next;
		      prev1.next=null;
		      NodeRandom temp;
		      NodeRandom prev2=null;
		      while(curr!=null)
		      {
		        temp=curr.next;
		        curr.next=prev2;
		        prev2=curr;
		        curr=temp;
		      }
		      
		      NodeRandom newstart=prev2;
		      System.out.println("after reverse display is ");
		      display(newstart);
		      System.out.println("done with reverse function");
		      return newstart;
		           
		    }
		    
		    public boolean compare(NodeRandom curr1,NodeRandom curr2)
		    {
		        int i=0;
		        int flag=0;
		        while(curr1!=null && curr2!=null)
		        {
		            if (curr1.data !=curr2.data)
		                return false;
		            else
		            {
		                flag=1;
		                curr1=curr1.next;
		                curr2=curr2.next;
		            }
		            
		        }
		        if (flag==1)
		            return true;
		        else
		           return false;
		            
		        
		    }
		}
		
		
		
		
		
      
	


