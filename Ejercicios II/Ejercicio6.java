
public class Ejercicio6 {

	public static void main(String[] args) {
		int saq1, saq2;
		saq1 = (int)(Math.random() * 80+1);
		saq2 = (int)(Math.random() * 80+1);
		
		while (saq2 == saq1) {
			saq2 = (int)(Math.random() * 80+1);
		}
		System.out.println(saq1 + ", " + saq2);
	}

}
