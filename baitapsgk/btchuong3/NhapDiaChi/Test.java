/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nhapdiachi;

/**
 *
 * @author pc
 */
public class Test {
    public static void main(String[] args) {
        DiaChi address = new DiaChi();
        System.out.println("nhap thong tin");
        address.nhap();
        System.out.printf("thong tin cua dia chi: " + address.toString());
    }
}
