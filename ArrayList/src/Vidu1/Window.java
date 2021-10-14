package Vidu1;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Window.Type;
import java.util.ArrayList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JTextArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class Window {
	ArrayList<String> dsTen = new ArrayList<String>(0);

	private JFrame frmChngTrnhNhp;
	private JLabel lblTrangThai;
	private JTextField txtHoVaTen;
	JTextArea txtHienDanhSach;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window window = new Window();
					window.frmChngTrnhNhp.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Window() {
		initialize();
	}

	private void initialize() {
		frmChngTrnhNhp = new JFrame();
		frmChngTrnhNhp.setForeground(Color.LIGHT_GRAY);
		frmChngTrnhNhp.setFont(new Font("Dialog", Font.PLAIN, 14));
		frmChngTrnhNhp.setTitle("Chương trình nhập họ tên vào danh sách");
		frmChngTrnhNhp.setBounds(100, 100, 800, 450);
		frmChngTrnhNhp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmChngTrnhNhp.getContentPane().setLayout(null);
		
		txtHoVaTen = new JTextField();
		txtHoVaTen.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblTrangThai.setText("Mời bạn nhập ...");
			}
		});

		txtHoVaTen.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtHoVaTen.setBounds(277, 37, 225, 32);
		frmChngTrnhNhp.getContentPane().add(txtHoVaTen);
		txtHoVaTen.setColumns(10);
		
		JLabel lblHoVaTen = new JLabel("Nhập họ tên vào danh sách:");
		lblHoVaTen.setHorizontalAlignment(SwingConstants.CENTER);
		lblHoVaTen.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblHoVaTen.setBounds(71, 36, 196, 32);
		frmChngTrnhNhp.getContentPane().add(lblHoVaTen);
		
		lblTrangThai = new JLabel("Mời bạn nhập");
		lblTrangThai.setBounds(405, 79, 101, 13);
		frmChngTrnhNhp.getContentPane().add(lblTrangThai);
		
		JButton btnThem = new JButton("Thêm tên mới");
		btnThem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				themVaoDanhSach(dsTen);
			}
		});
		
		btnThem.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnThem.setBounds(534, 36, 157, 32);
		frmChngTrnhNhp.getContentPane().add(btnThem);
		
//		JButton btnHienDS = new JButton("Hiện danh sách");
//		btnHienDS.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				hienDanhSach(dsTen);
//			}
//		});
		
//		btnHienDS.setFont(new Font("Tahoma", Font.PLAIN, 14));
//		btnHienDS.setBounds(320, 107, 134, 32);
//		frmChngTrnhNhp.getContentPane().add(btnHienDS);
		
		txtHienDanhSach = new JTextArea();
		txtHienDanhSach.setEditable(false);
		txtHienDanhSach.setBounds(184, 145, 414, 258);
		frmChngTrnhNhp.getContentPane().add(txtHienDanhSach);
		
		JButton btnNewButton = new JButton("Xóa tên vừa thêm");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dsTen.remove(dsTen.size()-1);
				hienThiDanhSach(dsTen);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(534, 91, 157, 32);
		frmChngTrnhNhp.getContentPane().add(btnNewButton);
		
	}
	
	void themVaoDanhSach(ArrayList<String> a) {
		String hoten = txtHoVaTen.getText();
		a.add(hoten);
		txtHoVaTen.setText("");
		lblTrangThai.setText("Thêm thành công");
		
		txtHienDanhSach.setText("");
		for (int index = 0; index <a.size();index++) {
			txtHienDanhSach.append("\n" + a.get(index));
		}

	}
	void hienThiDanhSach(ArrayList<String> a) {
		txtHienDanhSach.setText("");
		for (int index = 0; index <a.size();index++) {
			txtHienDanhSach.append("\n" + a.get(index));
		}
	}
}
