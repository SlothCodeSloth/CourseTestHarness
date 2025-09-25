package Lab21;

public class Lab21a {
    public static class RegularPolygon {
        private int n;
        private double side;
        private double x;
        private double y;

        public RegularPolygon() {
            n = 3;
            side = 1;
            x = 0;
            y = 0;
        }

        public RegularPolygon(int sides, double sideLength) {
            this();
            n = sides;
            side = sideLength;
        }

        public RegularPolygon(int sides, double sideLength, double xCenter, double yCenter) {
            this(sides, sideLength);
            x = xCenter;
            y = yCenter;
        }

        //Accessors
        public int getNumberOfSides() {
            return n;
        }

        public double getSideLength() {
            return side;
        }

        public double getXCenter() {
            return x;
        }

        public double getYCenter() {
            return y;
        }

        public double getPerimeter() {
            return Math.round(n * side);
        }

        public double getArea() {
            return (n * Math.pow(side, 2) / (4 * Math.tan(Math.PI / n)));
        }

        //Mutators
        public void setNumberOfSides(int numberOfSides) {
            n = numberOfSides;
        }

        public void setSideLength(double sideLength) {
            side = sideLength;
        }

        public void setXCenter(double xCenter) {
            x = xCenter;
        }

        public void setYCenter(double yCenter) {
            y = yCenter;
        }
    }

    public static void main(String[] args) {
        RegularPolygon polygon1 = new RegularPolygon();
        RegularPolygon polygon2 = new RegularPolygon(6, 4);
        RegularPolygon polygon3 = new RegularPolygon(10, 4, 5.6, 7.8);

        System.out.printf("Perimeter of 1st Object: %.3f\nArea of the 1st Object: %.3f\n", polygon1.getPerimeter(), polygon1.getArea());
        System.out.printf("Perimeter of 2nd Object: %.3f\nArea of the 2nd Object: %.3f\n", polygon2.getPerimeter(), polygon2.getArea());
        System.out.printf("Perimeter of 3rd Object: %.3f\nArea of the 3rd Object: %.3f\n", polygon3.getPerimeter(), polygon3.getArea());
    }
}

