import java.util.Random;
import java.util.Scanner;
import java.text.DecimalFormat;

public class StoreReceipt {
  public static void main (String[]args) {
    Scanner request = new Scanner(System.in);

    System.out.println("How many books would you like to buy?: ");
    int numBooks = request.nextInt();
    System.out.println("How many movies would you like to buy?: ");
    int numMovies = request.nextInt();
    System.out.println("How many pounnds of peanuts would you like to buy?: ");
    double lbsPeanuts = request.nextDouble();

    DecimalFormat mny = new DecimalFormat("0.00");
    double priceBooks = (double) (numBooks * 9);
    double priceMovies = (double) (numMovies * 13.97);
    double pricePeanuts = (double) (lbsPeanuts * 1.72);
    double priceShipping = (double) (numBooks * 0.95)  + (.04 * (numMovies * 13.97)) + (lbsPeanuts * 0.30);
    double priceTaxes = (double) (0.072 * (priceBooks + priceMovies));
    double totalPrice = (double) (priceBooks + priceMovies + pricePeanuts + priceShipping + priceTaxes);



    System.out.println("");
    System.out.println("¡Steve's S-Mart!");
    System.out.println("<Cashier: Conrad>");
    System.out.println("----------------------------------");
    System.out.println("Time of Order: " );
    System.out.println("**********************************");
    System.out.println("Books:" + numBooks + "             $" + mny.format(priceBooks));
    System.out.println("Movies:" + numMovies + "           $" + mny.format(priceMovies));
    System.out.println("Peanuts:" + lbsPeanuts + "         $" + mny.format(pricePeanuts));
    System.out.println("----------------------------------");
    System.out.println("Shipping:         $" + mny.format(priceShipping));
    System.out.println("Sales Tax (7.2%): $" + mny.format(priceTaxes));
    System.out.println("----------------------------------");
    System.out.println("Total:            $" + mny.format(totalPrice));
    System.out.println("**********************************");
  }
}
