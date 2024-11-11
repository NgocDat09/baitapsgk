package bai10sgk;

import java.util.Scanner;

public class HocvienDH extends HocVien {
	private int soBuoi;
	private double donGiaDH;

	public HocvienDH() {
		super();
	}

	public HocvienDH(int soBuoi, double donGiaDH) {
		super();
		this.soBuoi = soBuoi;
		this.donGiaDH = donGiaDH;
	}

	@Override
	public double hocPhi() {
		if (uuTien == 1) {
			uuTien = 1000000;
		} else {
			uuTien = 500000;
		}
		return soBuoi * donGiaDH - uuTien;
	}

	@Override
	public void nhapThongTin() {
		super.nhapThongTin();
		Scanner sc = new Scanner(System.in);
		System.out.println("moi nhap so buoi");
		soBuoi = sc.nextInt();
		System.out.println("moi nhap don gia DH");
		donGiaDH = sc.nextDouble();
	}
	
	

}
