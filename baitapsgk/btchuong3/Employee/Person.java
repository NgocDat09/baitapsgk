/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class Person {
    private String name;
    private int age;
    private char gender;

    public Person() {
    }

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", age=" + age + ", gender=" + gender + '}';
    }
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.printf("nhap ten: "); name = sc.nextLine();
        System.out.println("nhap tuoi: "); age = sc.nextInt();
        System.out.println("nhap gioi tinh: "); gender = sc.next().charAt(0);
    }
    
}
