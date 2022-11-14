package lecture1;

public class intersectionArray {
for (int i = 0; i < arr1.length; i++) {

            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i]==arr2[j]){
                    System.out.print(arr1[i]+" ");
                    arr2[j]=-9999999;
                    break;
                }
            }
        }
    }
}
