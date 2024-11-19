package btchuong2;

import java.util.Scanner;

public class TinhDoF {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Nhap vao nhiet do C: ");
		double celsius = scanner.nextDouble();

		double fahrenheit = celsius * 1.8 + 32;
		System.out.println("Nhiet do F la: " + fahrenheit);
	}
}
