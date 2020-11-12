package Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.io.InputStreamReader;

public class Sort {
    public static void main(String args[]) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            bufferedReader.readLine();
            String line2[] = bufferedReader.readLine().split(" ");
            int num[] = new int[line2.length];
            for(int i = 0; i < line2.length; i++)
            {
                num[i] = Integer.parseInt(line2[i]);
            }
            frequencySort(num);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void frequencySort(int[] num) {
        LinkedHashMap <Integer, Integer> hashtable = new LinkedHashMap<>();
        for(int i = 0; i <num.length; i++)
        {
            if(hashtable.keySet().contains(num[i]))
                hashtable.put(num[i], hashtable.get(num[i])+1);
            else
                hashtable.put(num[i], 1);
        }
        ArrayList<Map.Entry<Integer,Integer>> l = new ArrayList(hashtable.entrySet());
        Collections.sort(l,new Comparator<Map.Entry<Integer, Integer>>(){
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        int sortedNumbers[] = new int [num.length];
        int j = 0;
        for(Map.Entry<Integer,Integer> m: l)
        {
            for(int i = 0; i<m.getValue(); i++)
            {
                sortedNumbers[j] = m.getKey();
                j++;
            }
        }
        for(int i = 0; i < num.length; i++)
            System.out.print(sortedNumbers[i]+" ");
        
    }
}
