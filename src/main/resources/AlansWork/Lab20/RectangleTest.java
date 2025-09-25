package Lab20;

// Rectangle Test
public class RectangleTest {
    public  static class Rectangle {
        double height;
        double width;

        public Rectangle() {
            height = 1.0;
            width = 1.0;
        }

        public Rectangle(double h, double w) {
            height = h;
            width = w;
        }

        public double getArea() {
            return height * width;
        }

        public double getPerimeter() {
            return 2 * height + 2 * width;
        }
    }

    public static void main(String[] args) {
        Rectangle rOne = new Rectangle(40, 4);
        Rectangle rTwo = new Rectangle(36, 3.5);
        System.out.println("The first rectangle has a height and width of " + rOne.height + " and " + rOne.width);
        System.out.println("The area of the first rectangle is " + rOne.getArea());
        System.out.println("The perimter of the first rectangle is " + rOne.getPerimeter() + "\n");
        System.out.println("The second rectangle has a height and width of " + rTwo.height + " and " + rTwo.width);
        System.out.println("The area of the second rectangle is " + rTwo.getArea());
        System.out.println("The perimeter of the second rectangle is " + rTwo.getPerimeter());
    }
}
