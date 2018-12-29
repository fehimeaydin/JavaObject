package faydin.obj.insan.kalitim.arayuz;

public class Isci implements Calisabilir, Insan {
	//Multiple implementation yap�m�

	private String isciAdi;
	
	public Isci(String isciAdi) {
		this.isciAdi = isciAdi;
	}
	@Override
	public void Calis() {
		System.out.println(isciAdi + " ���i �al���yor...");
	}

	@Override
	public void Dinlen() {
		System.out.println(isciAdi +" ���i dinleniyor...");
		
	}

	@Override
	public void YemekYe() {
		System.out.println(isciAdi +" ���i yemek yiyor...");
		
	}

	@Override
	public void MolaVer(int zaman) {
		System.out.println(isciAdi +" ���i " +zaman+ " dakikal�k molada...");
		
	}

}
