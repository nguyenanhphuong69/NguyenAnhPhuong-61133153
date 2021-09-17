import java.util.Scanner;

public class Bai4 {

	public static void main(String[] args) {
		
		Scanner banphim = new Scanner(System.in);
		
		System.out.print("Nhập hệ số a của phương trình: ");
		double a = banphim.nextDouble();
		
		System.out.print("Nhập hệ số b của phương trình: ");
		double b = banphim.nextDouble();
		
		System.out.print("Nhập hệ số c của phương trình: ");
		double c = banphim.nextDouble();
		
		double delta = Math.pow(b,2) - 4*a*c;
		
		if (delta < 0) 
			System.out.printf("Delta < 0, không thể tính căn delta");
		else {
			System.out.printf("Delta là: %.3f",delta);
			double canDelta = Math.sqrt(delta);
			System.out.printf("\nCăn delta là: %.3f",canDelta);
				}
		
		banphim.close();
	}
	//Nguyễn Anh Phương 61133153 CNTT(CLC)
}