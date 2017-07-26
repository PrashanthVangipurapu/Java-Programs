import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class TextRead {
 
	public static void main(String[] args) throws Exception
    {
    	File f=new File("F:/books_and_programs/Java_programs/CourseraAlgorithms/CourseraAlgorithms/src/file1.txt");
    	System.out.println(f.exists());
    	FileReader fr=new FileReader(f);
    	BufferedReader br=new BufferedReader(fr);
        String line=br.readLine();
        int count=0;
    	while(line!=null)
        {
    		
        	int a=Integer.parseInt(line);
        	System.out.println(a);
        	count++;
        	line=br.readLine();
        }
    	System.out.println("count is "+count);
    }
	
}	