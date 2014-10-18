/**
 * A class representing a bank account
 * @author Muryoutaisuu
 *
 */
public class BankAccount {
	
	// Variables
	
	
	/**
	 * the holy balance value of the bank account
	 */
  private double _balance;
  
  /**
   * The name of the customer. Should be a whole new object.
   */
  private String customerName;
  private int accountNr;
  
  
  // Constructor
  
  
  /**
   * Constructor with customer name
   * @param aCustomerName
   */
  public BankAccount(String aCustomerName){
	  _balance = 0;
	  customerName = aCustomerName;
  }
  
  /**
   * Constructor with customer name and initial balance value
   * @param aCustomerName
   * @param initialBalance
   */
  public BankAccount(String aCustomerName, double initialBalance){
	  _balance = initialBalance;
	  customerName = aCustomerName;
  }
  
  
  // Manipulate balance
  
  /**
   * Deposit a value on bank account
   * @param depositValue
   */
  public void deposit(double depositValue){
	  _balance += depositValue;
  }
  
  /**
   * Withdraw a value from bank account
   * @param withdrawValue
   */
  public void withdraw(double withdrawValue){
	  _balance -= withdrawValue;
  }
  
  
  // GET
  
  /**
   * Gets current balance from bank account
   * @return
   */
  public double getBalance(){
	  return _balance;
  }
  
}
