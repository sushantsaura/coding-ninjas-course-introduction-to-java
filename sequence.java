package lecture1;
import java.util.Scanner;
public class sequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner s = new Scanner(System.in);
	        int n = s.nextInt();
	        int prev = s.nextInt();
	        int count = 2, current;
	        boolean isDec = true;
	        while(count<=n){
	         current = s.nextInt();
	         count++;
	        //now we start to check the sequence
	        if(current==prev){
	            System.out.println("false"); //if 2 numbers are equal we simply exit the loop
	            return;

	        }else if(current<prev){
	            if(isDec==false){
	                System.out.println("false");
	                return;                
	            }
	        }else{
	            if(isDec==true){
	                isDec = false;
	            }
	            
	        }
	        prev = current;
	        }
	        System.out.println("true");
	        s.close();
		}

	
	}


