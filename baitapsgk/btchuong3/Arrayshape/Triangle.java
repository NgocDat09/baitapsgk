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
public class Triangle extends Shape{
    protected int base;
    protected int height;

    public Triangle() {
        super();
    }

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    public Triangle(int base, int height, String color) {
        super(color);
        this.base = base;
        this.height = height;
    }
    public void nhap(){
        Scanner sc =new Scanner(System.in);
        super.nhap();
        System.out.printf("nhap canh day: ");
        base = sc.nextInt();
        System.out.printf("nhap chieu cao: ");
        height = sc.nextInt();
    }

    @Override
    public double getArea() {
        return 0.5 * base * height;
    }

    @Override
    public String toString() {
        return "Triangle{"+super.toString() + "base=" + base + ", height=" + height + " ,area=" + getArea() + '}';
    }
    
}
