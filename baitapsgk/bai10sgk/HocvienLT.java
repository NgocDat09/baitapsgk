package bai10sgk;

import java.util.Scanner;

public class HocvienLT extends HocVien{
	private int soBuoi;
	private double donGiaLT;
	
	public HocvienLT() {
		super();
	}

	public HocvienLT(int soBuoi, double donGiaLT) {
		super();
		this.soBuoi = soBuoi;
		this.donGiaLT = donGiaLT;
	}

	@Override
	public double hocPhi() {
		if (uuTien == 1) {
			uuTien = 1000000;
		} else {
			uuTien = 800000;
		}
		return soBuoi * donGiaLT - uuTien;
	}

	@Override
	public void nhapThongTin() {
		super.nhapThongTin();
		Scanner sc = new Scanner(System.in);
		System.out.println("moi nhap so buoi");
		soBuoi = sc.nextInt();
		System.out.println("moi nhap don gia LT");
		donGiaLT = sc.nextDouble();
	}
	 
	
}
