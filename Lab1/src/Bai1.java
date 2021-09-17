import java.util.Scanner;

public class Bai1 {

	public static void main(String[] args) {
		
		Scanner banphim = new Scanner(System.in);
		
		System.out.print("Nhập họ tên: ");
		String hoten = banphim.nextLine();
		
		System.out.print("Nhập điểm trung bình: ");
		double diemTB = banphim.nextDouble();
		
		System.out.printf("%s %.3f điểm",hoten,diemTB);
		
		banphim.close();
	}
	//Nguyễn Anh Phương 61133153 CNTT(CLC)
}