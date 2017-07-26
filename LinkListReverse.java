
public class LinkListReverse  {
	NodeRandom start=null,curr=null;
	public static void main(String[] args)
	{
		LinkListReverse  b =new LinkListReverse ();
		b.add(1);
		b.add(2);
		b.add(2);
		b.add(4);
		b.add(4);
		b.add(6);
		System.out.println("In display");
		b.display(b.start);
		b.length();
		//b.deleteNode(3);
		b.traverse(2);
		//b.start=b.reverse(b.start);
		
		//System.out.println("After reverse");
		//b.display(b.start);
	}
	public void traverse(int a)
	{
		NodeRandom curr=start;
		for (int i=0;i<a-1;i++)
		{
			curr=curr.next;
			System.out.println("currs value is "+curr.data);
		}
		System.out.println("curr.data is "+curr.data);
		start=curr;
		display(start);
	}
	public void length()
	{
		int count=0;
		NodeRandom curr= start;
		while(curr!=null)
		{
			count=count+1;
			//System.out.println("count is "+count+" and data is "+curr.data);
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
	        //display();
 }
		
	public NodeRandom reverse(NodeRandom start)
	{
		//System.out.println("in reverse function");
		//display();
		NodeRandom curr=start;
		
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
		System.out.println("reverse a list");
		display(newstart);
		return newstart;
	}
}