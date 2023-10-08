
public class Ikaohjelma {

	public static void main(String[] args) {
		int ika = 16;
		if (ika >= 0 && ika < 18)

		{

		System.out.println("Olet alaikäinen");
		if (ika >= 15) {
			System.out.println("Saat ajaa mopoa");
			
			if (ika > 15 && ika < 18) {
				System.out.println("Saat ajaa kevaria");
			}
		}

		}
		
		else if  (ika >= 65) {
			System.out.println("Olet eläkeläinen");
		}

		else

		{

		System.out.println("Olet aikuinen");

		}

	}

}
