package deonthi;

import java.util.ArrayList;

public class QLGiangVien implements IGiangVien {
	private ArrayList<GiangVien> danhSachGV = new ArrayList<>();

	@Override
	public void addGiangVien(GiangVien gv) {
		try {
			if (gv == null) {
				throw new Exception("Giảng viên không được null.");
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
				throw new Exception("Giảng viên không được null.");
			}

			for (int i = 0; i < danhSachGV.size(); i++) {
				if (danhSachGV.get(i).getMaCBNV().equals(gv.getMaCBNV())) {
					danhSachGV.set(i, gv);
					break;
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
				throw new Exception("Mã cán bộ nhân viên không được để trống.");
			}
			boolean found = false; 
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
		try {
			if (hocHamHocVi == null || hocHamHocVi.isEmpty()) {
				throw new Exception("Học hàm học vị không được để trống.");
			}

			for (GiangVien gv : danhSachGV) {
				if (gv.getHocHamHocVi().equals(hocHamHocVi)) {
					total += gv.getSalary();
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return total;
	}
}
