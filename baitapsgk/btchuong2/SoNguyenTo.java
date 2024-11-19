package btchuong2;

import java.util.Scanner;

public class SoNguyenTo {
	public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap vao mot so nguyen: ");
        int n = scanner.nextInt();

        if (isPrime(n)) {
            System.out.println(n + " la so nguyen to.");
        } else {
            System.out.println(n + " khong phai so nguyen to.");
        }
    }
}
