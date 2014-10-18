package ch03aka04;

public class ConvMetricImperial {
	
	//imperial units
	static public double inch2yard(double inch){
		return inch/3/12;
	}
	
	static public double foot2yard(double foot){
		return foot/3;
	}
	
	static public double mile2yard(double mile){
		return mile*10*22;
	}
	
	//inversed
	static public double yard2inch(double yard){
		return yard*3*12;
	}
	
	static public double yard2foot(double yard){
		return yard*3;
	}
	
	static public double yard2mile(double yard){
		return yard/10/22;
	}
	
	
	//metric units
	static public double mm2m(double mm){
		return 1000*mm;
	}
	
	static public double cm2m(double cm){
		return 100*cm;
	}
	
	static public double km2m(double km){
		return 0.001*km;
	}
	
	//reversed
	static public double m2mm(double m){
		return m/1000;
	}
	
	static public double m2cm(double m){
		return m/100;
	}
	
	static public double m2km(double m){
		return m*1000;
	}
	
	
	//imperial yard to metric meter
	static public double yard2m(double yard){
		return yard*0.9144;
	}
	
	
	//metric meter to imperial yard
	static public double m2yard(double m){
		return m*1.0936;
	}
}
