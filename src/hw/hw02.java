package hw;
/*

 * Date: 2016/10/31
 */

import java.util.Scanner;
public class hw02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		int n = scn.nextInt();
		double m = scn.nextDouble();
		GG(n , m);
		
	}	
		
	public static void GG(int n , double m){
		double x = 1;
		
		if(n == 1){x = (m - 170) * 0.6 + 62;}
		else{if(n == 2){x = (m - 158) * 0.5 + 52;}
		System.out.print(x);}	
		
	}

}
