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
		ben.soyadi = "Ayd�n";
		
		ben.anne = new Odev();
		ben.anne.adi= "Zahide";
		ben.anne.soyadi= "Can";
		
		ben.baba = new Odev();
		ben.baba.adi= "Metin";
		ben.baba.soyadi= "Can";
		
		
		ben.anne.anne = new Odev();
		ben.anne.baba = new Odev();
		ben.anne.anne.adi= "��kriye";
		ben.anne.baba.adi= "�brahim";
		
		
		ben.baba.anne = new Odev();
		ben.baba.baba = new Odev();
		ben.baba.anne.adi= "Fehime";
		ben.baba.baba.adi= "H�seyin";
		
		
		ben.anne.anne.anne = new Odev();
		ben.anne.anne.baba = new Odev();
		ben.anne.baba.anne = new Odev();
		ben.anne.baba.baba = new Odev();
		ben.anne.anne.anne.adi = "Zeycan";
		ben.anne.anne.baba.adi = "�hsan";
		ben.anne.baba.anne.adi = "Zahide";
		ben.anne.baba.baba.adi = "�erif";
		
		
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
		kizamik.belirtileri = "ate�, titreme, �ks�r�k,k�zar�kl�k";
		
		Hastalik grip = new Hastalik();
		grip.adi = "�st Solunum Yolu Enfeksiyonu";
		grip.bulasiciOlmaDurumu = true;
		grip.belirtileri = "Bo�az a�r�s�, Burun t�kan�kl���, �ks�r�k";
		
		Hastalik zat�rrre = new Hastalik();
		zat�rrre.adi = "Zat�rre";
		zat�rrre.bulasiciOlmaDurumu = true;
		zat�rrre.belirtileri = "ate�, �ks�r�k, g���s a�r�s�,bulant�, halsizlik";
		
		Hastalik astim = new Hastalik();
		astim.adi = "Astim";
		astim.bulasiciOlmaDurumu = false;
		astim.belirtileri = "�ks�r�k, H�r�lt�, nefes darl���";
		
		Hastalik seker = new Hastalik();
		seker.adi = "�eker";
		seker.bulasiciOlmaDurumu = false;
		seker.belirtileri = "A��z kurulu�u, kuru cilt, elde ve ayakta uyu�ma";
		
		Hastalik obezzite = new Hastalik();
		obezzite.adi = "Obezite";
		obezzite.bulasiciOlmaDurumu = false;
		obezzite.belirtileri = "Terleme, horlama, nefes darl���, eklemlerde a�r�";
		
		
		
		System.out.println("Hastali�in ad�: " + kizamik.adi + " Bula�ici olma durumu: " + kizamik.bulasiciOlmaDurumu+ " Blirtileri:" + kizamik.belirtileri);
		System.out.println("Hastali�in ad�: " + grip.adi+ " Bula�ici olma durumu: " + grip.bulasiciOlmaDurumu+ " Blirtileri:" + grip.belirtileri);
		System.out.println("Hastali�in ad�: " + zat�rrre.adi + " Bula�ici olma durumu: " +zat�rrre.bulasiciOlmaDurumu  + " Blirtileri:" + zat�rrre.belirtileri);
		System.out.println("Hastali�in ad�: " + astim.adi + " Bula�ici olma durumu: " + astim.bulasiciOlmaDurumu+ " Blirtileri:" + astim.belirtileri);
		System.out.println("Hastali�in ad�: " + seker.adi+ " Bula�ici olma durumu: " + seker.bulasiciOlmaDurumu+ " Blirtileri:" + seker.belirtileri);
		System.out.println("Hastali�in ad�: " + obezzite.adi+ " Bula�ici olma durumu: " + obezzite.bulasiciOlmaDurumu+ " Blirtileri:" + obezzite.belirtileri);
		
		/**************************************/
	     
	}

}
