package ex;
/*
 * Topic: 使用者輸入兩個整數，透過函數呼叫輸出排列組合函數 C(m,n)。公式: C(m,n) = m!/n!(m-n)!
 * Date: 2016/10/31
 * Author: 105021041 楊建宸
 */

import java.util.Scanner;
public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		System.out.print("輸入整數：");
		int m = scn.nextInt();
		int n = scn.nextInt();
		C(m,n);
		
	}	
		
	public static int C(int m,int n){
		int t1 = 1;
		int t2 = 1;
		int t3 = 1;
		
		for(int x = 1 ; x <= m ; x ++){t1 = t1 * x;}
		for(int y = 1 ; y <= n ; y ++){t2 = t2 * y;}
		for(int z = 1 ; z <= (m-n) ; z ++){t3 = t3 * z;}
		System.out.print(t1 / (t2 * t3));
		return m;

	}

}
