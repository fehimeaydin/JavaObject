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
		ben.soyadi = "Aydın";
		
		ben.anne = new Odev();
		ben.anne.adi= "Zahide";
		ben.anne.soyadi= "Can";
		
		ben.baba = new Odev();
		ben.baba.adi= "Metin";
		ben.baba.soyadi= "Can";
		
		
		ben.anne.anne = new Odev();
		ben.anne.baba = new Odev();
		ben.anne.anne.adi= "Şükriye";
		ben.anne.baba.adi= "İbrahim";
		
		
		ben.baba.anne = new Odev();
		ben.baba.baba = new Odev();
		ben.baba.anne.adi= "Fehime";
		ben.baba.baba.adi= "Hüseyin";
		
		
		ben.anne.anne.anne = new Odev();
		ben.anne.anne.baba = new Odev();
		ben.anne.baba.anne = new Odev();
		ben.anne.baba.baba = new Odev();
		ben.anne.anne.anne.adi = "Zeycan";
		ben.anne.anne.baba.adi = "İhsan";
		ben.anne.baba.anne.adi = "Zahide";
		ben.anne.baba.baba.adi = "Şerif";
		
		
		ben.baba.anne.anne = new Odev();
		ben.baba.anne.baba = new Odev();
		ben.baba.baba.anne = new Odev();
		ben.baba.baba.baba = new Odev();
		ben.baba.anne.anne.adi = "Nurten";
		ben.baba.anne.baba.adi = "Mehmet";
		ben.baba.baba.anne.adi = "Hanife";
		ben.baba.baba.baba.adi = "Celil";
		
		System.out.println("\t\t\t"+ ben.adi  + " " +ben.soyadi);
		System.out.println("\t"+ben.anne.adi + " " +ben.anne.soyadi +  "\t\t\t"+   ben.baba.adi + " " +ben.baba.soyadi); 
		System.out.println("   " + ben.anne.anne.adi + "\t" +ben.anne.baba.adi +  "\t\t "+   ben.baba.anne.adi + "\t\t" + ben.baba.baba.adi); 
		System.out.println( ben.anne.anne.anne.adi + "  " +ben.anne.anne.baba.adi +  "  "+ ben.anne.baba.anne.adi + "  " +ben.anne.baba.baba.adi + "  " + ben.baba.anne.anne.adi + "  " +ben.baba.anne.baba.adi + "  " + ben.baba.baba.anne.adi + "  "+ ben.baba.baba.baba.adi); 
		
		 /*************************************/
		  
	     
	}

}
