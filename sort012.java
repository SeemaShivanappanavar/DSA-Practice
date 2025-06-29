
class sort012 {
  public static void main(String[] args){
        
        int arr[]={1,2,0,1,1,0,2,0,1,0};
        int low=0;
        int mid=0;
        int high=arr.length-1;
        
        
        while(mid<=high)
        {
            if(arr[mid]==0)
            {
               swap(arr,mid,low);
               low++;
               mid++;
            }
            
            else if(arr[mid]==1)
            mid++;
            
            else{
                swap(arr,mid,high);
                high--;
                
            }
        }

        for(int num:arr)
        System.out.print(num+" ");
    }

   static void swap(int arr[], int x, int y)
    {
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
}