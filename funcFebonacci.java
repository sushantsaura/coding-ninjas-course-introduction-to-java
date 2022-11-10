package lecture1;

public class funcFebonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

public class Solution {
	
	public static boolean checkMember(int n){
				
		/* Your class should be named Solution
		* Don't write main().
	 	* Don't read input, it is passed as function argument.
	 	* Return output and don't print it.
	 	* Taking input and printing output is handled automatically.
		*/
        int f1=0;
        int f2=1;
        int f3=0;
        for(int i=0;i<=n;i++){
            if(n==0){
                return true;
            }else{
         f3=f1+f2;
            f1=f2;
            f2=f3;
            if(f3==n){
                return true;
            }
            }
        }
        return false;
        

	}
	

}

	}

}
