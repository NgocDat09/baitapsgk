package btchuong2;

import java.util.Scanner;

public class HinhTron {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Nhap ban kinh hinh tron: ");
	        double banKinh = scanner.nextDouble();
	        
	        double dienTich = Math.PI * banKinh * banKinh;
	        double chuVi = 2 * Math.PI * banKinh;
	        
	        System.out.println("Dien tich hinh tron: " + dienTich);
	        System.out.println("Chu vi hinh tron: " + chuVi);
	        
	        scanner.close();
	    }
}
