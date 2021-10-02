package BMI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

//import TongHieuTichTh.Window.BoLangNgheXL_BMI;


public class Window extends Frame {
	public Window() {
		setLayout(null);
		setBounds(40, 40, 800, 550);
		setTitle("Chương trình tính BMI");
		
		lblChieuCao= new Label("Nhập chiều cao (mét) : ");
		lblChieuCao.setBounds(30, 50, 120, 20);
		
		lblCanNang= new Label("Nhập cân nặng (kg) : ");
		lblCanNang.setBounds(30, 80, 120, 20);
		
		txtChieuCao= new TextField();
		txtChieuCao.setBounds(160, 50, 100, 20);
		
		txtCanNang= new TextField();
		txtCanNang.setBounds(160, 80, 100, 20);
		
		lblKq = new Label("");
		lblKq.setBounds(30, 135, 600, 20);
		
		lblAv = new Label("");
		lblAv.setBounds(30,155,750,20);
		
		btnTinhBMI = new Button("Tính BMI");
		btnTinhBMI.setBounds(100, 110, 60, 20);
		
		add(lblChieuCao); add(lblCanNang);
		add(txtChieuCao); add(txtCanNang);
		add(btnTinhBMI); add(lblKq); add(lblAv);
		
		btnTinhBMI.addActionListener(new BoLangNgheXL_BMI());
	
		addWindowListener(new BoLangNgheXL_cuaso());
	
		setVisible(true);
	
	}
	
	class BoLangNgheXL_BMI implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			String strChieuCao = txtChieuCao.getText();
			String strCanNang = txtCanNang.getText();
			
			double a = Double.parseDouble(strCanNang);
			double b = Double.parseDouble(strChieuCao);
			
			double kq = a/(b*2);
			
			String temp;
			
			kq = Math.ceil(kq*100)/100;
			
			String av1 = "Bạn bị gầy độ III. Bạn nên tìm gặp bác sĩ để được tư vấn chế độ ăn giàu dinh dưỡng hơn!";
			String av2 = "Bạn bị gầy độ II.  Bạn nên tìm gặp bác sĩ để được tư vấn chế độ ăn giàu dinh dưỡng hơn!";
			String av3 = "Bạn bị gầy độ I. Bạn nên tìm gặp bác sĩ để được tư vấn chế độ ăn giàu dinh dưỡng hơn!";
			String av4 = "Bạn đang ở trạng thái bình thường. Tiếp tục chế độ ăn hợp lý và thường xuyên luyện tập thể dục thể thao!";
			String av5 = "Bạn bị thừa cân. Bạn nên có chế độ ăn hợp lý và tập luyện thể dục thường xuyên!";
			String av6 = "Bạn bị béo phì độ I. Bạn bên tìm gặp bác sĩ để được tư vấn về chế độ ăn kiêng cùng với các bài tập thể dục thích hợp!";
			String av7 = "Bạn bị béo phì độ II. Bạn bên tìm gặp bác sĩ để được tư vấn về chế độ ăn kiêng cùng với các bài tập thể dục thích hợp!";
			String av8 = "Bạn bị béo phì độ III. Bạn bên tìm gặp bác sĩ để được tư vấn về chế độ ăn kiêng cùng với các bài tập thể dục thích hợp!";
			
			temp= "Chỉ số BMI của bạn là "+ String.valueOf(kq);
			
			if (kq<16) 
				lblAv.setText(av1);
			else 
				if (kq>=16 && kq <17)
					lblAv.setText(av2);
				else
					if (kq>=17 && kq <18.5)
						lblAv.setText(av3);
					else
						if (kq>=18.5 && kq <25)
							lblAv.setText(av4);
						else
							if (kq>=25 && kq <30)
								lblAv.setText(av5);
							else
								if (kq>=30 && kq <35)
									lblAv.setText(av6);
								else
									if (kq>=35 && kq <40)
										lblAv.setText(av7);
									else
											lblAv.setText(av8);
									
			lblKq.setText(temp);
		}
	}

	class BoLangNgheXL_cuaso implements WindowListener {



		@Override
		public void windowOpened(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}

		@Override
		public void windowClosed(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowIconified(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowDeiconified(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowActivated(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowDeactivated(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	Label lblChieuCao, lblCanNang, lblKq, lblAv;
	TextField txtChieuCao, txtCanNang;
	Button btnTinhBMI;
}

