package com.practise;

import java.util.Scanner;

public class FiboNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a = 0;
		int b = 1;
		int count = 2;
		while (count <= n) {
			int temp = b;
			b = b + a;
			a = temp;
			count++;
			
		}
		System.out.println(b);

	}

}
