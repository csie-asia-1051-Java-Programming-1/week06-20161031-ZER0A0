package hw;
/*
 * Topic: 讓使用者輸入性別與身高，透過函數呼叫，依據男女不同, 
 * 幫她(他)計算並輸出其標準體重
 *  ((1)男：(身高-170)*0.6+62 , (2)女：(身高-158)*0.5+52)。
 *  函數算出結果後要回傳至主程式再印出結果。
 *  例如:輸入 1 170 則輸出 62.0, 輸入 2 165 則輸出 55.5 

 * Date: 2016/10/31
 * Author: 105021041 楊建宸
 */

import java.util.Scanner;
public class hw02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		System.out.print("男輸入1,女輸入2：");
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
