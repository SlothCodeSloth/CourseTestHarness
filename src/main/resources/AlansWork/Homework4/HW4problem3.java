package Homework4;

public class HW4problem3 {
    public static class Circle2D {
        private double x;
        private double y;
        private double radius;

        public Circle2D() {
            x = 0;
            y = 0;
            radius = 1;
        }

        public Circle2D(double xCoord, double yCoord, double r) {
            x = xCoord;
            y = yCoord;
            radius = r;
        }

        public double getX() {
            return x;
        }

        public double getY() {
            return y;
        }

        public double getRadius() {
            return radius;
        }

        public double getArea() {
            return Math.PI * Math.pow(radius, 2);
        }

        public double getPerimeter() {
            return 2 * Math.PI * radius;
        }

        public boolean contains(double pointX, double pointY) {
            if (Math.sqrt(Math.pow(x - pointX, 2) + Math.pow(y - pointY, 2)) <= radius) {
                return true;
            }
            else {
                return false;
            }
        }

        public boolean contains(Circle2D circle) {
            if (Math.sqrt(Math.pow(x - circle.getX(), 2) + Math.pow(y - circle.getY(), 2)) <= radius - circle.getRadius()) {
                return true;
            }
            else {
                return false;
            }
        }
        
        public boolean overlaps(Circle2D circle) {
            if (Math.sqrt(Math.pow(x - circle.getX(), 2) + Math.pow(y - circle.getY(), 2)) > radius + circle.getRadius()) {
                return true;
            }
            else {
                return false;
            }
        }
    }

    public static void main(String[] args) {
        Circle2D c1 = new Circle2D(2, 2, 5.5);
        System.out.println("The area of the first circle is " + c1.getArea());
        System.out.println("The perimeter of the first circle is " + c1.getPerimeter());
        System.out.println("Does the circle contain the point (3, 3)? " + c1.contains(3, 3));
        System.out.println("Does the circle contain Circle 2? " + c1.contains(new Circle2D(4, 5, 10.5)));
        System.out.println("Does the circle overlap with Circle 3? " + c1.overlaps(new Circle2D(3, 5, 2.5)));
    }
}
