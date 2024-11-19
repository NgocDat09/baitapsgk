package bai11sgk;

import java.util.Scanner;

public class GVCoHuu extends GiangVien {
	private double LCB;
	private int heSo;
	private double thamNien;
	public GVCoHuu() {
		super();
	}
	public GVCoHuu(double lCB, int heSo, double thamNien) {
		super();
		LCB = lCB;
		this.heSo = heSo;
		this.thamNien = thamNien;
	}
	
	
	
	
	@Override
	public void nhapThongTin() {
		// TODO Auto-generated method stub
		super.nhapThongTin();
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap LCB");
		LCB = sc.nextDouble();
		System.out.println("nhap he so luong");
		heSo = sc.nextInt();
		System.out.println("nhap thâm niên công tác");
		thamNien = sc.nextDouble();
		
	}
	@Override
	public double tinhLuong() {
		double phuCap = 0;
		if(thamNien >= 5) {
			phuCap = thamNien *(double)(1/100) * LCB; 
		}
		
		return LCB*heSo+phuCap;
	}
	
	
	
	
}
