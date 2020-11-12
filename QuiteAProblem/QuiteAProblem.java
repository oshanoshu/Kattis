package QuiteAProblem;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class QuiteAProblem {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try{
            String line;
            while((line=bufferedReader.readLine())!=null)
            {
                if(line.toLowerCase().contains("problem"))
                    System.out.println("yes");
                else
                    System.out.println("no");
            }
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
