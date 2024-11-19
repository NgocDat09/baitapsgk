/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee;

/**
 *
 * @author pc
 */
public class Test {
    public static void main(String[] args) {
        PartTimeEmployee pte = new PartTimeEmployee();
        System.out.println("nhap thong tin");
        pte.nhap();
        pte.setName("AAA");
        System.out.println("ten la: " + pte.getName());
        pte.setAge(19);
        System.out.println("tuoi la: "+ pte.getAge());
        
        System.out.println("thong tin la: " + pte.toString());
    }
}
