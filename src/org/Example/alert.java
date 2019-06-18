package org.Example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert {

	static int f;
	static int c;
	void method () {
		int a = 10;
		int b = 1;
		int c= a+b;
		System.out.println(c);
		
	}
	void method1() {
		int d = 15;
		int e = 13;
		int f= d+e;
		System.out.println(f);
		
	}
	void method2 () {
		
		int r= f-c;
		System.out.println(r);
		
	}
	
public static void main(String[] args) {
	alert a = new alert() ;
	a.method();
	a.method1();
	a.method2();
}
}
