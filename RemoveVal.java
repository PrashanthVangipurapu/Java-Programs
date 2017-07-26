//Remove all elements from a linked list with value val.
public class RemoveVal {
	
	NodeRandom start=null,curr=null;
	public static void main(String[] args)
	{
		RemoveVal  b =new RemoveVal ();
		b.add(1);
		b.add(1);
		//b.add(3);
		//b.add(4);
		//b.add(1);
		//b.add(6);
		//b.add(1);
		b.display(b.start);
		//b.length();
		//b.deleteNode(3);
		//b.start=b.reverse(b.start);
		//System.out.println("After reverse");
		//b.display(b.start);
		b.remove(1);
		System.out.println();
		b.display(b.start);
	}
	
	public void remove(int val)
	{
		NodeRandom temp=null,curr=start,prev=null;
		System.out.println("start data is "+start.data);
		
		while(curr!=null)
		{
			if(curr.data==val)
			{
				
				if (start.data==val)
				{
					System.out.println("\nfurst node");
					start=curr.next;
					prev=curr.next;
					curr=prev;
				}
				else
				{
					
				System.out.println("Not first node");
				System.out.println("found data is "+curr.data);
				prev.next=curr.next;
				curr=curr.next;
				
				}
			}
			else
			{
				prev=curr;
				curr=curr.next;
			}
		}	
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
			  if (curr==null)
				  
			  {
				  
			  }
			  else
			  {
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
		}
		