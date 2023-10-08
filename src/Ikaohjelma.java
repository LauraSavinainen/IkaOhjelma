
public class Ikaohjelma {

	public static void main(String[] args) {
		int ika = 50;

		if (ika >= 0 && ika < 18) {
			System.out.println("Olet alaikäinen");
			if (ika >= 15) {
				System.out.println("Saat ajaa mopoa");
				
				if (ika > 15 && ika < 18) {
					System.out.println("Saat ajaa kevaria");
				}
			}
			
		}
		else if(ika == 18) {
			System.out.println("Olet juuri tullut täysi-ikäiseksi ja saat ajaa autoa");
		}
		
		else if(ika == 20 || ika == 30 || ika == 40 || ika == 50 || ika == 60 || ika == 70 || ika == 80 || ika == 90) {
			System.out.println("Onnea pyöreistä vuosista!");
		}
		else if(ika == 100) {
			System.out.println("Onnea!");
			System.out.println("Onnea!");
			System.out.println("Onnea!");
		}
		else if(ika >= 65)
		{
			System.out.println("Olet eläkeläinen");
		}

		else {
			System.out.println("Olet aikuinen");
		}
		

	}

}
