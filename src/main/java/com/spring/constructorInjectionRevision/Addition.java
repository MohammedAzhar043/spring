package com.spring.constructorInjectionRevision;

public class Addition {

	private int a;
	private int b;

	public Addition(double a, double b) {
		this.a = (int) a;
		this.b = (int) b;
		System.out.println("constructor : double, double");
		System.out.println(" A " + this.a);
		System.out.println(" B " + this.b);
	}

	public Addition(int a, int b) {
		this.a = a;
		this.b = b;
		System.out.println("constructor : int, int");
		System.out.println(" A " + this.a);
		System.out.println(" B " + this.b);
	}

	public Addition(String a, String b) {
		this.a = Integer.parseInt(a);
		this.b = Integer.parseInt(b);
		System.out.println("constructor : String, String");
		System.out.println(" A " + this.a);
		System.out.println(" B " + this.b);
	}

	public void doSum() {
		System.out.println("the sum is " + ((this.a) + (this.b)));

	}

}
