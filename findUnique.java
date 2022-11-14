package lecture1;

public class findUnique {
  int flag=0;
        int j;
        int i;
       
       	for(i=0;i<arr.length;i++){
          	
            int x=arr[i];
            flag = 0;
            
        	for(j=0;j<arr.length;j++){
        		if(i!=j && arr[j]==x){
              		flag=1;    
              		break;
                }              	
            }
            
           	if(flag==0){
               break;
           	}
    	}
        
        return arr[i];
      
      
	}
}
