package btchuong2;

import java.util.Scanner;

public class TimHaiSo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Nhap so nguyen thu nhat: ");
		int a = scanner.nextInt();

		System.out.print("Nhap so nguyen thu hai: ");
		int b = scanner.nextInt();

		System.out.print("Tong: ");
		System.out.println(a + b);

		System.out.print("Hieu: ");
		System.out.println(a - b);

		System.out.print("Tich: ");
		System.out.println(a * b);

		System.out.print("Thuong: ");
		if (b != 0) {
			System.out.println((double) a / b);
		} else {
			System.out.println("Khong the chia cho 0");
		}

		scanner.close();
	}
}
