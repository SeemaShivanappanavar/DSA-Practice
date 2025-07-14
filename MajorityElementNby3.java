//number appears more than n/3 times
import java.util.*;

public class MajorityElementNby3
{
    public static void main(String[] args) {
        
       int[] arr = {3, 2, 3};

        int range=arr.length/3;
        //System.out.println(range);
        HashMap<Integer,Integer> map=new HashMap<>();
        ArrayList<Integer> frequency=new ArrayList<>();
        for(int i=0; i<arr.length; i++)
        {
            if(map.containsKey(arr[i]))
            map.put(arr[i],map.get(arr[i])+1);

            else
            map.put(arr[i],1);
        }

        for(Map.Entry<Integer,Integer> e:map.entrySet())
        {
            if(e.getValue()>range)
            frequency.add(e.getKey());
        }

       System.out.println(frequency);
    }
}
