package bai11sgk;

import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		GiangVien.nhapTD();
		
	}
	
	ArrayList<GVCoHuu> ds = new ArrayList<>();
	public void fakeData() {
		GVCoHuu ch1 = new GVCoHuu(1000000, 6, 6);
		GVCoHuu ch2 = new GVCoHuu(2000000, 7, 7);
		GVCoHuu ch3 = new GVCoHuu(3000000, 8, 8);
		GVCoHuu ch4 = new GVCoHuu(4000000, 9, 9);
		GVCoHuu ch5 = new GVCoHuu(5000000, 10, 10);
		ds.add(ch1);
		ds.add(ch2);
		ds.add(ch3);
		ds.add(ch4);
		ds.add(ch5);

	}
	public void inThongTin() {
		for(GVCoHuu pt : ds) {
			pt.inTT();
		}
	}
	
}
