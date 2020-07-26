public class Rectangle {
    private Point leftUpperCorner;
    private Point rightLowerCorner;

    public Rectangle(Point leftUpperCorner, Point rightLowerCorner) {
        this.leftUpperCorner = leftUpperCorner;
        this.rightLowerCorner = rightLowerCorner;
    }

    public double getDiagonal() {
        return (Math.sqrt(Math.pow((leftUpperCorner.getX() - rightLowerCorner.getX()), 2)
                + Math.pow((leftUpperCorner.getY() - rightLowerCorner.getY()), 2)));
    }

    public int getArea() {
        return ((rightLowerCorner.getX() - leftUpperCorner.getX())
                * (leftUpperCorner.getY() - rightLowerCorner.getY()));
    }
}
