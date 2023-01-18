/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nlakhal
 */
public class Rectangle extends GeometricObject {

    private double width;
    private double hight;

    public Rectangle() {
    }

    public Rectangle(double width, double hight) {
        this.width = width;
        this.hight = hight;
    }

    public Rectangle(double width, double hight, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.hight = hight;
    }

    public double getWidth() {
        return width;
    }

    public double getHight() {
        return hight;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHight(double hight) {
        this.hight = hight;
    }

    @Override
    public double getArea() {
        return hight * width;
    }

    @Override
    public double getPerimeter() {
        return (hight * 2) + (width * 2);

    }

}
