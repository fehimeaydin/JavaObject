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
		//Calisabilir calis = temp; //yukarý baðlama - calisabilir interface inin fonksiyonlarýný alýr, Ýnsanýn deðil
		//Calisabilir calis = new Isci(); // yeni bir instance yaratýp Calisabilir interface in methodlarýný aldýk. Üsttekiyle ayný iþlem, farklý deðiþken
		
		//calis.Calis();
		//calis.Dinlen();
		
		Calisabilir[] calis = {new Isci("yyy"), new Robot()};
		calis[0].Calis();
		calis[0].Dinlen();
		calis[1].Calis();
		calis[1].Dinlen();

		System.out.println("................");
		Isci deneme = (Isci) calis[0]; //casting iþlemi
		deneme.MolaVer(5);
		
		Object[] calis1 = {new Isci("zzz"), new Robot()};
		Isci isci1 = (Isci) calis[0]; /// deðiþkene alýp casting
		isci1.Calis();
		isci1.Dinlen();
		
		
		((Isci)calis[0]).Dinlen(); // tek satýrda casting
		Isci isci2 = (Isci) calis[0];
		
	}

}
