import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ReadFile {

	public static void main(String [] args) throws Exception
	{
		File f=new File("F:/books_and_programs/Java_programs/CourseraAlgorithms/CourseraAlgorithms/src/Inversions.txt");
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		int a[]=new int[100000];
		String line=br.readLine();
		int p;
		int i=0;
		long  q=10;
		System.out.println("q is "+q);
		while(line!=null)
		{
			p=Integer.parseInt(line);
			a[i]=p;
			i++;
			line=br.readLine();
		}
		
		/*for(int z=0;z<100000;z++)
		{
			System.out.println(a[z]);
		}*/
	}
}

