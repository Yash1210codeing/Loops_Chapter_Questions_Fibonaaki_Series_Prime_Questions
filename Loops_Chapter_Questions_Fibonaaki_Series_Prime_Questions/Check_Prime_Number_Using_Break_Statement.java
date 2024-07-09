package Loops_Chapter_Questions_Fibonaaki_Series_Prime_Questions;
import java.util.*;
public class Check_Prime_Number_Using_Break_Statement {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        for(int i=2;i<n;i++) {
        	if(n%i==0) {
        		count++;
        		break;
        	}
        }
        if(count==1) {
        	System.out.println("Number is not Prime");
        }else {
        	System.out.println("Number is prime");
        }
	}
}
