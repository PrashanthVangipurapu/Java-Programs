public class MinEditDistanceDp {
    public static void main(String [] args)
    {
    	MinEditDistanceDp m=new MinEditDistanceDp();
    	String str1="a";
    	String str2="b";
    	int d=m.minDistance(str1,str2);
    	System.out.println("The value is "+d);
    	
    }
	public int minDistance(String word1, String word2) {
        
        int len1= word1.length();
        int len2=word2.length();
        int opt[][]=new int[len1+1][len2+1];
        int val;
        
        
        for (int i=0;i<=len1;i++)
        {
            for (int j=0;j<=len2;j++)
            {
                if (i==0)
                  opt[0][j]=j;
                else if (j==0)
                    opt[i][0]=i;
                else
                {
                	//System.out.println("charat i is "+word1.charAt(i-1));
                	//System.out.println("char at j is "+word2.charAt(j-1));
                    if (word1.charAt(i-1) == word2.charAt(j-1))
                       opt[i][j]=opt[i-1][j-1];
                    else
                    {
                       val = 1+ min(opt[i-1][j],opt[i-1][j-1],opt[i][j-1]);
                       opt[i][j]=val;
                    }   
                }
                val=0;
                
            }
        }
        
        return opt[len1][len2];
    }
    
    public int min(int a, int b,int c)
    {
        if (a<b && a<c)
           return a;
        else
          { 
               if(b<a && b<c)
                 return b;
               else
                 
                  return c;
          }      
   }
   
}   
