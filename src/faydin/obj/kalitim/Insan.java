package faydin.obj.kalitim;

public class Insan {
	
	public String adi;
	public String soyadi;
	public String tcKNo;
	private String gozRengi;
	protected String dna;

	@Override
	public String toString() {
		return "Adi: " + adi + "Soyadi: " + soyadi + "TC: " + tcKNo ;
	}
}
