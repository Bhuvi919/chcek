package org.Example;

public class overriding2 extends overriding {
void method() {
	super.method();
	System.out.println("Iam not reading");
}
public static void main(String[] args) {
	overriding2 r = new overriding2() ;
	r.method();
	}
}
	

//how to run overriding 