package lecture1;

public class gcd{
	
	//----->method 1<------
	/*
	static int GD(int a , int b) {
		int n ; 
		if(a>b) {
			n=a;
		}
			else {
				n=b;
			}
		for(int i=n ; i>1 ; i--) {
			if(a%i==0 && b%i==0) {
				return i;
			}
		}
		return 1;
	
}
*/
	//------>method 2 <---------
	static int  gd(int a , int b ) {
		if(b==0) {
		   return a;
		}else {
			return gd(b,b-a);
		}
	}
	public static void main(String[] args ) {
		System.out.print(gd(30,60));
	}
}
