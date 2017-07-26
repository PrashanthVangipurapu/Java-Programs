  class LinkNode {
      int val;
      LinkNode next;
     LinkNode(int x) 
     {
    	 val = x; 
    	 }
  }
 
public class SolutionTest {
    
    public static void main(String[] args)
    {
    	SolutionTest s=new SolutionTest();
        	
    }
    public LinkNode addTwoNumbers(LinkNode l1, LinkNode l2) {
        
        int size1 = getLength(l1);
        int size2 = getLength(l2);
        LinkNode head = new LinkNode(1);
        // Make sure l1.length >= l2.length
        head.next = size1 < size2 ? helper(l2, l1, size2 - size1) : helper(l1, l2, size1 - size2);
        // Handle the first digit
        if (head.next.val > 9) {
            head.next.val = head.next.val % 10;
            return head;
        }       
        return head.next;
    }
    // get length of the list
    public int getLength(LinkNode l) {
        int count = 0;
        while(l != null) {
            l = l.next;
            count++;
        }
        return count;
    }
    // offset is the difference of length between l1 and l2
    public LinkNode helper(LinkNode l1, LinkNode l2, int offset) {
        if (l1 == null) return null;
        // check whether l1 becomes the same length as l2
        LinkNode result = offset == 0 ? new LinkNode(l1.val + l2.val) : new LinkNode(l1.val);
        LinkNode post = offset == 0 ? helper(l1.next, l2.next, 0) : helper(l1.next, l2, offset - 1);
        // handle carry 
        if (post != null && post.val > 9) {
            result.val += 1;
            post.val = post.val % 10;
        }
        // combine nodes
        result.next = post;
        return result;
    }
} 