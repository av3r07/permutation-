import java.io.BufferedReader;  
import java.io.FileReader;  
import java.io.IOException;  
public class permutation  
{  
    public static void main(String[] args)   
    {  
        String[][] s=new String[3][3];
        String line = "";  
        int i=0,j=0;
        try   
        {  
            //parsing a CSV file into BufferedReader class constructor  
            BufferedReader br = new BufferedReader(new FileReader("input.csv"));  
            while ((line = br.readLine()) != null)   //returns a Boolean value  
            { 
                String str="";
                for(int k=0;k<line.length();k++)//to split each word comparing ',' as seperator and store it in a 2D array
                {
                    str=str+line.charAt(k);
                    if(line.charAt(k)==',')
                    {
                        s[i][j]=str;
                        j++;
                        str="";
                    } 
                }
                s[i][j]=str;
                i++;
                int k=0;
				//to print the possible combinations using ',' as seperator
                for(i=0;i<3;i++)
                {
                    for(j=0;j<2;j++)
                    {
                        for(k=0;i<k;k++)
                        {
                            if(i!=3 && j!=2 && k!=2)
                                System.out.print(s[0][i].charAt(1)+s[0][j].charAt(1)+s[0][k].charAt(1)+",");
                            else
                                System.out.print(s[0][i].charAt(1)+s[0][j].charAt(1)+s[0][k].charAt(1));
                        }
                    }
                } 
            }}
        catch (IOException e)   
        {  
            e.printStackTrace();  
        } 

    }
}