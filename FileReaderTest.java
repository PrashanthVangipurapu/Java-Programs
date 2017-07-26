import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class FileReaderTest {

	public static void main(String[] args)throws Exception
	{
       
		FileReader fr=new FileReader("F:\\books_and_programs\\Java_programs\\CourseraAlgorithms\\CourseraAlgorithms\\src\\IntArray.txt");
		BufferedReader br=new BufferedReader(fr);
		String line=br.readLine();
		//ArrayList<Integer> al=new ArrayList<>();
		int a,count=0;
		int test[];
		while(line!=null)
		{
			System.out.println(line);
			a=Integer.parseInt(line);
			//al.add(a);
			System.out.println("Integer a is "+a);
			test=new int[line.length()];
			int rem,i=test.length-1;
			
		   while(a>0)
				{
					rem=a%10;
					a=a/10;
		            test[i]=rem;
			        i--;
				}
			
			
			for(int j=0;j<test.length;j++)
			{
				System.out.print(test[j]+"\t");
			}
			System.out.println();
			line=br.readLine();
		    //count++;
			
			
		}
		//System.out.println("count is "+count);
		//System.out.println(al.size());
	
	   
	}
}
