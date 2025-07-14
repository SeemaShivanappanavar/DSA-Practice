import java.util.ArrayList;

public class negativesAtEnd{
   public static void main(String[] args){
       
        int arr[]={1,-2,3,4,-7,-5,11,6};
        int n=arr.length;
        ArrayList<Integer>res=new ArrayList<>();
      
        for(int i=0; i<n; i++)
        {
            if(arr[i]>=0)
           res.add(arr[i]);
        }
        
        
          for(int i=0; i<n; i++)
        {
            if(arr[i]<0)
           res.add(arr[i]);
        }
        
        for(int i=0; i<n; i++)
        {
            arr[i]=res.get(i);
        }
        
        for(int num:arr)
        System.out.print(num+" ");
    }
}
