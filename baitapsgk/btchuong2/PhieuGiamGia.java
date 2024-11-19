package btchuong2;

import java.util.Scanner;

public class PhieuGiamGia {
	   public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Nhap vao gia ban: ");
	        double giaBan = scanner.nextDouble();
	        System.out.print("Nhap vao phan tram giam gia: ");
	        double phanTramGiam = scanner.nextDouble();

	        double giaSauGiam = giaBan - (giaBan * phanTramGiam / 100);
	        System.out.println("Gia sau khi giam gia la: " + giaSauGiam);
	    }
}
