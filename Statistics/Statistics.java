package Statistics;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Statistics{
    public static void main (String args[])
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try{
            String line;
            int caseNo = 1;
            while((line=bufferedReader.readLine())!=null)
            {
                String[] lines = line.split(" ");
                int num[] = new int[lines.length-1];
                for(int i = 1; i < lines.length; i++)
                {
                    num[i-1]=Integer.parseInt(lines[i]);
                }
                getMaxMinRange(num, caseNo);
                caseNo++;

            }
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    private static void getMaxMinRange(int[] num, int caseNo) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < num.length; i++)
        {
            if(min>=num[i])
                min = num[i];
            if(max<=num[i])
                max = num[i];
        }
        int range = max - min;
        System.out.println("Case "+caseNo+": "+min+" "+max+" "+range);
    }
}
