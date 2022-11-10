package lecture1;
import java.util.Scanner;
public class halfDiamondPattern {
	
	    
	    public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	        int n=sc.nextInt();
	        int i=1;
	        System.out.println("*");
	        while(i<=n){
	            System.out.print("*");
	            int j=1;
	            while(j<=i){
	                System.out.print(j);
	                j++;
	            }
	            j=1;
	            int p=i-1;
	            while(j<=i){
	                if(i==1){
	                    System.out.print("*");
	                }else if(p==1){
	                    if(p!=0){
	                    
	                    System.out.print(p);
	                    System.out.print("*");
	                    p--;
	                    }
	                }else{
	                    if(p!=0){
	                    System.out.print(p);
	                    
	                    p--;
	                    }
	                }
	                
	                j++;
	            }
	            i++;
	            System.out.println();
	        }
	        i=1;
	        int k=n-1;
	        
	        while(i<=k){
	            int p=1;
	            System.out.print("*");
	            int j=1;
	            while(j<=k-i+1){
	                System.out.print(p);
	                p++;
	                j++;
	            }
	            j=1;
	            p=k-i;
	            
	            //while(j <= k - i + 1)
	            while(j<=k-i){
	                if(p==1){
	                    System.out.print(p);
	                    System.out.print("*");
	                }else {
	                    if(p!=0&&p!=1){
	                    System.out.print(p);
	                    p--;
	                    }
	                }
	                j++;
	            }
	            
	            if(i == k)
	            {
	                System.out.print("*");
	            }
	            i++;
	            System.out.println();
	        }
	         System.out.print("*");
	       
	    }
	}

