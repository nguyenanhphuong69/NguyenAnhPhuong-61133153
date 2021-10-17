public class SanPham {
	//Chúc thầy chấm bài vui vẻ ^^
	private String MaSP,TenSP;
	private Double DonGia;
	
	public SanPham() {
		this.MaSP = "";
		this.TenSP = "";
		this.DonGia = 0.0;
	}
	
	public SanPham(String a, String b, Double c) {
		this.MaSP = a;
		this.TenSP = b;
		this.DonGia = c;
	}
	
	public String getMaSP()
	{
		return MaSP;
	}
	
	public String getTenSP()
	{
		return TenSP;
	}
	
	public Double getDonGia()
	{
		return DonGia;
	}
	
	void setMaSP(String a) {
		this.MaSP = a;
	}
	
	void setTenSP(String a) {
		this.TenSP = a;
	}
	
	void setDonGia(Double a) {
		this.DonGia = a;
	}
	
}