package faydin.obj.insan.kalitim.arayuz;

public class Runner {

	public static void main(String[] args) {
		Isci temp = new Isci("xxx");
		temp.Calis();
		temp.Dinlen();
		temp.MolaVer(12);
		temp.YemekYe();
		
		Robot r = new Robot();
		r.Calis();
		r.Dinlen();
		
		System.out.println("................");
		//Calisabilir calis = temp; //yukar� ba�lama - calisabilir interface inin fonksiyonlar�n� al�r, �nsan�n de�il
		//Calisabilir calis = new Isci(); // yeni bir instance yarat�p Calisabilir interface in methodlar�n� ald�k. �sttekiyle ayn� i�lem, farkl� de�i�ken
		
		//calis.Calis();
		//calis.Dinlen();
		
		Calisabilir[] calis = {new Isci("yyy"), new Robot()};
		calis[0].Calis();
		calis[0].Dinlen();
		calis[1].Calis();
		calis[1].Dinlen();

		System.out.println("................");
		Isci deneme = (Isci) calis[0]; //casting i�lemi
		deneme.MolaVer(5);
		
		Object[] calis1 = {new Isci("zzz"), new Robot()};
		Isci isci1 = (Isci) calis[0]; /// de�i�kene al�p casting
		isci1.Calis();
		isci1.Dinlen();
		
		
		((Isci)calis[0]).Dinlen(); // tek sat�rda casting
		Isci isci2 = (Isci) calis[0];
		
	}

}
