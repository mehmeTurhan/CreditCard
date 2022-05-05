/**
 * A simple model for a consumer credit card.
 * @author Mehmet Turhan
 */
public class CreditCard {
  // Instance variables:
  private String customer;      // name of the customer (e.g., "John Bowman")
  private String bank;          // name of the bank (e.g., "California Savings")
  private String account;       // account identifier (e.g., "5391 0375 9387 5309")
  private int limit;            // credit limit (measured in dollars)
  protected double balance;     // current balance (measured in dollars)
  private double interestRate;  // amount of the interest rate (for example 10% interest)


  // Constructors:
  /**
   * Constructs a new credit card instance.
   * @param cust        the name of the customer (e.g., "John Bowman")
   * @param bk          the name of the bank (e.g., "California Savings")
   * @param acnt        the account identifier (e.g., "5391 0375 9387 5309")
   * @param lim         the credit limit (measured in dollars)
   * @param initialBal  the initial balance (measured in dollars)
   */
  public CreditCard(String cust, String bk, String acnt, int lim, double initialBal) {
    customer = cust;
    bank = bk;
    account = acnt;
    limit = lim;
    balance = initialBal;
  }

  /**
   * Constructs a new credit card instance with default balance of zero.
   * @param cust    the name of the customer (e.g., "John Bowman")
   * @param bk      the name of the bank (e.g., "California Savings")
   * @param acnt    the account identifier (e.g., "5391 0375 9387 5309")
   * @param lim     the credit limit (measured in dollars)

   */
  public CreditCard(String cust, String bk, String acnt, int lim) {
    this(cust, bk, acnt, lim, 0.0);               // use a balance of zero as default
  }

  /**
   * Changes customer name
   * @param cstmr     the customer name (for example: Mehmet Turhan)
   */
  public void CustomerName(String customerName) {
    customer = customerName;
  }
  /**
   * changes customer credit card limit
   * @param lmt   card limit (measured in dolars)
   */
  public void CardLimit(int cardLimit) {
    limit = cardLimit;
  }

  /**
   * assigns and interest rate for the double i
   * @param i   interest rate for the card (fors example 10% is i=.1)
   * calculates the balance after tne interest rate is applied
   */

   public void applyInterest(double i){
     interestRate = i;
   	 balance = balance + (balance * interestRate);
   	}

  // Accessor methods:
  /** Returns the name of the customer. */
  public String getCustomer() { return customer; }

  /** Returns the name of the bank */
  public String getBank() { return bank; }

  /** Return the account identifier. */
  public String getAccount() { return account; }

  /** Return the credit limit. */
  public int getLimit() { return limit; }

  /** Return the current balance. */
  public double getBalance() { return balance; }

  // Update methods:
  /**
   * Charges the given price to the card, assuming sufficient credit limit.
   * @param price  the amount to be charged
   * @return true  if charge was accepted; false if charge was denied
   */
  public boolean charge(double price) {               // make a charge
    if (price + balance > limit)                      // if charge would surpass limit
      return false;                                   // refuse the charge
    // at this point, the charge is successful
    balance += price;                                 // update the balance
    return true;                                      // announce the good news
  }

  /**
   * Processes customer payment that reduces balance.
   * @param amount  the amount of payment made
   */
  public void makePayment(double amount) {            // make a payment
    if (amount<0)                                     // creates an if statement and if the amount is in negative, it doesnt do anything to the balance
    balance+=0;
    else
    balance -= amount;                                //if the amount is positive, takes that amount from the balance
      if (balance!=0)
       applyInterest(0.1);                            //if the balance is not paid, adds a 10 percent interest to the balance by calling the applyInterest method.
  }

  /**
   * Utility method to print a card's information
   * @param card  the credit card to print
   */
  public static void printSummary(CreditCard card) {
    System.out.println("Customer = " + card.customer);
    System.out.println("Bank = " + card.bank);
    System.out.println("Account = " + card.account);
    System.out.println("Balance = " + card.balance);  // implicit cast
    System.out.println("Limit = " + card.limit);      // implicit cast
  }

}
