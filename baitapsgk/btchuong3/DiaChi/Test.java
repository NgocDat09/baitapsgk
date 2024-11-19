/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diachi;

/**
 *
 * @author pc
 */
public class Test {
    public static void main(String[] args) {
        NhanVien nhanvien = new NhanVien();
        System.out.println("nhap thong tin");
        nhanvien.nhap();
        
        System.out.println("thong tin cua nhan vien la: " + nhanvien.toString());
    }
}
