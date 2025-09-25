package Lab22;

public class Lab22c {
    public static class Rectangle {
        private double w;
        private double h;

        public Rectangle() {
            w = 1;
            h = 1;
        }

        Rectangle(double w, double h) {
            this.w = w;
            this.h = h;
        }

        public double getWidth() {
            return w;
        }

        public double getHeight() {
            return h;
        }

        public double getPerimeter() {
            return 2.0*(w + h);
        }

        public double getArea() {
            return w*h;
        }
    }

    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(4, 40);
        System.out.printf("The area of a 4.0 x 40.0 Rectangle is %.1f \n", rect1.getArea());
        System.out.printf("The perimeter of a 4.0 x 40.0 Rectangle is %.1f \n", rect1.getPerimeter());
        Rectangle rect2 = new Rectangle(3.5, 35.9);
        System.out.printf("The area of a 3.5 x 35.9.0 Rectangle is %.1f \n", rect2.getArea());
        System.out.printf("The perimeter of a 3.5 x 35.9.0 Rectangle is %.1f \n", rect2.getPerimeter());
    }
}
