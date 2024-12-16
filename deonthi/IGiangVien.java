package deonthi;

public interface IGiangVien {
	void addGiangVien(GiangVien gv);

	void editGiangVien(GiangVien gv);

	void searchGiangVien(String maCBNV);

	double getTotalSalary(String hocHamHocVi);
}
