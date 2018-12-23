package faydin.obj;

public class Arac {
	
	private int tekerlekSayisi;
	private String surucuAdi;
	private boolean koltuk;
	
	public Arac() {
		// TODO Auto-generated constructor stub
		
	}
	
	public Arac(int tekerlekSayisi) {
		//ayný adlý iki methotta farklý iki yöntem ile instance, object üretme iþlemi yapýlabilir.
		
		this.tekerlekSayisi = tekerlekSayisi;
		
	}
	
	
	/************ SETTER - GETTER ******************/
	public void setTekerlekSayisi(int tekerlekSayisi) {
		this.tekerlekSayisi = tekerlekSayisi; // yukardaki deðiþkeni ifade etmek için kullanýlýr this. this olmasaydý fonksiyondan gelen kullanýlmýþ olurdu.
			
	}
	
	public int getTekerlekSayisi() {
		return this.tekerlekSayisi;
		//return tekerlekSayisi;  // this yazýlsa da olur yazýlmasa da olur
		
	}
	
	public void setSurucuAdi(String surucuAdi) {
		this.surucuAdi = surucuAdi;
	}
	
	public String getSurucuAdi() {
		return surucuAdi;
	}
	
	public void setKoltuk(boolean koltuk) {
		
		this.koltuk = koltuk;
	}
	
	public boolean getKoltuk() {
		
		return koltuk;
	}


	
}
