  public class Tester {

  public static void main(String[] args) {

    CreditCard card2 = new CreditCard("Mehmet Turhan", "Chase", "1234 4567 9876 4567", 500,0); // creates new card2
    CreditCard.printSummary(card2);
    System.out.println("Setting card2’s credit limit to 1000...");                                                       // prints the sunmmary of card2
    card2.CardLimit(1000);
    System.out.println("Changing card2’s card holder name to Akif Turhan...");                                                          // sets the card limit to 1000
    card2.CustomerName("Akif Turhan");
    System.out.println("Charging 300 dollars on card2...");                                                  // Changes card2’s card holder name.
    card2.charge(300);
    System.out.println("Paying 100 dollars to card2...");                                                              // Charges 300 dollars on card2.
    card2.makePayment(100);
    System.out.println("Applying a 20 percent interest on card2...");                                                                // Makes a payment of 100 dollars to card2.
    card2.applyInterest(.2);
    System.out.println("Charging 800 dollars on card2...");                                                          //Applies a 20% interest on card2’s balance.
    /**Charges 800 dollars on card2.
    *also, it prints an error message if it attempts to charge
    *beyond the credit limit.
    */
    if (card2.charge(800)==false)
    System.out.print("Unable to charge: over the credit limit...");

    CreditCard.printSummary(card2);                                                       // prints the sunmmary of card2


  }

}
