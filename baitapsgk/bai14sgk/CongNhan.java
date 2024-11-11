package bai14sgk;

import java.util.Scanner;

public abstract class CongNhan {
	private String hoTen;
	private String diaChi;
	private LoaiCongNhan loaiCongNhan;
	private String ngaySinh;
	// phuong thuc
	public CongNhan() {
	}

	public CongNhan(String hoTen, String diaChi, LoaiCongNhan loaiCongNhan) {
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.loaiCongNhan = loaiCongNhan;
	}

	public String getHoTen() {
		return hoTen;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public LoaiCongNhan getLoaiCongNhan() {
		return loaiCongNhan;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public void setLoaiCongNhan(LoaiCongNhan loaiCongNhan) {
		this.loaiCongNhan = loaiCongNhan;
	}

	

	public String getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public void nhapThongTin() {
		Scanner sc = new Scanner(System.in);
		System.out.println("moi nhap hoTen: ");
		hoTen = sc.nextLine();
		System.out.println("moi nhap diaChi:");
		diaChi = sc.nextLine();
		System.out.println("moi nhap ngay sinh:");
		ngaySinh = sc.nextLine();
//		int nhap;
		System.out.printf("nhap 1 de tro thanh: CNKSP\nnhap 2 de tro thanh: CNTCN ");
		int nhap = sc.nextInt();
		if (nhap == 1) {
			loaiCongNhan = LoaiCongNhan.CNKSP;
		} else if (nhap == 2) {
			loaiCongNhan = LoaiCongNhan.CNTCN;
		} else {
			System.out.println("m có bị ngu ko");
		}

	}

	public abstract double tinhLuong();
	
	public static void inTieuDe() {
		System.out.printf("%-20s %-20s %-20s %-20s %-20s %n", "HoTen", "DiaChi", "NgaySinh", "Loai Cong Nhan", "Luong Thang");
	}
	public void inThongTin() {
		System.out.printf("%-20s %-20s %-20s %-20s %-20f %n", hoTen, diaChi, ngaySinh, loaiCongNhan, tinhLuong());
	}

}
