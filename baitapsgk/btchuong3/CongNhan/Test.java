package bai14sgk;
//import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		CNKSP cn1 = new CNKSP();
		CNTCN cn2 = new CNTCN();
		System.out.println("nhap thong tin cua cn 1 ");
		cn1.nhapThongTin();
		System.out.println("nhap thong tin cua cn 2 ");
		cn2.nhapThongTin();
		
		CongNhan.inTieuDe();
		cn1.inThongTin();
		cn2.inThongTin();
	
	}

}
