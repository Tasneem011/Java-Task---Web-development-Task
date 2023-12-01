// an interface forcalculation
interface InterestCalculator {
    double calculateInterest(double balance);
}
// Sub class implementing the InterestCalculator interface
class SimpleInterestCalculator implements InterestCalculator {
    private double rate;

    public SimpleInterestCalculator(double rate) {
        this.rate = rate;
    }

    @Override
    public double calculateInterest(double balance) {
        return balance * rate;
    }
}



public class Bankapplication {
    // data members of customer information;
   private String fullname;
   public double accountBalance;
   // constructor
    public Bankapplication(String fn , double ab)
    {
        fullname = fn;
        accountBalance = ab;
    }
    //methods
     public void deposit(double amount){
         accountBalance += amount;
         System.out.println("Deposited: " + amount);

     }
     //method for with draw
    public void withdraw(double amount) {
        if (amount <= accountBalance) {
            accountBalance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient funds");
        }
    }
//method for balance inquiry
    public void balanceInquiry() {
        System.out.println("Account Balance: " + accountBalance);
    }





}
