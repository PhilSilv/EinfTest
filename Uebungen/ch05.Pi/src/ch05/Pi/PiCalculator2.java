package ch05.Pi;

// http://www.mathematik-wissen.de/kreisberechnung.htm   ganz unten
public class PiCalculator2 {
	public static void pi(double n){
		double flaeche = 0;
		int counter = 1;
		int r = 1;

		while (counter < n) {
			flaeche = flaeche + 4*r/n*Math.sqrt((r*r)-((counter/n)*(counter/n)));
			counter = counter + 1;
		}	

		System.out.println(flaeche);
	}
}
