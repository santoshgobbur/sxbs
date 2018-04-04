package com.scp.ENUM;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		players p = players.Rafa;
	//	players p1 = players.Sachin;

	
	switch(p){
	case Rafa : System.out.println("Tennis");
	            break;    
	case Sachin : System.out.println("Cricket");
    break;    
	case Messi : System.out.println("Football");
    break;    
	} 

}
}
enum players{
	Rafa,Sachin,Messi;
}
