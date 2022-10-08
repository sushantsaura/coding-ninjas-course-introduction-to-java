package lecture1;
import java.util.Scanner;

public class averageMarks{
    


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
        Scanner sc= new Scanner(System.in);
        String name=sc.next();
        char n=name.charAt(0);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int sum=a+b+c;
        int avg=sum/3;
        System.out.println(n);
        System.out.print(avg);
		
	}

}
