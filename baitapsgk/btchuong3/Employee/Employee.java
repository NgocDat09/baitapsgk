/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee;

import java.util.Scanner;
import java.util.logging.Logger;

/**
 *
 * @author pc
 */
public class Employee extends Person{
    private String dateHired;

    public Employee() {
    }

    public Employee(String dateHired) {
        this.dateHired = dateHired;
    }

    public Employee(String dateHired, String name, int age, char gender) {
        super(name, age, gender);
        this.dateHired = dateHired;
    }

    public String getDateHired() {
        return dateHired;
    }

    public void setDateHired(String dateHired) {
        this.dateHired = dateHired;
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.printf("nhap ngay vao: "); dateHired = sc.nextLine();
    }
    @Override
    public String toString() {
        return  super.toString() + "Employee{" + "dateHired=" + dateHired + '}';
    }
    
    
}
