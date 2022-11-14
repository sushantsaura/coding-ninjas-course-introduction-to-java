package lecture1;

public class insertion {
  for(int i=1; i<arr.length ; i++){
            int current =arr[i];
            int j;
            for(j=i-1; j>=0&&current<arr[j];j--){
                   arr[j+1]=arr[j];
            }
            arr[j+1]=current;
        }
    }
}
