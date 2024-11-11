package baitap4sgk;

import java.util.Scanner;

public class Nguoi {
	private String ten;
	private int tuoi;
	private char gioiTinh;
	
	public Nguoi() {
		
	}
	public Nguoi(String ten, int tuoi, char gioiTinh) {
		this.ten = ten;
		this.tuoi = tuoi;
		this.gioiTinh = gioiTinh;
	}
	public String getTen() {
		return ten;
	}
	public int getTuoi() {
		return tuoi;
	}
	public char getGioiTinh() {
		return gioiTinh;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	public void setGioiTinh(char gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	
	public void nhapThongTin() {
		Scanner sc = new Scanner(System.in);
		System.out.println("moi ban nhap ten:");
		ten = sc.nextLine();
		System.out.println("moi nhap tuoi:");
		tuoi = sc.nextInt();
		System.out.println("moi nhap gioiTinh:");
		gioiTinh = sc.next().charAt(0);
	}
	
	public String toString () {
		return "ten: "+ten+" tuoi: "+ tuoi + " gio tinh: "+ gioiTinh;
	}
	
	
	
}
