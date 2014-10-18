package ch03aka04;

public class Month {
	private int monthnr;
	public static final String[] months = new String[] {"January","February","March","April","Mai","June","July","August","September","Octobre","Novembre","Decembre"};
	
	/**
	 * Create a Object with the month number as a parameter
	 * @param monthnumber
	 */
	public Month(int monthnumber){
		this.monthnr=monthnumber;
	}
	
	public String getName(){
		return months[monthnr-1];
	}
}
