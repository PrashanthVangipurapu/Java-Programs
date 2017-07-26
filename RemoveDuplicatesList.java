// 1->2->3->3->3->4->4->5
//1->2->5
public class RemoveDuplicatesList {
    NodeRandom start=null;
    NodeRandom curr=start;
    public static void main(String[] args)
     {
    	 RemoveDuplicatesList b= new RemoveDuplicatesList();
    	 b.add(10);
    	 b.add(1);
 		 b.add(2);
 		 b.add(2);
 	     b.add(3);
 	     //b.add(2);
 	 	 b.add(4);
 		 //b.add(4);
 		 //b.add(6);
 		 //b.add(6);
 		 b.display(b.start);
 		 System.out.println("Removing duplicates");
 		 NodeRandom n=b.remdup(b.start);
 		 b.display(n);
     }
     
	public NodeRandom remdup(NodeRandom head)
	{
	 	
		/*int flag=0;		
	 	int  flag1=0;
	 	NodeRandom curr1=head,curr2=head,prev=head;
	    if (head == null)
	    {
	    	return head;
	    }
	    else
	    {
	    	  //prev=curr1;
	    	  //curr1=curr1.next;	    	
	    	  curr2=curr1.next;
	    	while(curr2!=null)
	    	{		    	
              //flag=0;
	    		System.out.println("curr1 values is "+curr1.data+" curr2 value is "+curr2.data);	    	  	    	
	    	  if(curr2.data == curr1.data)  //If both nodes have same values;
	    	   {
	    		  System.out.println("both the nodes have same values.");
	    		  flag=1;
	    		  if (curr1==head)
	    		  {
	    			  System.out.println("Prev is still pointing to the head");
	    			  //If prev points to head node.
	    			  head=curr2;
	    			  prev=head;
	    			  curr1=curr2;
	    			  curr2=curr2.next;
	    			  display(head);
	    			  if(curr2==null)
	    			  {
	    				  flag1=1;
	    			  }
	    		  }
	    		  
	    		  else
	    		  {
	    			  //If prev points to other than head node.
	    			  
	    		    prev.next=curr2;
	    		    curr1=curr2;
	    		    curr2=curr2.next;
	    		    display(head);
	    		    if(curr2==null)
	    			  {
	    				  flag1=1;
	    			  }	    		  
	    		  }	    		
	    	    }
	    	   else
	    	    {
	    		  //if both the data are not equal.
	    		     System.out.println("Both the data are not equal");
	    		      display(head);
	    		   if(flag==1)
	    		    {//flag==1 indicates that we have deleted one node. so remove the remaining node also.
	    			   System.out.println("Already one node is deleted");
	    			   if (curr1==head)
	    			   { //If it is the first node or head node.
	    		     	    head=curr2;
	   	        	 	    curr1=curr2;
	   	       		        curr2=curr2.next;
	   	    		        prev=head;
	   	    		        flag=0;
	    			   }
	    			   else
	    			   { //If it is not the head node.
	    				   System.out.println("This is not the first node to be deleted");
	    		    	   prev.next=curr2;	    			    			    		
	    		           curr1=curr2;
	    		           curr2=curr2.next;
	    		           flag=0;
	    			   }
	    	  		      display(head);
	    	     	}
	    		   else
	    		     {//No deletion are done here.
	    			   //No deleted are there.
	    			    System.out.println("No deletion is done here");   
	    			    prev=curr1;
	    			    curr1=curr2;
	    			    curr2=curr2.next;
	    		     }
	    		   System.out.println("At the end of loop");   
	    		   display(head);
	    	  }
	       }
	      if (flag1==1)
	      {
	    	  if(prev==head && curr1==head)
	    	  {
	    		  head=null;
	    	  }
	    	  else
	    	  {
	    		  prev.next=null;
	    	  }
	      }
	    	
	    } 	
	 	return head;*/
		
		
				
	 	NodeRandom curr1=head,prev=head;
	    if (head == null)
	    {
	    	return head;
	    }
	    else
	    {
	       while(curr1!=null)
	       {
	    	   //System.out.println("cur1 is "+curr1.data);
	    	   //System.out.println("curr1 next is "+curr1.next.data);	    	  
	           //curr1=curr1.next;
	    	   while(curr1.next!=null && curr1.data == curr1.next.data)
	    	   {
	    		   System.out.println("curr1 is "+curr1.data);
	    		   System.out.println("curr1 next is "+curr1.next.data);
	    		
	    		   curr1=curr1.next;
	    	   }
	    	   if(prev.next == curr1)
	    	   {
	    		   System.out.println("came inside");
	    		   prev=prev.next;
	    	   }
	    	   else
	    	   {
	    		   System.out.println("not in");
	    		   prev.next=curr1.next;
	    	   }
	    	   System.out.println("came out");
	    	   curr1=curr1.next;
	       }
	    	
	    } 	
	    	  
	    
	    return head;
	} 
	       
	/*if(head==null) return null;
	        NodeRandom FakeHead=new NodeRandom(0);
	        System.out.println("fake head is "+FakeHead.data);
	        FakeHead.next=head;
	        System.out.println("fake head next data  is "+FakeHead.next.data);
	        NodeRandom pre=FakeHead;
	        System.out.println("pre data  is "+pre.data);
	        NodeRandom cur=head;
	        System.out.println("cur data  is "+cur.data);
	        while(cur!=null){
	        	System.out.println("in first while cur value is "+cur.data);
	            while(cur.next!=null&&cur.data==cur.next.data){
	            	System.out.println("in second while cur value is "+cur.data+" and second cur value is "+cur.next.data);
	                cur=cur.next;
	            }
	            System.out.println("outside while pre value is "+pre.data);
	            System.out.println("cur value is "+cur.data);
	            if(pre.next==cur){
	            	
	                pre=pre.next;
	            }
	            else{
	                pre.next=cur.next;
	            }
	            cur=cur.next;
	            System.out.println("at the end display is ");
	            display(head);
	        }
	        return FakeHead.next;*/
	
	
	
     public void add(int data)
 	{
 		//System.out.println("The data to be displayed is "+data);
 		//
    	 NodeRandom n;
 		n= new NodeRandom(data);
 		if (start==null)
 		{
 			//System.out.println("The list is empty");
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
 			//curr.next=null;
 			
 		}
 		//System.out.println("display in add");
 		//display(start);
 	}
 		
     public void display(NodeRandom start)
 		  {
    	    if (start==null)
    	    	{
    	    	 System.out.println("empty");
    	    	 return ;
    	    	}
    	        
 			
 			  NodeRandom curr=start;
 			  while (curr.next!=null)
 			  {
 				  //System.out.println("In display");
 				  System.out.print(curr.data);
 				  System.out.print("-->");
 				  curr=curr.next;
 			  }
 			  System.out.print(curr.data);
 			  System.out.println();
 			  NodeRandom curr1=start;
 			  System.out.println("curr1 value is "+curr1.data);
 			  System.out.println("curr1 next is "+curr1.next.data);
 			  
 		  }

     
     
     
}
