package baitap4sgk;

import java.util.Scanner;

public class BenhVien {
	private String ten;
	private String diaChi;
	private String giamDoc;
	
	
	public BenhVien() {
	}

	public BenhVien(String ten, String diaChi, String giamDoc) {
		this.ten = ten;
		this.diaChi = diaChi;
		this.giamDoc = giamDoc;
	}

	public String getTen() {
		return ten;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public String getGiamDoc() {
		return giamDoc;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public void setGiamDoc(String giamDoc) {
		this.giamDoc = giamDoc;
	}
	
//	BenhVien bv = new BenhVien();
	public void nhapthongTin() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("moi ban nhap tenBenhVien");
		ten = sc.nextLine();
		System.out.println("moi nhap diaChi");
		diaChi = sc.nextLine();
		System.out.println("moi nhap giamDoc");
		giamDoc = sc.nextLine();
		
	}
	
	public String toString() {
		return "tên: "+ ten +" địa chỉ: "+  diaChi + " giám đốc: "+ giamDoc;
	}
	
}
