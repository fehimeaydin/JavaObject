package faydin.obj.insan.kalitim.arayuz;

public class Isci implements Calisabilir, Insan {
	//Multiple implementation yapýmý

	private String isciAdi;
	
	public Isci(String isciAdi) {
		this.isciAdi = isciAdi;
	}
	@Override
	public void Calis() {
		System.out.println(isciAdi + " Ýþçi çalýþýyor...");
	}

	@Override
	public void Dinlen() {
		System.out.println(isciAdi +" Ýþçi dinleniyor...");
		
	}

	@Override
	public void YemekYe() {
		System.out.println(isciAdi +" Ýþçi yemek yiyor...");
		
	}

	@Override
	public void MolaVer(int zaman) {
		System.out.println(isciAdi +" Ýþçi " +zaman+ " dakikalýk molada...");
		
	}

}
