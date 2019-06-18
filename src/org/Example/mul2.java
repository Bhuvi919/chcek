package org.Example;

public class mul2 implements mul,mul1 
{
	void method3() {
		System.out.println("grand child");
	}
	public static void main(String[] args) {
		
		mul2 m = new mul2();
		m.method();
		m.method2();
		m.method3();
	}
	
}
