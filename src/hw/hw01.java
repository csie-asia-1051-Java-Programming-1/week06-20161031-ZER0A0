package hw;
/*
 * Topic: 請設計一個函數fun(v1, type)，
 * 讓使用者輸入一個溫度值及計算方式(type 為1 時 華氏->攝氏，type為2時攝氏->華氏)，
 * 函數算出結果後要回傳至主程式再印出結果。
 * (F=C*9/5+32), (C = (F-32) * (5/9)，
 * 例如輸入100 1 則輸出 37.77778; 輸入 37.77778 2 時則輸出 100.0

 * Date: 2016/10/31
 * Author: 105021041 楊建宸
 */

import java.util.Scanner;
public class hw01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		float v1 = scn.nextFloat();
		int type = scn.nextInt();
		fun(v1 , type);
		
	}	
		
	public static void fun(float v1 , int type){
		float x = 1;
		if(type == 1){x = (v1 - 32) * (5 / 9);}
		else{if(type == 2){x = v1 * 9 / 5 + 32;}
		System.out.print(x);}

	}

}
