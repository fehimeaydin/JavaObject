package faydin.obj.arac;

public class Arac {
	
	private int tekerlekSayisi;
	private String surucuAdi;
	private boolean koltuk;
	
	public Arac() {
		// TODO Auto-generated constructor stub
		
	}
	
	public Arac(int tekerlekSayisi) {
		//ayn� adl� iki methotta farkl� iki y�ntem ile instance, object �retme i�lemi yap�labilir.
		
		this.tekerlekSayisi = tekerlekSayisi;
		
	}
	
	
	/************ SETTER - GETTER ******************/
	public void setTekerlekSayisi(int tekerlekSayisi) {
		this.tekerlekSayisi = tekerlekSayisi; // yukardaki de�i�keni ifade etmek i�in kullan�l�r this. this olmasayd� fonksiyondan gelen kullan�lm�� olurdu.
			
	}
	
	public int getTekerlekSayisi() {
		return this.tekerlekSayisi;
		//return tekerlekSayisi;  // this yaz�lsa da olur yaz�lmasa da olur
		
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
