package org.Example;

public class inher3 extends inher2 {
void method3() {
	System.out.println("grand child");
}

public static void main(String[] args) {
	
	inher3 i = new inher3();
	i.method3();
	i.method2();
	i.method();
	

}
}
