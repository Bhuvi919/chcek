package org.Example;

public class overload {
void add() {
	int c= 20 + 30;
	System.out.println(c);
}
void add(int a,int b) {
	int d = a+b;
	System.out.println(d);
	
}
void add (float a ,double b) {
	double e = a+b;

	System.out.println(e);
}
public static void main(String[] args) {
	overload o = new overload();
	o.add();
	o.add(20,10);	
	o.add(2.2f, 2.2);
	//why float not workin
	//how to add sysout in main method
	
}
}
