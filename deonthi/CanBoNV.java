package deonthi;

public abstract class CanBoNV {
	protected String maCBNV;
	protected String hoTen;
	protected int namTuyenDung;
	protected float heSoLuong;
	protected float heSoPhuCap;

	public CanBoNV() {

	}

	// Constructor
	public CanBoNV(String maCBNV, String hoTen, int namTuyenDung, float heSoLuong, float heSoPhuCap) {
		this.maCBNV = maCBNV;
		this.hoTen = hoTen;
		this.namTuyenDung = namTuyenDung;
		this.heSoLuong = heSoLuong;
		this.heSoPhuCap = heSoPhuCap;
	}

	// Abstract method
	public abstract double getSalary();

	// Getter and Setter
	public String getMaCBNV() {
		return maCBNV;
	}

	public void setMaCBNV(String maCBNV) {
		this.maCBNV = maCBNV;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public int getNamTuyenDung() {
		return namTuyenDung;
	}

	public void setNamTuyenDung(int namTuyenDung) {
		this.namTuyenDung = namTuyenDung;
	}

	public float getHeSoLuong() {
		return heSoLuong;
	}

	public void setHeSoLuong(float heSoLuong) {
		this.heSoLuong = heSoLuong;
	}

	public float getHeSoPhuCap() {
		return heSoPhuCap;
	}

	public void setHeSoPhuCap(float heSoPhuCap) {
		this.heSoPhuCap = heSoPhuCap;
	}

	@Override
	public String toString() {
		return "MaCBNV: " + maCBNV + ", HoTen: " + hoTen + ", NamTuyenDung: " + namTuyenDung + ", HeSoLuong: "
				+ heSoLuong + ", HeSoPhuCap: " + heSoPhuCap;
	}
}
