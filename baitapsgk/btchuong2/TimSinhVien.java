package btchuong2;

import java.util.Scanner;

public class TimSinhVien {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Nhap so luong sinh vien: ");
		int n = scanner.nextInt();
		int[] diem = new int[n];

		System.out.println("Nhap diem tung sinh vien" + ":");
		for (int i = 0; i < n; i++) {
			System.out.print("diem cua sinh vien " + (i + 1) + ": ");
			diem[i] = scanner.nextInt();
		}

		System.out.print("Nhap diem can tim: ");
		int diemCanTim = scanner.nextInt();
		boolean found = false;

		System.out.println("Sinh vien co diem bang " + diemCanTim + " la:");
		for (int i = 0; i < n; i++) {
			if (diem[i] == diemCanTim) {
				System.out.println("Sinh vien " + (i + 1) + " co diem: " + diem[i]);
				found = true;
			}
		}

		if (!found) {
			System.out.println("Khong co sinh vien nao co diem bang " + diemCanTim);
		}
	}
}
