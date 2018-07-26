import java.util.*;

public class missingNo{
	public static void main(String args[]){
		Scanner src = new Scanner(System.in);
		System.out.println("Enter limit n");
		int n = src.nextInt();

		int actualSum = n*(n+1)/2;
		int sum = 0 ;

		System.out.println("Enter numbers from 0 to "+n);
		for(int i=0;i<n;i++){
			sum =sum + src.nextInt();
		}
		
		int calculate = actualSum-sum;

		//System.out.println(sum);
		System.out.println("Missing no is "+calculate);
	
	}
}
