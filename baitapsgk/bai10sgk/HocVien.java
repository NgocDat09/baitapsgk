package bai10sgk;

import java.util.Scanner;

public abstract class HocVien {
	private String hoTen;
	private String diaChi;
	private String loaiChuongTrinh;
	
	
	public HocVien() {
	}
	
	public HocVien(String hoTen, String diaChi, String loaiChuongTrinh) {
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.loaiChuongTrinh = loaiChuongTrinh;
	}

	public String getHoTen() {
		return hoTen;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public String getLoaiChuongTrinh() {
		return loaiChuongTrinh;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public void setLoaiChuongTrinh(String loaiChuongTrinh) {
		this.loaiChuongTrinh = loaiChuongTrinh;
	}
	int uuTien;
	public void nhapThongTin() {
		Scanner sc = new Scanner(System.in);
		System.out.println("moi nhap ho ten:");
		hoTen = sc.nextLine();
		System.out.println("moi nhap dia chi:");
		diaChi = sc.nextLine();
		System.out.println("moi nhap loai ưu tiên 1 or 2 thoi:");
		do {
			uuTien = sc.nextInt();
			if(uuTien<1 || uuTien >2) {
				System.out.println("nhap lai di ");
				uuTien = sc.nextInt();
			}
		}while(uuTien<1 || uuTien >2);
		
		System.out.println("moi nhap loai chuong trinh:");
		loaiChuongTrinh = new Scanner(System.in).nextLine();
		
	}
	
	public abstract double hocPhi(); 
	public static void inTieuDe() {
		System.out.printf("%-20s %-20s %-20s %-20s %-20s %n", "HoTen", "DiaChi","Loại Ưu Tiên", "Loai Chương Trình", "Học Phí");
	}
	public void inThongTin() {
		System.out.printf("%-20s %-20s %-20d %-20s %-20f %n", hoTen, diaChi, uuTien, loaiChuongTrinh, hocPhi());
	}
	
}
