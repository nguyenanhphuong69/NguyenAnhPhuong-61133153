package TongHieuTichTh;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Window extends Frame {
	public Window() {
		setLayout(null);
		setBounds(0, 0, 600, 400);
		setTitle("Chương trình tính tổng 2 số A và B");
		
		lblA= new Label("A=");
		lblA.setBounds(40, 50, 25, 20);
		
		lblB= new Label("B=");
		lblB.setBounds(40, 80, 25, 20);
		
		lblKQ= new Label("KQ=");
		lblKQ.setBounds(40, 150, 25, 20);
		
		txtA= new TextField();
		txtA.setBounds(80, 50, 130, 20);
		
		txtB= new TextField();
		txtB.setBounds(80, 80, 130, 20);
		
		txtKQ= new TextField();
		txtKQ.setBounds(80, 150, 130, 20);
		txtKQ.setEditable(false);
		
		btnCong = new Button("Tổng");
		btnCong.setBounds(40, 120, 35, 20);
		
		btnHieu = new Button("Hiệu");
		btnHieu.setBounds(80, 120, 35, 20);
		
		btnTich = new Button("Tích");
		btnTich.setBounds(120, 120, 35, 20);
		
		btnThuong = new Button("Thương");
		btnThuong.setBounds(160, 120, 50, 20);
		
		add(lblA); add(lblB); add(lblKQ);
		
		add(txtA); add(txtB); add(txtKQ);
		
		add(btnCong);add(btnHieu);add(btnTich);add(btnThuong);
		
		
		btnCong.addActionListener(new BoLangNgheXL_Cong());
		
		btnHieu.addActionListener(new BoLangNgheXL_Hieu());
		
		btnTich.addActionListener(new BoLangNgheXL_Tich());
		
		btnThuong.addActionListener(new BoLangNgheXL_Thuong());
		
		addWindowListener(new BoLangNgheXL_cuaso());
		
		setVisible(true);
	}
	class BoLangNgheXL_Cong implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			String strA = txtA.getText();
			String strB = txtB.getText();
			
			int a = Integer.parseInt(strA);
			int b = Integer.parseInt(strB);
			
			int kq = a+b;
			
			txtKQ.setText(String.valueOf(kq));
		}
	}
	
	class BoLangNgheXL_Hieu implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			String strA = txtA.getText();
			String strB = txtB.getText();
			
			int a = Integer.parseInt(strA);
			int b = Integer.parseInt(strB);
			
			int kq = a-b;
			
			txtKQ.setText(String.valueOf(kq));
		}
	}
	
	class BoLangNgheXL_Tich implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			String strA = txtA.getText();
			String strB = txtB.getText();
			
			int a = Integer.parseInt(strA);
			int b = Integer.parseInt(strB);
			
			int kq = a*b;
			
			txtKQ.setText(String.valueOf(kq));
		}
	}
	
	class BoLangNgheXL_Thuong implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			String strA = txtA.getText();
			String strB = txtB.getText();
			
			double a = Double.parseDouble(strA);
			double b = Double.parseDouble(strB);
			
			double kq = a/b;
			kq = Math.ceil(kq*1000)/1000;
			
			txtKQ.setText(String.valueOf(kq));
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
	TextField txtA,txtB,txtKQ;
	Label lblA, lblB, lblKQ;
	Button btnCong, btnHieu, btnTich, btnThuong;
}