package lecture1;
import java.util.Scanner;
public class diamindPattern {
	
	    
	    public static void main(String[] args) {
	       Scanner sc=new Scanner(System.in);
	        int n=sc.nextInt();
	        int i=1;
	        int mid=(n+1)/2;
	        while(i<=mid){
	            int j=1;
	            while(j<=mid-i){
	                System.out.print(" ");
	                j++;
	            }
	            j=1;
	            while(j<=i){
	                System.out.print("*");
	                j++;
	            }
	            j=1;
	            while(j<=i-1){
	                System.out.print("*");
	                j++;
	            }
	            System.out.println();
	            i++;
	        }
	        i=1;
	        mid=n/2;
	        while(i<=mid){
	            int j=1;
	            while(j<=i){
	                System.out.print(" ");
	                j++;
	            }
	            j=1;
	            while(j<=mid-i+1){
	                System.out.print("*");
	                j++;
	            }
	            j=1;
	            while(j<=mid-i){
	                System.out.print("*");
	                j++;
	            }
	            System.out.println();
	            i++;
	        }
	    }
	}

