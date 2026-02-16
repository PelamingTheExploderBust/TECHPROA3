public class Seatwork4P2 {

    // Calculate area of a square (int side length)
    public int calculateArea(int side) {
        return side * side;
    }

    // Calculate area of a rectangle (double length and width)
    public double calculateArea(double length, double width) {
        return length * width;
    }

    public static void main(String[] args) {
        Seatwork4P2 calc = new Seatwork4P2();

        System.out.println("Square area: " + calc.calculateArea(5));
        System.out.println("Rectangle area: " + calc.calculateArea(4.5, 7.2));

        System.out.println("Seatwork 4 part 2. 2nd sem");
    }
}
