package lecture1;

public class pushZeroatEnd {
         int len = arr.length;
        int i = 0 ;
        int k = 0;
        int temp = 0;
        
        for(i = 0; i<len; i++){
            if (arr[i]!=0){
                
                //swap elements
                temp = arr[k];
                arr[k] = arr[i];
                arr[i] = temp;
                k++;
            }
        }
        }
}
