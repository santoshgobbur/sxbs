package com.scp.ENUM;

public class Demo1 {

	public static void main(String[] args) {
		
		language l1 = language.English;
		System.out.println(l1);
		
		States st = States.MH;
		System.out.println(st);
		
		States [] s1 = States.values();
	//	enum X {
		          // CTE : Should be defined inside top level class or interface.
	//	}
        for (States s2:s1){
        	System.out.println(s2+" "+s2.ordinal());
        }
		
	}
	
	enum language {
		English,hindi,Marathi,Kannada,Telugu,Tamil;
	}
 }
   enum States{
	   MH,KA,AP;
   }
   
// If we define enumm outside a class the applicable modifiers r public,default,Strictfp.
// ----  " ----------  inside ------------"---------------------------------------------,private, protected and static.