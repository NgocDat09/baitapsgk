package bai11sgk;

import java.util.Scanner;

public class GVThingGiang extends GiangVien {
	private int soTiet;
	private double donGia;
	public GVThingGiang() {
		super();
	}
	
	public GVThingGiang(int soTiet, double donGia) {
		super();
		this.soTiet = soTiet;
		this.donGia = donGia;
	}

	@Override
	public void nhapThongTin() {
		super.nhapThongTin();
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap so tiet");
		soTiet = sc.nextInt();
		System.out.println("nhap don gia");
		donGia = sc.nextDouble();
	}
	@Override
	public double tinhLuong() {
		
		return soTiet*donGia - (double)15/100*soTiet*donGia ;
	}
	 
}
