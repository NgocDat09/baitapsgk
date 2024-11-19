package btchuong2;

import java.util.Scanner;

public class TienDien {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    System.out.print("Nhap vao tong thu nhap: ");
    double tongThuNhap = scanner.nextDouble();

    double thue = 0;
    if (tongThuNhap <= 5000000) {
        thue = tongThuNhap * 0.05;
    } else if (tongThuNhap <= 10000000) {
        thue = tongThuNhap * 0.1;
    } else if (tongThuNhap <= 18000000) {
        thue = tongThuNhap * 0.15;
    } else {
        thue = tongThuNhap * 0.2;
    }

    System.out.println("Thue phai dong: " + thue);
}
}
