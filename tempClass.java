package lecture1;

public class tempClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		import java.util.Scanner;
		public class Solution {

			public static void printFahrenheitTable(int start, int end, int step) {
				/* Your class should be named Solution 
				 * Don't write main(). 
				 * Don't read input, it is passed as function argument. 
				 * Print the specified output in required format. 
				 * Taking input is handled automatically. 
				 */
		        Scanner sc=new Scanner(System.in);
		         
		         while(start<=end){
		             int fer=5*(start-32)/9;
		             System.out.println(start+" "+fer);
		             start=start+step;
		         }
				
			}
		}
	}

}
