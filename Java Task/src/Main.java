import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
     // object 1
         Bankapplication customer1 = new Bankapplication("John Doe", 1000.0);
         customer1.deposit(500.0);
         customer1.withdraw(200.0);
         customer1.balanceInquiry();
// Using the SimpleInterestCalculator
        InterestCalculator interestCalculator = new SimpleInterestCalculator(0.05);
        double interest = interestCalculator.calculateInterest(customer1.accountBalance);
        System.out.println("Interest earned: " + interest);


    }
    }
