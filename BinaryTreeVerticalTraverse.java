class Node
{
	int data;
	Node left,right;
	public Node(int a)
	{
		data = a;
		left =null;
		right = null;
		
	}
	
	public String toString()
	{
      int a;
      a=this.data;
	  String str =Integer.toString(a);
    		  return str;
	}
}

public class BinaryTreeVerticalTraverse {
	Node root;
	static int min , max;
    
	public static void main(String[] args) {
		BinaryTreeVerticalTraverse b =new BinaryTreeVerticalTraverse();
		b.root = new Node(1);
		b.root.left= new Node(2);
		b.root.right =new Node(3);
		b.root.left.left = new Node(4);
		b.root.left.right = new Node(5);
		b.root.right.left = new Node(6);
		b.root.right.left.right = new Node(8);
		b.root.right.right= new Node(7);
		b.root.right.right.right =new Node(9);
		
		b.findminmax(b.root);
		b.printvalues();
	}
	public void findminmax(Node r)	
	{
		int middle=0;
		System.out.println("The value of current node is "+r);
		if (r == null)
		{
			return ;
		}
		if (r.left !=null)
		{
			System.out.println("In left subtree ");
			System.out.println("The value is "+r.left);
			BinaryTreeVerticalTraverse.min= min -1;
			System.out.println("static min value is "+BinaryTreeVerticalTraverse.min);
			findminmax(r.left);
		}
		if (r.right!=null)
		{
			System.out.println("In right subtree");
			System.out.println("The value is "+r.right);
			BinaryTreeVerticalTraverse.max = max+1;
			System.out.println("static max value is "+BinaryTreeVerticalTraverse.max);
			findminmax(r.right);
		}		 		
	}
	public void printvalues()
	{
		System.out.println("The value of min is "+BinaryTreeVerticalTraverse.min);
		System.out.println("The value of max is "+BinaryTreeVerticalTraverse.max);
	}

}
