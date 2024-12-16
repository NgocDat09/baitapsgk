package deonthi;

public class GiangVien extends CanBoNV{
	private String hocHamHocVi;
    private String khoaCongTac;
    private int soGioDay;
    private double luongBoSung;

    public GiangVien() {
		super();
	}

	public GiangVien(String maCBNV, String hoTen, int namTuyenDung, float heSoLuong, float heSoPhuCap,
                     String hocHamHocVi, String khoaCongTac, int soGioDay) {
        super(maCBNV, hoTen, namTuyenDung, heSoLuong, heSoPhuCap);
        this.hocHamHocVi = hocHamHocVi;
        this.khoaCongTac = khoaCongTac;
        this.soGioDay = soGioDay;

        // Xác định lương bổ sung
        if (hocHamHocVi.equals("TS")) {
            this.luongBoSung = 7000000;
        } else if (hocHamHocVi.equals("PGS")) {
            this.luongBoSung = 9000000;
        } else if (hocHamHocVi.equals("GS")) {
            this.luongBoSung = 12000000;
        } else {
            this.luongBoSung = 0;
        }
    }

    public String getHocHamHocVi() {
		return hocHamHocVi;
	}

	public void setHocHamHocVi(String hocHamHocVi) {
		this.hocHamHocVi = hocHamHocVi;
	}

	@Override
    public double getSalary() {
        return (heSoLuong + heSoPhuCap) * 2340000 * 1.25 + soGioDay * 200000 + luongBoSung;
    }

    @Override
    public String toString() {
        return super.toString() + ", HocHamHocVi: " + hocHamHocVi + ", KhoaCongTac: " + khoaCongTac
                + ", SoGioDay: " + soGioDay + ", LuongBoSung: " + luongBoSung;
    }
}
