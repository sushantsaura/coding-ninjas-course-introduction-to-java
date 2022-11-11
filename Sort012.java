package lecture1;

public class Sort012 {
  public static void sort012(int[] arr){
    int temp[]=new int[arr.length];
    int nz=0;
    int nt=arr.length-1;
    for(int i=0 ; i<arr.length ; i++){
        if(arr[i]==0){
            temp[nz]=arr[i];
            nz++;
        }else if(arr[i]==2){
            temp[nt]=arr[i];
            nt--;
        }
    }
  while(nz<=nt){
      temp[nz]=1;
      nz++;
  }
    nz=0;
    for(int j=0 ; j<arr.length ; j++){
        arr[j]=temp[nz];
        nz++;
    }
    }

}
