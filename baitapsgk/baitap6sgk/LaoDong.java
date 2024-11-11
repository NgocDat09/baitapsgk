package baitap6sgk;

public class LaoDong {
	private String maLD;
	private String tenLD;
	private int soNgayCong;
	private final double DONGIA = 100000;
	private LoaiLD loaiLD;
	
	
	public LaoDong() {
	}

	public LaoDong(String maLD, String tenLD, int soNgayCong, LoaiLD loaiLD) {
		this.maLD = maLD;
		this.tenLD = tenLD;
		this.soNgayCong = soNgayCong;
		this.loaiLD = loaiLD;
	}


	public String getMaLD() {
		return maLD;
	}




	public int getSoNgayCong() {
		return soNgayCong;
	}




	public double getDONGIA() {
		return DONGIA;
	}




	public LoaiLD getLoaiLD() {
		return loaiLD;
	}




	public void setMaLD(String maLD) {
		this.maLD = maLD;
	}




	public void setTenLD(String tenLD) {
		this.tenLD = tenLD;
	}




	public void setSoNgayCong(int soNgayCong) {
		this.soNgayCong = soNgayCong;
	}




	public void setLoaiLD(LoaiLD loaiLD) {
		this.loaiLD = loaiLD;
	}




	public String getTenLD() {
		return tenLD.toUpperCase();
	}
	
	
	public double tinhLuong() {
		double thuong = 0;
		if (soNgayCong >= 25) {
			thuong = 1000000;
		}else if(soNgayCong >=15) {
			thuong =  700000;
		}
		return soNgayCong*DONGIA + thuong;	
	}
	
	public static void inTieuDe() {
		System.out.printf("%-20s %-20s %-20s %-20s %-20s %n","MaLD","TenLD","SoNgayCong","KieuLaoDong","Luong");
	}
	
	public void inDL() {
		System.out.printf("%-20s %-20s %-20d %-20s %-20f %n",maLD,getTenLD(),soNgayCong,loaiLD,tinhLuong());
	}
}
