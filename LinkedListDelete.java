
public class LinkedListDelete {
	NodeRandom start=null;
	public static void main(String[] args)
	{
		LinkedListDelete ld = new LinkedListDelete();
		ld.add(1,10);
		ld.add(2,5);
		ld.add(3,30);
		ld.add(4,40);
		ld.add(2,20);
		ld.add(3, 35);
		ld.add(4, 56);
		ld.add(1, 23);
		ld.add(9,72);
	    ld.display();
	    ld.Delete(2);
	    System.out.println();
	    ld.display();
	    ld.Delete(1);
	    ld.Delete(5);
	    ld.Delete(4);
	    System.out.println();
	    ld.display();
	}
	public boolean isEmpty()
	{
		if (start==null)		
			return true;
		else
			return false;					
	}
	public void add(int pos,int data)
	{
		NodeRandom n =new NodeRandom(data);
		
		if (pos==1)
		{
			System.out.println("Adding at position 1");
			if (isEmpty())
			{
				System.out.println("The list is empty here");
		        start=n;						
			}
			else
			{
				System.out.println("Not empty");
				NodeRandom curr=start;
				start=n;
				n.next=curr;			
			}
		}
		else
		{
			System.out.println("The psoiton is not 1");
		    NodeRandom curr=start;
		    for (int i=0;i<pos-2;i++)
		    {
		    	curr=curr.next;
		    }
		    n.next=curr.next;
		    curr.next=n;
		}
	}
	
	public void display()
	  {
		  NodeRandom curr=start;
		  while (curr.next!=null)
		  {
			  System.out.print(curr.data);
			  System.out.print("-->");
			  curr=curr.next;
		  }
		  System.out.print(curr.data);
	  }
	public void Delete(int pos)
	{
		System.out.println("In delete node");
		if (pos==1)
		{
			NodeRandom curr=start;
			start=curr.next;
			curr=null;
		}
		else
		{
		 NodeRandom curr=start,prev=start;
		 for (int i=0;i<pos-1;i++)
		 {
			
			//curr=curr.next;
			//prev=prev.next;
			prev=curr;
			curr=curr.next;
			System.out.println("the value of curr is "+curr.data);
			System.out.println("the value of prev is "+prev.data);
		 }
		 //curr=curr.next;
		 prev.next=curr.next;
		 curr=null;
		}
	}

}
