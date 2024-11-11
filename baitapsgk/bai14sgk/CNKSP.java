package bai14sgk;

import java.util.Scanner;

public class CNKSP extends CongNhan {

	private int soSanPham = 1600;
	private double donGiaSanPham = 20000;

	public CNKSP() {
		super();

	}

	public CNKSP(int soSanPham, double donGiaSanPham) {
		super();
		this.soSanPham = soSanPham;
		this.donGiaSanPham = donGiaSanPham;
	}
	@Override
	public void nhapThongTin() {
		Scanner sc = new Scanner(System.in);
		super.nhapThongTin();
		System.out.println("soSanPham:");
		soSanPham = sc.nextInt();
		System.out.println("donGiaSanPham:");
		donGiaSanPham = sc.nextDouble();
	}

	@Override
	public double tinhLuong() {
		int thuong = 0;
		if (soSanPham >= 1100) {
			thuong = 1000000;
		} else if (soSanPham >= 1500) {
			thuong = 1500000;
		}
		return soSanPham * donGiaSanPham + thuong;
	}

}
