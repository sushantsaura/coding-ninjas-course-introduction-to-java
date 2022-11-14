package lecture1;

public class rotateArray {

	int temp[]=new int[d];
    
        int k=0;
        int count=0;
        for(int i=0; i<d ; i++){
            temp[k]=arr[i];
            k++;
        }
    
        for(int j=0 ;j<arr.length-d; j++){
           arr[j]=arr[j+d];
           count++;
        }
        k=0;
        for(int x=count ; x<arr.length ;x++){
            arr[x]=temp[k];
            k++;
        }
    }
}
