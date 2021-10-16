package Vidu1;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
	private JTextField txtHoTenTK;


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
		lblTrangThai.setBounds(401, 79, 101, 13);
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
		
		JButton btnTimKiem = new JButton("Tìm kiếm");
		btnTimKiem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String hotentk = txtHoTenTK.getText();
				JFrame frame = new JFrame("JOptionPane showMessageDialog example");
				String temp = "Bạn chưa nhập bất cứ tên nào";
				int listLength = dsTen.size();
				
				txtHoTenTK.setText("");
				
				for (int i = 0; i < listLength; i++) 
					if (dsTen.get(i).equals(hotentk))
					{ 
						if (hotentk!="") temp = "Tìm thấy tên ở vị trí thứ " + String.valueOf(i+1) + " trong danh sách !";
						break;
					}
					else 
						temp = "Không tìm thấy tên bạn muốn trong danh sách";
				
		        JOptionPane.showMessageDialog(frame,
		                temp,
		                "Kết quả tìm kiếm",
		                JOptionPane.INFORMATION_MESSAGE);
			}
		});
		
		btnTimKiem.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnTimKiem.setBounds(534, 97, 157, 32);
		frmChngTrnhNhp.getContentPane().add(btnTimKiem);
		
		txtHienDanhSach = new JTextArea();
		txtHienDanhSach.setEditable(false);
		txtHienDanhSach.setBounds(184, 162, 414, 241);
		frmChngTrnhNhp.getContentPane().add(txtHienDanhSach);
		
		JButton btnXoaTen = new JButton("Xóa tên vừa thêm");
		btnXoaTen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dsTen.remove(dsTen.size()-1);
				hienThiDanhSach(dsTen);
			}
		});
		btnXoaTen.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnXoaTen.setBounds(608, 162, 157, 38);
		frmChngTrnhNhp.getContentPane().add(btnXoaTen);
		
		JLabel lblHoTenTK = new JLabel("Nhập họ tên muốn tìm kiếm:");
		lblHoTenTK.setHorizontalAlignment(SwingConstants.CENTER);
		lblHoTenTK.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblHoTenTK.setBounds(71, 100, 196, 27);
		frmChngTrnhNhp.getContentPane().add(lblHoTenTK);
		
		txtHoTenTK = new JTextField();
		txtHoTenTK.setBounds(277, 97, 225, 32);
		frmChngTrnhNhp.getContentPane().add(txtHoTenTK);
		txtHoTenTK.setColumns(10);
		
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
