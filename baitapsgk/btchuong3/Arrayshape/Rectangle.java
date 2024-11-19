/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrayshape;

import java.util.Scanner;

/**
 *
 * @author pc
*/
public class Rectangle extends Shape{
    protected int length;
    protected int width;

    public Rectangle() {
        super();
    }

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle(int length, int width, String color) {
        super(color);
        this.length = length;
        this.width = width;
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.printf("nhap chieu dai: "); length = sc.nextInt();
        System.out.printf("nhap chieu rong: "); width = sc.nextInt();
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public String toString() {
        return "Rectangle{"+super.toString() + "length=" + length + ", width=" + width + " ,area=" + getArea ()+'}';
    }
    
}