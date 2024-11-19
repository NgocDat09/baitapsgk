package baitap6sgk;

import java.util.ArrayList;
import java.util.Scanner;

public class Demo {
	static ArrayList<LaoDong> dsld = new ArrayList<>();
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// Cau 1
		fakeData();
		inThongTin();
		// Cau 2
		suaThongTin();
		inThongTin();
		//cau 3
		timMax();
	}

	public static void fakeData() {
		LaoDong ld1 = new LaoDong("01", "anh a", 30, LoaiLD.CongNhan);
		LaoDong ld2 = new LaoDong("02", "anh b", 50, LoaiLD.SanXuat);
		LaoDong ld3 = new LaoDong("03", "anh c", 30, LoaiLD.CongNhan);
		LaoDong ld4 = new LaoDong("04", "anh d", 30, LoaiLD.SanXuat);
		LaoDong ld5 = new LaoDong("05", "anh e", 30, LoaiLD.CongNhan);
		dsld.add(ld1);
		dsld.add(ld2);
		dsld.add(ld3);
		dsld.add(ld4);
		dsld.add(ld5);
	}

	public static void inThongTin() {
		LaoDong.inTieuDe();
		for (LaoDong s : dsld) {
			s.inDL();
		}
	}

	public static int timNguoi() {
		System.out.println("Nhap ten can tim:");
		String tencanTim = sc.nextLine();
		for (int i = 0; i < dsld.size(); i++) {
			if (dsld.get(i).getTenLD().equalsIgnoreCase(tencanTim)) {
				return i;
			}
		}
		return -1;
	}

	public static void suaThongTin() {
		int index = timNguoi();
		if (index < 0) {
			System.out.println("Khong tim duoc");
		} else {
			System.out.println(
					"Nhan 1 de sua MaLD\nNhan 2 de sua TenLD\nNhan 3 de sua SonNgayCong\nNhan 4 de sua LoaiLaoDong");
			int choose = sc.nextInt();
			sc.nextLine();
			switch (choose) {
			case 1:
				System.out.println("Nhap maLD moi: ");
				String ma = sc.nextLine();
				dsld.get(index).setMaLD(ma);
				break;
			case 2:
				System.out.println("nhap ten lao dong moi: ");
				String ten = sc.nextLine();
				dsld.get(index).setTenLD(ten);
				break;
			case 3:
				System.out.println("nhap vao so ngay cong moi: ");
				int ngayMoi = sc.nextInt();
				dsld.get(index).setSoNgayCong(ngayMoi);
				break;
			case 4:
				System.out.println("nhap a de sua thanh CongNhan\nnhan b de sua thanh SanXuat");
				char a = sc.next().charAt(0);
				if (a == 'a') {
					dsld.get(index).setLoaiLD(LoaiLD.CongNhan);

				} else {
					dsld.get(index).setLoaiLD(LoaiLD.SanXuat);

				}
				break;
			default:
				System.out.println("lua chon khong hop le");
				break;
			}
		}
	}

	public static void timMax() {
		double max = dsld.get(0).tinhLuong();
		for (int i = 0; i < dsld.size(); i++) {
			if (max < dsld.get(i).tinhLuong()) {
				max = dsld.get(i).tinhLuong();
			}
		}
		LaoDong.inTieuDe();
		for (int i = 0; i < dsld.size(); i++) {
			if (max == dsld.get(i).tinhLuong()) {
				dsld.get(i).inDL();
			}
		}
	}
}
