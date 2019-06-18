package org.Example;

class abstraction2 extends abstraction{

	@Override
	void method(int a) {
		System.out.println("hai");
		System.out.println(a);
	}
	public static void main(String[] args) {
		abstraction2 d = new abstraction2();
		d.method(20);
		d.method1();
	}

}
