package NguyenAnhPhuong;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
public class CuaSoTong extends Frame {
	public CuaSoTong() {
		setLayout(null);
		setBounds(0, 0, 600, 400);
		setTitle("Chương trình tính tổng 2 số A và B");
		
		lblA= new Label("A=");
		lblA.setBounds(40, 50, 25, 20);
		
		lblB= new Label("B=");
		lblB.setBounds(40, 80, 25, 20);
		
		lblKQ= new Label("KQ=");
		lblKQ.setBounds(40, 140, 25, 20);
		
		txtA= new TextField();
		txtA.setBounds(80, 50, 80, 20);
		
		txtB= new TextField();
		txtB.setBounds(80, 80, 80, 20);
		
		txtKQ= new TextField();
		txtKQ.setBounds(80, 140, 80, 20);
		txtKQ.setEditable(false);
		
		btnCong = new Button("Tính tổng");
		btnCong.setBounds(80, 110, 80, 20);
		
		add(lblA); add(lblB); add(lblKQ);
		
		add(txtA); add(txtB); add(txtKQ);
		
		add(btnCong);
		
		btnCong.addActionListener(new BoLangNgheXL_Cong());
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
	Button btnCong;
}