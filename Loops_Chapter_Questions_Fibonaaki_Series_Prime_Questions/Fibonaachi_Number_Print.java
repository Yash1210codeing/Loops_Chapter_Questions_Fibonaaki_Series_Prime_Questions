package Loops_Chapter_Questions_Fibonaaki_Series_Prime_Questions;
import java.util.*;
public class Fibonaachi_Number_Print {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0;
        int b=1;
        for(int i=1;i<=n;i++) {
        	int c=a+b;
        	a=b;
        	b=c;
        }
        System.out.println(a);
	}

}
