import java.util.Random;

public class Phone {
  public static void main (String [] args) {
    Random Random = new Random();

    int one = (int) (Random.nextInt(8) + 2);
    int two = (int) Random.nextInt(9);
    int three = (int) Random.nextInt(10);
    int four = (int) (Random.nextInt(8) + 2);
    int five = (int) Random.nextInt(10);
    int six = (int) Random.nextInt(10);
    int seven = (int) Random.nextInt(10);
    int eight = (int) Random.nextInt(10);
    int nine = (int) Random.nextInt(10);
    int ten = (int) Random.nextInt(10);

    System.out.print("Random Phone Number: (" + one + two + three + ")" );
    System.out.print(four + "" + five + "" + six + "-" + seven + eight + nine + ten);
  }

}
