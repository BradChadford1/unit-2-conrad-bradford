public class Geometry {
    public static void main (String[]args) {
        int sides = 7;
        int radius = 5;
        final double PI = 22/7;
        System.out.println("A heptagon has " + sides + " sides.");
        sides = sides + 3;
        System.out.println("A decagon has " + sides + " sides.");
        sides = sides + 2;
        System.out.println("A dodecagon has " + sides + " sides.");
        double circumference = 2 * PI * radius;
        System.out.println("The circumference of a circle with a radius of ");
        System.out.print(radius + " is " + circumference);
    }
}
