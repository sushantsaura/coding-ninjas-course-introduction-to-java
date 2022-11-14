package lecture1;


  public static int linearSearch(int arr[], int x) {
        
        int t=0;
	   for(int i=0;i<arr.length;i++){
           if(arr[i]==x){
               t=i;
               break;
           }else{
               t=0;
           }
       }
        if(t!=0){
            return t;
        }else{
            return -1;
        }
       
    }
}
