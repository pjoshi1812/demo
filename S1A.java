import java.io.*;
class S1A
{
    public static void main(String args[])
    {
        try
        {
            FileReader fr = new FileReader(args[0]);
            FileWriter fw = new FileWriter(args[1]);
            char ch;
            int ch1;
      
            while((ch1=fr.read())!=-1)
            {
                ch=(char)ch1;
                if(!(Character.isDigit(ch)))
                {
                    fw.write(ch);
                    System.out.println(ch);
                   

                }
         
            
            }
            System.out.print("Non-numeric data has been copied");
            fw.close();

        }catch(Exception e)
        {
            
        }
    }
}
