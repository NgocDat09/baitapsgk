package bai14sgk;

//import java.util.Scanner;

public class CNTCN extends CongNhan {
	private double luongCoBan = 8000000;
	private double heSoLuong = 8;
	private int soNgayCong = 25;

	public CNTCN() {
		super();

	}

	public CNTCN(double luongCoBan, double heSoLuong, int soNgayCong) {
		super();
		this.luongCoBan = luongCoBan;
		this.heSoLuong = heSoLuong;
		this.soNgayCong = soNgayCong;
	}

//	@Override
//	public void nhapThongTin() {
//		Scanner sc = new Scanner(System.in);
//		super.nhapThongTin();
//		System.out.println("luongCoBan:");
//		luongCoBan = sc.nextDouble();
//		System.out.println("heSoLuong:");
//		heSoLuong = sc.nextDouble();
//		System.out.println("soNgayCong:");
//		soNgayCong = sc.nextInt();
//	}

	@Override
	public double tinhLuong() {
		double thuong;
		if (soNgayCong >= 20) {
			thuong = 1.2 * luongCoBan;
		} else {
			thuong = 0;
		}
		return luongCoBan * heSoLuong + thuong;
	}

}
