package Loops_Chapter_Questions_Fibonaaki_Series_Prime_Questions;
public class GCD_HCF_For_Loop {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int divisor=36;
        int divident=60;
        for(;divident%divisor !=0;){
        	int rem=divident%divisor;
        	divident=divisor;
        	divisor=rem;
        }
        System.out.println(divisor);
	}

}
