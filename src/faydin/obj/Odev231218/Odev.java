package faydin.obj.Odev231218;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import faydin.obj.insan.Insan;


public class Odev {
	
	private Scanner scan;
	
	public Odev() {
		
		validUsernameRegEx();
		//javaMethodOverridingSports();
		//javaInheritanceI();
		//javaInheritanceII();
		//soyAgaci();
		
	}
	
	private void validUsernameRegEx() {

		
		scan = new Scanner(System.in);
		System.out.println("Kelimeler giriniz");
		String kelime = scan.nextLine();
		
		String dizi[]=kelime.split(" ");
		
		 for(int i=0;i<dizi.length ;i++){
			 
			//String username = scan.nextLine();
			String pattern = "^[a-zA-Z]\\w{7,29}$"; 
					// ^ sat�r ba��
			         // a dan z ye
			         // A dan Z ye
			         // \w for word
			         // {7,29} 8 ve 30 dahil karakter ilk karakter tan�mland��� i�in 7
			         // $ sat�r ba��
		
			Pattern r = Pattern.compile(pattern);
			Matcher m = r.matcher(dizi[i]);
			          
		    if (m.find()) {
		    	System.out.println("username  : "  + dizi[i] + " , Ge�erli");
			} else {
				System.out.println("username : " + dizi[i] + " , Ge�ersiz");
			 }
			        
		/*RegEx
		[abc]		   a, b, ya da c (basit s�n�flar)
		[^abc]		   a, b, veya c d���nda herhangi bir karakter (tersi)
		[a-zA-Z]	   a dan z ye, veya A dan Z ye (aral�k)
		[a-d[m-p]]	   a dan d, veya m den p: [a-dm-p] (birle�im)
		[a-z&&[def]]   d, e, veya f (kesi�im)
		[a-z&&[^bc]]   a dan z, b ve c hari�: [ad-z] (��karma)
		[a-z&&[^m-p]]  a dan z, ve m den p de�il: [a-lq-z] (��karma)
		*/
		   	
		 } 	
	    
	}
	
	
	//public String javaMethodOverridingSports() {
		public String getName() {
	        return "Generic Sports";
	    }
		public void getNumberOfTeamMembers() {
		        System.out.println("Each team has n players in " + getName());
		 }
		   
	//}
	
		
	
	//private void javaInheritanceI() {
		
		public void walk(){
		        System.out.println("I am walking");
		    }
		
	//}
		
		
	
	//private void javaInheritanceII() {
		
		public int add (int a, int b) {
		        return a + b;
		}
	
	
	
	//}

	/*Soy a�ac�*/
	public String  adi;
	public String  soyadi;
	public Odev  anne;
	public Odev  baba;
				
		
	
	
}



