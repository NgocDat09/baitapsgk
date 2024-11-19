/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package circle;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class Circle implements GeometricObject{
    protected double radius = 1.0;

    public Circle() {
    }
    public Circle(double radius){
        this.radius = radius;
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.printf("nhap ban kinh: "); radius = sc.nextDouble();
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
    
}
