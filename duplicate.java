package lecture1;

public class duplicate {
	int i,j;
        int  flag=0;
        for(i=0;i<arr.length;i++){
            int x=arr[i];
            flag=0;
            for(j=0;j<arr.length;j++){
                if(i!=j  && arr[j]==x){
                    flag=1;
                    break;
                }
            }
            if(flag==1){
                break;
            }
        }
        return arr[i];
    }
}
