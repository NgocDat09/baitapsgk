package btchuong2;

import java.util.Scanner;

public class MangDiem {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so sinh vien: ");
        int n = scanner.nextInt();
        int[] diem = new int[n];

        System.out.println("Nhap diem cua tung sinh vien:");
        for (int i = 0; i < n; i++) {
            System.out.print("Điem sinh vien " + (i + 1) + ": ");
            diem[i] = scanner.nextInt();
        }

        System.out.println("Điem cac sinh vien vua nhap la:");
        for (int i = 0; i < n; i++) {
            System.out.print(diem[i] + " ");
        }
    }
}
