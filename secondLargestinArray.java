package lecture1;

public class secondLargestinArray {

	          int n=arr.length;
          int largest=Integer.MIN_VALUE;
          int second=Integer.MIN_VALUE-1;
          int flag=0;
          if(n<=1){
              return Integer.MIN_VALUE;
          }else{
          for(int i=0 ; i<n ; i++){
            
              if(arr[i]>largest){
                  second=largest;
                  largest=arr[i];
                 
              }
              else if(second< arr[i] && arr[i]  != largest){
                  second = arr[i];
              }
              
          }
          return second;
          }
    
    }

}
