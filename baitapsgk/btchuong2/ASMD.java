package btchuong2;

import java.util.Scanner;

public class ASMD {
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Nhap so thuc thu nhat: ");
	        double x = scanner.nextDouble();
	        
	        System.out.print("Nhap so thuc thu hai: ");
	        double y = scanner.nextDouble();
	        
	        System.out.print("Nhap ky tu phep toan (A: Cong, S: Tru, M: Nhan, D: Chia): ");
	        char kyTu = scanner.next().charAt(0);
	        
	        System.out.print("Ket qua: ");
	        switch (kyTu) {
	            case 'A':
	                System.out.println(x + y);
	                break;
	            case 'S':
	                System.out.println(x - y);
	                break;
	            case 'M':
	                System.out.println(x * y);
	                break;
	            case 'D':
	                if (y != 0) {
	                    System.out.println(x / y);
	                } else {
	                    System.out.println("Khong the chia cho 0");
	                }
	                break;
	            default:
	                System.out.println("Ky tu khong hop le!");
	        }
	        
	        scanner.close();
	    }
}
