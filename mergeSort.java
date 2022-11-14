package lecture1;

public class mergeSort {
  int n=arr1.length+arr2.length;
    	int temp[]=new int[n];
        int i=0;
        int j=0;
        int k=0;

        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
               temp[k]=arr1[i];
               k++;
               i++;
            }else{
                temp[k]=arr2[j];
                k++;
                j++;
            }
        }
         
         while(i<arr1.length){
                 temp[k]=arr1[i];
               k++;
               i++;
         }
         while(j<arr2.length){
              temp[k]=arr2[j];
                k++;
                j++;
         }
        return temp; 
    }
}
