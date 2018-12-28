package faydin.obj.Odev231218;

import faydin.obj.insan.Insan;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Odev();
		
		/**************javaMethodOverridingSports **************
		 Odev c1 = new Odev();
	     Soccer c2 = new Soccer();
	     System.out.println(c1.getName());
	     c1.getNumberOfTeamMembers();
	     System.out.println(c2.getName());
	     c2.getNumberOfTeamMembers();
	     *****************************************************/
	    
	     
		

		/**************javaInheritanceI **************
		 Bird bird = new Bird();
		 bird.walk();
		 bird.fly();
		 bird.sing();
		 ********************************************/
		 
		
		     
		 /**************javaInheritanceII **************
		 Adder.java
		
		 **********************************************/
		     
		 /**************Soyagaci **************/
		Odev ben = new Odev();
		ben.adi = "Fehime";
		ben.soyadi = "Aydýn";
		
		ben.anne = new Odev();
		ben.anne.adi= "Zahide";
		ben.anne.soyadi= "Can";
		
		ben.baba = new Odev();
		ben.baba.adi= "Metin";
		ben.baba.soyadi= "Can";
		
		
		ben.anne.anne = new Odev();
		ben.anne.anne.adi= "xxxyyy";
		
		
		System.out.println(ben.adi  + " " +ben.soyadi);

		System.out.println(ben.anne.adi); 
		System.out.println(ben.baba.adi); 
		
		 /*************************************/
		  
	     
	}

}
