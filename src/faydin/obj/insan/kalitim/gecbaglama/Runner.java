package faydin.obj.insan.kalitim.gecbaglama;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arac[] araclar = { new Araba(), new Motorsiklet() };
		
		for(Arac arac : araclar) {
			arac.Calis(); // late binding 
			arac.YakitiAl();
			System.out.println("----------");
			
		}
		
	}

}
