import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter annual interest rate, example 8,25%: ");
        double annualInterestRate = scan.nextDouble();

        System.out.println("Enter number of years as integer, example 5 :");
        int numberOfYears = scan.nextInt();

        System.out.println("Enter loan amount: ");
        double loanAmount = scan.nextDouble();

        Loan loan = new Loan(annualInterestRate,numberOfYears,loanAmount);

        System.out.printf("The loan was created on %s\n"+ "The monthly payment is %.2f\nThe total payment is %2f\n", loan.getLoanDate(),loan.getMonthlyPayment(),loan.getTotalPayment());






    }
}
