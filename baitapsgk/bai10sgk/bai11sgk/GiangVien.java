package bai11sgk;

import java.util.Scanner;

public abstract class GiangVien {
	private String hoTen;
	private String diaChi;
	private LoaiGiangVien loaiGiangVien;
	public GiangVien() {

	}
	public GiangVien(String hoTen, String diaChi, LoaiGiangVien loaiGiangVien) {
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.loaiGiangVien = loaiGiangVien;
	} 
	
	public void nhapThongTin() {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap hoTen");
		hoTen = sc.nextLine();
		System.out.println("nhap diaChi");
		diaChi = sc.nextLine();
		System.out.println("nhap 1 de chon giảng viên cơ hữu\nnhap 2 de chon giảng viên thỉnh giảng");
		int nhan;
		do {
			nhan = sc.nextInt();
			if(nhan<1 || nhan>2)
				System.out.println("nhập lại đi con mẹ mày");
		}while (nhan <1 || nhan >2);
		
		if(nhan ==1 ) {
			loaiGiangVien = LoaiGiangVien.giangviencohuu;
		}else {
			loaiGiangVien = LoaiGiangVien.giangvienthinhgiang;
		}
		
	}
	public abstract double tinhLuong(); 
	
	public static void nhapTD() {
		System.out.printf("%-20s %-20s %-20s %-20s %n", "Họ Tên", "Địa Chỉ", "Loại Giảng Viên", "Lương Tháng");
	}
	public void inTT() {
		System.out.printf("%-20s %-20s %-20s %-20f %n", hoTen, diaChi, loaiGiangVien, tinhLuong());
	}
}
