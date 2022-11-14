package lecture1;

public class pairSum {
 int count=0;
       for(int i=0;i<arr.length;i++){
           int k=x-arr[i];
           for(int j=i+1;j<arr.length;j++){
           if(arr[j]==k){
                count++;
           }
           }
       }
       return count;
    }
}
