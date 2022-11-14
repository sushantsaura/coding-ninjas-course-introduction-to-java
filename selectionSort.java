package lecture1;

public class selectionSort {
  for(int i=0 ; i<arr.length ; i++){
               int smallest=arr[i];
               int minIndex=i;  
               for(int j=i+1 ; j<arr.length ; j++){
                   if(arr[j]<smallest){
                     smallest=arr[j] ;
                     minIndex=j;
                   }
               }
             arr[minIndex]=arr[i];
               arr[i]=smallest ;
                
           } 
           
    }   
}
