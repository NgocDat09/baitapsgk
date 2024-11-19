package btchuong2;

import java.util.Scanner;

public class GiaiThua {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("nhap vao mot so nguyen: ");
        int n = scanner.nextInt();

        long giaiThua = 1;
        for (int i = 1; i <= n; i++) {
            giaiThua *= i;
        }

        System.out.println("giai thua cua n " + n + " la: " + giaiThua);
    } 
}
