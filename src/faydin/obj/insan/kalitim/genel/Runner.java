package faydin.obj.insan.kalitim.genel;
//29.12.2018 static tanýmý

public class Runner {

	public static void main(String[] args) {
		Arac.hiz = 120;
		Arac temp = new Arac();
		
		//temp.hiz = 100;
		temp.model = "2018";
		temp.marka ="BMW";
		
		Arac ford = new Arac();
		ford.model = "2019";
		ford.marka ="FORD";
		
		System.out.println(ford.hiz);
		System.out.println(ford.marka);
		System.out.println(ford.model);
		System.out.println(temp.hiz);
		System.out.println(temp.marka);
		System.out.println(temp.model);
		
		ford.hiz = 50;
		
		System.out.println(ford.hiz +" ---" + temp.hiz);
		
	}

}
