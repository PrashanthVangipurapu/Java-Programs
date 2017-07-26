import java.util.HashMap;

public class HashMapTest {

	public static void main(String[] args) {
		HashMap<Integer,String> m=new HashMap<Integer,String>();
		m.put(1, "xyz");
		m.put(2, "asas");
		m.put(1000, "abc");
		m.put(10,"cde");
		m.put(130,"efg");
		System.out.println(m);

	}

}
