
import java.util.ArrayList;
import java.util.List;
 
 class Subsequence{

  static void  fun(int index, int s,int sum, int arr[], List<Integer> li){
    if(index==arr.length){
      if(s==sum){
        if(li.size()>0){
          System.out.println(li);
        }
      }
      return;
    }
    li.add(arr[index]);
    s+=arr[index];
    fun(index+1, s,sum, arr, li );
    s-=arr[index];
    li.remove(li.size()-1);
    fun(index+1, s,sum,arr, li);
  }
  
  public static void main(String[] args) {
    int arr[]={1,2,3,4,5};
    List<Integer> li=new ArrayList<Integer>(); 
    int sum=4;
    fun(0,0,sum, arr, li);
    
  }
} 