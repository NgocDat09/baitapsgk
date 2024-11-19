package btchuong2;

import java.util.Scanner;

public class TongGiay {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Nhap vao so gio: ");
		int hours = scanner.nextInt();

		System.out.print("Nhap vao so phut: ");
		int minutes = scanner.nextInt();

		System.out.print("Nhap vao so giay: ");
		int seconds = scanner.nextInt();

		int totalSeconds = hours * 3600 + minutes * 60 + seconds;

		System.out.println("Tong so giay la: " + totalSeconds);
	}
}
