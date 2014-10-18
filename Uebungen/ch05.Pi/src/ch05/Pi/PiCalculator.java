package ch05.Pi;

public class PiCalculator {
	public static void approximiere_pi(double tropfenzahl) {
		  double pi = 0;
		  double innerhalb = 0;
		  double gesamt = tropfenzahl;
		  double diff = 0;
		  int len = 2;
		  
		 
		  while (gesamt > 0) { // generiere Tropfen und addiere je nach Zugehörigkeit
		    double dotx = Math.random();
		    double doty = Math.random();
		 
		    if (dotx*dotx + doty*doty <= 1) {
		      // Punkt liegt innerhalb des Kreises
		      innerhalb++;
		      pi = 4*(double)innerhalb/tropfenzahl;
		      diff = Math.abs(Math.PI-pi);
		      if ( Double.toString(diff).length() > len) {
		    	  len++;
		    	  System.out.println(diff);
		      }
		    } else {
		      // Punkt liegt außerhalb des Kreises
		    }
		 
		    gesamt--;
		  }
		  pi = 4*(double)innerhalb/tropfenzahl;
		  System.out.println(pi);
		  
		  //return pi;
		}
}
