import java.util.HashSet;

class unionOfArrays {
  public static void main(String[] args) {
        // code here
        int a[]={1,2,3,4,5};
        int b[]={1,2,3};
        HashSet<Integer> set=new HashSet<>();
        
        for(int i=0; i<a.length;i++)
          set.add(a[i]);
          
        for(int j=0; j<b.length; j++)
          set.add(b[j]);
          
        
        System.out.println(set.size());
    }
}