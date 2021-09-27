import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class chuongtrinh {
	public static void main(String[] args) {
		Frame fr= new Frame("Tong 2 so A va B");
		fr.setBounds(0, 0, 600, 400);
		fr.setLayout(null);
		
		Label lblA = new Label("A=");
		lblA.setBounds(40, 50, 25, 20);
		
		Label lblB = new Label("B=");
		lblB.setBounds(40, 80, 25, 20);
		
		Label lblKQ = new Label("KQ=");
		lblKQ.setBounds(40, 140, 25, 20);
		
		TextField txtA = new TextField();
		txtA.setBounds(80, 50, 80, 20);
		
		TextField txtB = new TextField();
		txtB.setBounds(80, 80, 80, 20);
		
		TextField txtKQ = new TextField();
		txtKQ.setBounds(80, 140, 80, 20);
		
		Button btnCong = new Button("Tinh tong");
		btnCong.setBounds(80, 110, 80, 20);
		
		fr.add(lblA); fr.add(txtA);
		fr.add(lblB); fr.add(txtB);
		fr.add(btnCong);
		fr.add(lblKQ); fr.add(txtKQ);
		
		ActionListener bolangnghe = new ActionListener() { 
			@Override
			public void actionPerformed(ActionEvent e) {
				String strA = txtA.getText();
				String strB = txtB.getText();
				
				int a = Integer.parseInt(strA);
				int b = Integer.parseInt(strB);
				
				int kq = a+b;
				
				txtKQ.setText(String.valueOf(kq));
				txtKQ.setEditable(false);
			}
		};
		btnCong.addActionListener(bolangnghe);
		
		fr.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);;
			}
		});
		
		fr.setVisible(true);
	//Nguyen Anh Phuong 61133153
	}
}