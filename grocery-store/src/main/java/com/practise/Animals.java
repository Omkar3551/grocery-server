package com.practise;

public class Animals {
	String color;
	int age;
		void initObj(String c,int a) {
			color = c;
			age = a;
			
		}
		void display() {
			System.out.println(color + " " + age);
		}
		public static void main(String[] args) {
			Animals moti = new Animals();
			moti.initObj("black", 10);
			moti.display();
		}		
	
}
