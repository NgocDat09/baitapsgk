package deonthi;

import java.util.ArrayList;

public class QLGiangVien implements IGiangVien {
	private ArrayList<GiangVien> danhSachGV = new ArrayList<>();

	@Override
	public void addGiangVien(GiangVien gv) {
		 try {
		        if (gv == null) {
		            throw new IllegalArgumentException("Giảng viên không được null.");
		        }
			danhSachGV.add(gv);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} 
		
	}

	@Override
	public void editGiangVien(GiangVien gv) {
		try {
			if (gv == null) {
				throw new IllegalArgumentException("Giảng viên không được null.");
			}

			for (int i = 0; i < danhSachGV.size(); i++) {
				if (danhSachGV.get(i).getMaCBNV().equals(gv.getMaCBNV())) {
					danhSachGV.set(i, gv);
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	@Override
	public void searchGiangVien(String maCBNV) {
		try {
			if (maCBNV == null || maCBNV.isEmpty()) {
				throw new IllegalArgumentException("Mã cán bộ nhân viên không được để trống.");
			}
			boolean found = false; // Cờ kiểm tra
			for (GiangVien gv : danhSachGV) {
				if (gv.getMaCBNV().equals(maCBNV)) {
					System.out.println(gv.toString());
					found = true;
					break; // Dừng vòng lặp khi đã tìm thấy
				}
			}
			if (!found) {
				System.out.println("Không có giảng viên với mã: " + maCBNV);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	@Override
	public double getTotalSalary(String hocHamHocVi) {

		double total = 0;
		for (GiangVien gv : danhSachGV) {
			if (gv.getHocHamHocVi().equals(hocHamHocVi)) {
				total += gv.getSalary();
			}
		}
		return total;
	}
}
