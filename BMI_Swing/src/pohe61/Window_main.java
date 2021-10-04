package pohe61;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.*;
import javax.swing.border.TitledBorder;

public class Window_main {

	private JFrame frmChngTrnhTnh;
	private JTextField txtCao;
	private JTextField txtNang;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window_main window = new Window_main();
					window.frmChngTrnhTnh.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Window_main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmChngTrnhTnh = new JFrame();
		frmChngTrnhTnh.setTitle("Chương trình tính BMI");
		frmChngTrnhTnh.setBounds(100, 100, 732, 362);
		frmChngTrnhTnh.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmChngTrnhTnh.getContentPane().setLayout(null);
		
		JLabel lblNhapCao = new JLabel("Nhập chiều cao (mét) : ");
		lblNhapCao.setHorizontalAlignment(SwingConstants.CENTER);
		lblNhapCao.setBounds(45, 61, 139, 25);
		frmChngTrnhTnh.getContentPane().add(lblNhapCao);
		
		txtCao = new JTextField();
		txtCao.setBounds(194, 64, 132, 19);
		frmChngTrnhTnh.getContentPane().add(txtCao);
		txtCao.setColumns(10);
		
		JLabel lblNhapNang = new JLabel("Nhập cân nặng (kg) : ");
		lblNhapNang.setHorizontalAlignment(SwingConstants.CENTER);
		lblNhapNang.setBounds(45, 96, 139, 25);
		frmChngTrnhTnh.getContentPane().add(lblNhapNang);
		
		txtNang = new JTextField();
		txtNang.setBounds(194, 99, 132, 19);
		frmChngTrnhTnh.getContentPane().add(txtNang);
		txtNang.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Khu v\u1EF1c", TitledBorder.CENTER, TitledBorder.TOP, null, Color.BLUE));
		panel.setBounds(94, 131, 232, 48);
		frmChngTrnhTnh.getContentPane().add(panel);
		panel.setLayout(null);
		
		JRadioButton radA = new JRadioButton("Asian");
		buttonGroup.add(radA);
		radA.setBounds(25, 16, 84, 21);
		panel.add(radA);
		
		JRadioButton radNonA = new JRadioButton("Non-Asian");
		buttonGroup.add(radNonA);
		radNonA.setBounds(123, 16, 103, 21);
		panel.add(radNonA);
		
		JLabel lblWelc = new JLabel("Chào mừng các bạn đến với chương trình tính BMI");
		lblWelc.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelc.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblWelc.setForeground(Color.BLUE);
		lblWelc.setBounds(94, 10, 384, 33);
		frmChngTrnhTnh.getContentPane().add(lblWelc);
		
		JLabel lblKq = new JLabel("");
		lblKq.setToolTipText("");
		lblKq.setBounds(45, 235, 341, 20);
		frmChngTrnhTnh.getContentPane().add(lblKq);
		
		JLabel lblAv = new JLabel("");
		lblAv.setBounds(45, 257, 630, 20);
		frmChngTrnhTnh.getContentPane().add(lblAv);
		
		JButton btnTinhBMI = new JButton("Tính BMI");
		btnTinhBMI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String strChieuCao = txtCao.getText();
				String strCanNang = txtNang.getText();
				
				double a = Double.parseDouble(strCanNang);
				double b = Double.parseDouble(strChieuCao);
				
				double kq = a/(b*b);
				
				kq = Math.ceil(kq*100)/100;
				
				String av1 = "Bạn bị gầy. Bạn nên tìm gặp bác sĩ để được tư vấn chế độ ăn giàu dinh dưỡng hơn!";
				String av2 = "Bạn đang ở trạng thái bình thường. Tiếp tục chế độ ăn hợp lý và thường xuyên luyện tập thể dục thể thao!";
				String av3 = "Bạn bị thừa cân. Bạn nên có chế độ ăn hợp lý và tập luyện thể dục thường xuyên!";
				String av4 = "Bạn bị tiền béo phì. Bạn bên tìm gặp bác sĩ để được tư vấn về chế độ ăn kiêng cùng với các bài tập thể dục!";
				String av5 = "Bạn bị béo phì. Bạn bên tìm gặp bác sĩ để được tư vấn về chế độ ăn kiêng cùng với các bài tập thể dục!";
				String av6 = "Bạn bị béo phì độ I. Bạn bên tìm gặp bác sĩ để được tư vấn về chế độ ăn kiêng cùng với các bài tập thể dục!";
				String av7 = "Bạn bị béo phì độ II. Bạn bên tìm gặp bác sĩ để được tư vấn về chế độ ăn kiêng cùng với các bài tập thể dục!";
				String av8 = "Bạn bị béo phì độ III. Bạn bên tìm gặp bác sĩ để được tư vấn về chế độ ăn kiêng cùng với các bài tập thể dục!";
				
				String temp;
				temp= "Chỉ số BMI của bạn là "+ String.valueOf(kq);
				
				if (radA.isSelected() == true) {
					if (kq<18.5) 
						lblAv.setText(av1);
					else 
						if (kq>=18.5 && kq <25)
							lblAv.setText(av2);
						else
							if (kq>=25 && kq <30)
								lblAv.setText(av3);
							else
								if (kq>=29.9 && kq <=30)
									lblAv.setText(av5);
								else
									if (kq>30 && kq <40)
										lblAv.setText(av6);
									else
										if (kq>=40 && kq <50)
											lblAv.setText(av7);
										else
											lblAv.setText(av8);
				} else if (radNonA.isSelected() == true) {
					if (kq<18.5) 
						lblAv.setText(av1);
					else 
						if (kq>=18.5 && kq <23)
							lblAv.setText(av2);
						else
							if (kq>=23 && kq <25)
								lblAv.setText(av3);
							else
								if (kq>=25 && kq <29.9)
									lblAv.setText(av4);
								else
									if (kq>=29.9 && kq <=30)
										lblAv.setText(av5);
									else
										if (kq>30 && kq <40)
											lblAv.setText(av6);
										else
											if (kq>=40 && kq <50)
												lblAv.setText(av7);
											else
												lblAv.setText(av8);	
						} else lblAv.setText("Bạn chưa chọn khu vực");
				
				lblKq.setText(temp);
			}
		});
		btnTinhBMI.setBounds(164, 189, 89, 25);
		frmChngTrnhTnh.getContentPane().add(btnTinhBMI);
		
		
	}
}
