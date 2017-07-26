//This program is used for basic linkedlist insertion at end everytime.
class Nodelink
{
	int data;
	Nodelink next;
	static Nodelink curr=null,start=null;
	public Nodelink(int d)
	{
		data=d;
		next=null;
	}
	public boolean isEmpty()
	{
		if (start==null)
			return true;
		else
			return false;
	}
}
public class Linkedlst {

	
	public static void main(String [] args)
	{
		Linkedlst l =new Linkedlst();
		l.add(10);
		l.add(20);
		l.add(30);
		l.display();
		
	}
	public void add(int data)
	{
		System.out.println("The data to be displayed is "+data);
		Nodelink n;
		n= new Nodelink(data);
		if (n.isEmpty())
		{
			System.out.println("The list is empty");
			//n.next=null;
		    Nodelink.start= n;
		    Nodelink.curr=n;
		}
		else
		{
			System.out.println("The list is not empty");
			System.out.println("nodelink.curr value is "+Nodelink.curr.data);
			Nodelink.curr.next= n;
			Nodelink.curr=Nodelink.curr.next;
			n.next=null;
			
		}
	}
	public void display()
	{
		System.out.println("Displaing the nodes");
		 Nodelink curr1= Nodelink.start;
		 
		 while(curr1.next!=null)
		 {
			 System.out.print(curr1.data);
			 System.out.print("-->");
			 //System.out.println("the next field data is "+curr1.next.data);
			 curr1=curr1.next;
		 }
		 System.out.println(curr1.data);
	}
}
