package faydin.obj.insan;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Insan ben = new Insan();
		ben.adi = "fehime";
		ben.soyadi = "ayd�n";
		
		ben.anne = new Insan();
		ben.anne.adi= "xxx";
		
		ben.anne.anne = new Insan();
		ben.anne.anne.adi= "xxxyyy";
		
		ben.baba.adi  = ""; // hatay� ald�g� yer buras�d�r. Gerisine ilerlemez.
		ben.baba.baba.adi  = "yyy";
		ben.baba.anne.adi  = "yyyaaa";
		
		System.out.println(ben.adi);
		System.out.println(ben.baba.adi); // baba nesnesi olu�turulmad��� i�in hata
		System.out.println(ben.baba.baba.adi); //hata al�r
		System.out.println(ben.anne.anne.adi); // xxxyyy
		System.out.println(ben.anne.baba.anne.adi); // null
		System.out.println(ben.anne.anne.anne.adi); // null
		System.out.println(ben.baba.baba.anne.adi); // null
		System.out.println(ben.baba.baba.baba.adi); // null
		
	}

}
