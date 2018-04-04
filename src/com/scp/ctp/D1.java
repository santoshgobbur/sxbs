package com.scp.ctp;

 interface D1 {
	  void Print();
 }
 interface D2{
	 void Print();
 }
 
 class D3 implements D1,D2{
	 
	 public void Print(){
		 System.out.println("Hello");
	 }
 	
  public static void main(String[] args){
	   
	D3 obj = new D3();
	obj.Print();
  }
 } 