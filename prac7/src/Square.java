public class Square extends GeometricObject {
    private double side;

    /** Создает по умолчанию заданный прямоугольник */
    public Square() {
        this.side = 0;
    }

    /** Создает прямоугольник с указанной шириной и высотой */
    public Square(double side) {
        this.side = side;
    }

    /** Создает прямоугольник с указанной шириной, высотой, цветом и заливкой */
    public Square(double side, String color, boolean filled) {
        this.side = side;
        setColor(color);
        setFilled(filled);
    }

    public double getWall() {
        return side;
    }


    public void setWall(double side) {
        this.side = side;
    }

    /** Возвращает площадь */
    public double getArea() {
        return side * side;
    }

    /** Возвращает периметр */
    public double getPerimeter() {
        return 4 * this.side;
    }
}