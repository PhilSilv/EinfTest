package ch05.Pi;

import java.util.Calendar;

import javax.swing.JFrame;

public class Frame {
	
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
    	long start = cal.getTimeInMillis();
    	
		//PiCalculator.approximiere_pi(100000000);
    	PiCalculator2.pi(10000000);
    	
    	cal = Calendar.getInstance();
		System.out.print(cal.getTimeInMillis()-start+" Milliseconds");
		
		/*
		JFrame frame = new JFrame();
		
		frame.setSize(300, 400);
		frame.setTitle("AViewer");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		Component component1 = new Component();
		frame.add(component1);
		*/
	}

}
