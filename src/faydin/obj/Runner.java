package faydin.obj;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arac temp = new Arac();
		//temp.koltuk=true;
		temp.setKoltuk(true);
		temp.setTekerlekSayisi(4);
		
		Arac temp1;              // null, RAM de yer ayr�lmad�
		//temp1 = new Arac();    // RAM de yer tahsisi yap�ld�. 
		temp1 = new Arac(4);     // atama ger�ekle�tirdik
		//temp1.koltuk=true;
		temp.setKoltuk(true);
		temp1.setTekerlekSayisi(10);
		temp = temp1; //object i�lemlerinde art�k ayn� yeri g�steriyorlar. clonelama
		temp.toString();
		
		temp.setTekerlekSayisi(5);
		System.out.println(temp.getTekerlekSayisi()); //4   //10   //5
		System.out.println(temp1.getTekerlekSayisi()); //10  //10  //5
		
		
	}

}
