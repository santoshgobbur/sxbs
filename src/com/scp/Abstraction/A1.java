package com.scp.Abstraction;

public abstract class A1 {
	
	public void m1(){
		System.out.println("A1 m1");
	}
    public abstract void m2();
}

class A11 extends A1{
	public void m1(){
		System.out.println("A11 m1");
	}
	
	public void m2(){
		System.out.println("A11 m2");
	}
	public static void main(String[] args) {

		A11 a11 = new A11();
		A1 hbd = new A11();
		A11 hbd1 = new A22();
		hbd1.m2();
		
		a11.m1();
		hbd.m1();
		hbd.m2();
		
	}
}
class A22 extends A11{
	
	public void m2(){
		System.out.println("fjhgjf");
	}
}

