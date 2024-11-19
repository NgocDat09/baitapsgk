/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package person;

/**
 *
 * @author pc
 */
public class Test {
    public static void main(String[] args) {
        Person person = new Person();
        person.nhap();
        person.setName("HIEU");
        System.out.println("thong tin cua nguoi: " + person.toString());
    }
}
