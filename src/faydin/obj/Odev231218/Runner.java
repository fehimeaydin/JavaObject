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
		     
		 /**************Soyagaci **************
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
		ben.anne.baba = new Odev();
		ben.anne.anne.adi= "Þükriye";
		ben.anne.baba.adi= "Ýbrahim";
		
		
		ben.baba.anne = new Odev();
		ben.baba.baba = new Odev();
		ben.baba.anne.adi= "Fehime";
		ben.baba.baba.adi= "Hüseyin";
		
		
		ben.anne.anne.anne = new Odev();
		ben.anne.anne.baba = new Odev();
		ben.anne.baba.anne = new Odev();
		ben.anne.baba.baba = new Odev();
		ben.anne.anne.anne.adi = "Zeycan";
		ben.anne.anne.baba.adi = "Ýhsan";
		ben.anne.baba.anne.adi = "Zahide";
		ben.anne.baba.baba.adi = "Þerif";
		
		
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
		
		 *************************************/
		  
		
		
		/*****************Hastalik********************/
		Hastalik kizamik = new Hastalik();
		kizamik.adi = "Kizamik";
		kizamik.bulasiciOlmaDurumu = true;
		kizamik.belirtileri = "ateþ, titreme, öksürük,kýzarýklýk";
		
		Hastalik grip = new Hastalik();
		grip.adi = "Üst Solunum Yolu Enfeksiyonu";
		grip.bulasiciOlmaDurumu = true;
		grip.belirtileri = "Boðaz aðrýsý, Burun týkanýklýðý, öksürük";
		
		Hastalik zatürrre = new Hastalik();
		zatürrre.adi = "Zatürre";
		zatürrre.bulasiciOlmaDurumu = true;
		zatürrre.belirtileri = "ateþ, öksürük, göðüs aðrýsý,bulantý, halsizlik";
		
		Hastalik astim = new Hastalik();
		astim.adi = "Astim";
		astim.bulasiciOlmaDurumu = false;
		astim.belirtileri = "Öksürük, Hýrýltý, nefes darlýðý";
		
		Hastalik seker = new Hastalik();
		seker.adi = "Þeker";
		seker.bulasiciOlmaDurumu = false;
		seker.belirtileri = "Aðýz kuruluðu, kuru cilt, elde ve ayakta uyuþma";
		
		Hastalik obezzite = new Hastalik();
		obezzite.adi = "Obezite";
		obezzite.bulasiciOlmaDurumu = false;
		obezzite.belirtileri = "Terleme, horlama, nefes darlýðý, eklemlerde aðrý";
		
		
		
		System.out.println("Hastaliðin adý: " + kizamik.adi + " Bulaþici olma durumu: " + kizamik.bulasiciOlmaDurumu+ " Blirtileri:" + kizamik.belirtileri);
		System.out.println("Hastaliðin adý: " + grip.adi+ " Bulaþici olma durumu: " + grip.bulasiciOlmaDurumu+ " Blirtileri:" + grip.belirtileri);
		System.out.println("Hastaliðin adý: " + zatürrre.adi + " Bulaþici olma durumu: " +zatürrre.bulasiciOlmaDurumu  + " Blirtileri:" + zatürrre.belirtileri);
		System.out.println("Hastaliðin adý: " + astim.adi + " Bulaþici olma durumu: " + astim.bulasiciOlmaDurumu+ " Blirtileri:" + astim.belirtileri);
		System.out.println("Hastaliðin adý: " + seker.adi+ " Bulaþici olma durumu: " + seker.bulasiciOlmaDurumu+ " Blirtileri:" + seker.belirtileri);
		System.out.println("Hastaliðin adý: " + obezzite.adi+ " Bulaþici olma durumu: " + obezzite.bulasiciOlmaDurumu+ " Blirtileri:" + obezzite.belirtileri);
		
		/**************************************/
	     
	}

}
