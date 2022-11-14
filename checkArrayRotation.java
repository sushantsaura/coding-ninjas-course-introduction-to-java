package lecture1;

public class checkArrayRotation {

	   int count=1;
        if(arr.length<=1){
            return 0;
        }
        
    	 for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]>arr[i+1])
                return i+1;
        }
        return 0;
    }
}
