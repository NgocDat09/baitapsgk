package baitap4sgk;

import java.util.Scanner;

public class BenhNhan extends Nguoi {
	private String tienSu;
	private String chanDoan;
	private BenhVien benhVien;

	public BenhNhan() {
	}

	public BenhNhan(String ten, int tuoi, char gioiTinh, String tienSu, String chanDoan, BenhVien benhVien) {
		super(ten, tuoi, gioiTinh);
		this.tienSu = tienSu;
		this.chanDoan = chanDoan;
		this.benhVien = benhVien;
	}

	public String getTienSu() {
		return tienSu;
	}

	public String getChanDoan() {
		return chanDoan;
	}

	public BenhVien getBenhVien() {
		return benhVien;
	}

	public void setTienSu(String tienSu) {
		this.tienSu = tienSu;
	}

	public void setChanDoan(String chanDoan) {
		this.chanDoan = chanDoan;
	}

	public void setBenhVien(BenhVien benhVien) {
		this.benhVien = benhVien;
	}

	@Override
	public void nhapThongTin() {
		// TODO Auto-generated method stub
		super.nhapThongTin();
		Scanner sc = new Scanner(System.in);
		System.out.println("moi nhap tien su:");
		tienSu = sc.nextLine();
		System.out.println("moi nhap chan doan:");
		chanDoan = sc.nextLine();
//		BenhVien bv = new BenhVien();
//		bv.nhapthongTin();
		benhVien = new BenhVien();
		benhVien.nhapthongTin();
	}

	@Override
	public String toString() {
		return super.toString() + "tienSu=" + tienSu + ", chanDoan=" + chanDoan + ", benhVien=" + benhVien.toString();
	}

}
