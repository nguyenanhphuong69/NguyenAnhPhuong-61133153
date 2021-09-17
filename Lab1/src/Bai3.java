import java.util.Scanner;

public class Bai3 {

	public static void main(String[] args) {
		
		Scanner banphim = new Scanner(System.in);
		
		System.out.print("Nhập cạnh hình lập phương: ");
		double canh = banphim.nextDouble();
		
		double theTich = Math.pow(canh,3);
		//double theTich = canh*canh*canh;
		
		System.out.printf("Thể tích hình lập phương là: %.3f",theTich);
		banphim.close();
	}
	//Nguyễn Anh Phương 61133153 CNTT(CLC)
}