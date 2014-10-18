
public class BankAccountTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount ba1 = new BankAccount("Hans Ueli");
		BankAccount ba2 = new BankAccount("Fritz Peter", 10000);
		
		System.out.println("BankAccount ba1=" + ba1.getBalance());
		System.out.println("BackAccoutn ba2=" + ba2.getBalance());
		
		ba1.deposit(5000);
		ba2.deposit(1);
		
		if ( ba1.getBalance() == 5000 ){
			System.out.println("ok");
		}else{
			System.out.println("nok");
		}
		
		if ( ba2.getBalance() == 10001 ){
			System.out.println("ok");
		}else{
			System.out.println("nok");
		}
		
	}

}
