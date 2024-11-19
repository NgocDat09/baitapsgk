package btchuong2;

import java.util.Scanner;

public class Mang {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("nhap so phan tu: ");
	        int n = scanner.nextInt();
	        int[] array = new int[n];

	        System.out.println("nhap cac phan tu:");
	        for (int i = 0; i < n; i++) {
	            System.out.print("Phần tử " + (i + 1) + ": ");
	            array[i] = scanner.nextInt();
	        }

	        System.out.println("Cac phan tu la:");
	        for (int i = 0; i < n; i++) {
	            System.out.print(array[i] + " ");
	        }
	    }
}
