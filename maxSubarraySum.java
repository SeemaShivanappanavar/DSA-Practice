import java.util.*;

class maxSubarraySum {
    public static void main(String[] args) {
    
      int arr[]={2,3,-8,7,-1,2,3};
      int max=Integer.MIN_VALUE;
      int currMax=0;
      
      for(int i=0; i<arr.length; i++)
      {
          currMax+=arr[i];
          max=Math.max(max,currMax);
          if(currMax<0)
          currMax=0;
      }

      System.out.println("Maximum Subarray Sum: "+max);
      
    }
}
