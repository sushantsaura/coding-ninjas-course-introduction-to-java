package lecture1;

public class binarySearch {
    int start=0;
       int end=arr.length-1;
       while(start<=end){
           int mid=(start+end)/2;
           if(x>arr[mid]){
               start=mid+1;
           }else if(x==arr[mid]){
               return mid;
           }else{
               end=mid-1;
           }
       }
       return -1;
    }

}
