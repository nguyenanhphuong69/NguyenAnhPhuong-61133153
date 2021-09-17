import java.util.Scanner;

public class Bai2 {
	
	public static void main(String[] args) {
		Scanner banphim = new Scanner(System.in);
		
		System.out.print("Nhập chiều dài hình chữ nhật: ");
		double chieuDai = banphim.nextDouble();
		
		System.out.print("Nhập chiều rộng hình chữ nhật: ");
		double chieuRong = banphim.nextDouble();
		
		double canhNN = Math.min(chieuDai, chieuRong);
		double chuVi = (chieuDai+chieuRong)*2;
		double dienTich = chieuDai*chieuRong;
		
		System.out.printf("Chu vi hình chữ nhật: %.3f",chuVi);
		System.out.printf("\nDiện tích hình chữ nhật: %.3f",dienTich);
		System.out.printf("\nCạnh nhỏ nhất: %.3f",canhNN);
		
		banphim.close();
	}
	//Nguyễn Anh Phương 61133153 CNTT(CLC)
}