import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class LinkedHashMap {

	HashMap<String,LinkedList<String>> h;
	String name;
	public LinkedHashMap(int a)
	{
		Scanner s=new Scanner(System.in);
		h=new HashMap<String,LinkedList<String>> ();
		for(int i=0;i<a;i++)
		{
			System.out.println("Enter name ");
			name=s.next();
			h.put(name,new LinkedList<String>());
		}
		
	}
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of men or women ");
        int count=s.nextInt();
        LinkedHashMap men=new LinkedHashMap(count);
        men.givePreferences(count);
        
	}
	
	public void givePreferences(int count)
	{
		String s;
		Scanner scan=new Scanner(System.in);
		/*for(String s:h.keySet())  This is written just to check whether y initial hashmap is working or not.
		{
			System.out.println(s+" "+h.get(s));
		}*/
		
		
		/*for(int i=0;i<count;i++) Initially I have written h.get(count) which is not correct
		{                          here the key value is a string not integer. So it gave null.
		    
			System.out.println(h.get("sai"));
		}*/
		System.out.println("Entered ");
		Set<Entry<String, LinkedList<String>>> set=h.entrySet();
		Iterator<Entry<String, LinkedList<String>>> itr=set.iterator();
		while(itr.hasNext())
		{
			System.out.println("In while loop ");
			Map.Entry me=(Map.Entry)itr.next();
			//System.out.println(me.getKey());
			// String s=me.getValue(); This is error. getValue() gives object but we are storing in string. This is not possible.
			
			//s=scan.next();
			//Object o= me.getKey();
			LinkedList<String> l=h.get(me.getKey());
			System.out.println("Enter preference list for "+me.getKey());
			for(int i=0;i<count;i++)
			{
				s=scan.next();
				l.add(s);
				
			}
			System.out.println("The key value pair is ");
			System.out.println(me.getKey());
			System.out.println(me.getValue());
			System.out.println();
			
		}
		
	}
}