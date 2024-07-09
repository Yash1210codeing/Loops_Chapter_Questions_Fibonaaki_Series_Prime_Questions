package Loops_Chapter_Questions_Fibonaaki_Series_Prime_Questions;
import java.util.*;
public class Sum_Of_Digits {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        while(n>0) {
        	int rem=n%10;
        	sum=sum+rem;
        	n/=10;    // n=n/10;        	
        }
        System.out.println(sum);        
	}

}
