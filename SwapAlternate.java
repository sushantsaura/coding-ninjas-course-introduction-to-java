package lecture1;

public class SwapAlternate {
   public static void swapAlternate(int arr[]) {
        if(arr.length%2==0){
         int   n=arr.length;
       
       for(int i=0 ; i<n; i+=2){
           int temp=arr[i];
           arr[i]=arr[i+1];
           arr[i+1]=temp;
       }
        }
        else{
            int i;
            for( i=0 ; i<arr.length-1;i+=2){
                int temp=arr[i];
           arr[i]=arr[i+1];
           arr[i+1]=temp;
            }
            arr[arr.length-1]=arr[i];
        }
    }
}
