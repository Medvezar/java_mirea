public class Triangle extends GeometricObject{
    private double side1;
    private double side2;
    private double side3;
    private boolean filled;
    private String color;

    public Triangle() {
        this.side1 = 1;
        this.side2 = 1;
        this.side3 = 1;
        this.filled = true;
        this.color = "White";
    }

    public Triangle(double side1, double side2, double side3, boolean filled) throws IllegalTriangleException{
        if (side1 + side2 <= side3 || side2 + side3 <= side1 || side1 + side3 <= side2) {
            throw new IllegalTriangleException("Cтороны не удовлетворяют правилу треугольника.");
        }
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.filled = filled;
        this.color = "Orange";
    }


    public double getArea(){
        double p = (this.side1 + this.side2 + this.side3) / 2;
        return Math.sqrt(p * (p - this.side1) * (p - this.side2) * (p - this.side3));
    }


    public double getPerimeter(){
        return this.side1 + this.side2 + this.side3;
    }

    
    public String toString(){
        return  "Стороны треугольника: "+ this.side1 + " " + this.side2 + " " + this.side3 + "\nПлощадь: " + getArea() + "\nПериметер: " + getPerimeter() + "\nЦвет: " + this.color + "\nЗаливка: " + this.filled;
    }


    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
