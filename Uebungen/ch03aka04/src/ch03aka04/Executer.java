package ch03aka04;

public class Executer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Class Month
		//Month m1 = new Month(8);
		//System.out.println(m1.getName());
		
		//Class ConvMetricImperial
		double xininch = 35.85f;
		double xinyard = ConvMetricImperial.inch2yard(xininch);
		double xinm = ConvMetricImperial.yard2m(xinyard);
		double xinmm = ConvMetricImperial.m2mm(xinm);
		System.out.println(xinmm);
		System.out.println(ConvMetricImperial.m2mm(ConvMetricImperial.yard2m(ConvMetricImperial.inch2yard(35.85f))));
	}

}
