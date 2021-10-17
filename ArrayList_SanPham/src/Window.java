import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Window {

	private JFrame frmChngTrnh;
	private JTextField txtThemMaSP;
	private JTextField txtThemTenSP;
	private JTextField txtThemDonGia;
	private JTextField txtXoaSP;
	private JTextField txtTimSP;
	private JTextField textMaSP_Sua;
	private JTextField textTenSP_Sua;
	private JTextArea txtHienDS;
	private ArrayList<SanPham> dsSP = new ArrayList<SanPham>(0);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window window = new Window();
					window.frmChngTrnh.setVisible(true);
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
		frmChngTrnh = new JFrame();
		frmChngTrnh.setTitle("Chương trình quản lý sản phẩm");
		frmChngTrnh.setBounds(380, 190, 820, 440);
		frmChngTrnh.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmChngTrnh.getContentPane().setLayout(null);
		
		JPanel panel_TMSP = new JPanel();
		panel_TMSP.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Th\u00EAm m\u1EDBi s\u1EA3n ph\u1EA9m", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_TMSP.setBounds(20, 22, 370, 214);
		frmChngTrnh.getContentPane().add(panel_TMSP);
		panel_TMSP.setLayout(null);
		
		JLabel lblThemMaSP = new JLabel("Nhập mã sản phẩm :");
		lblThemMaSP.setBounds(28, 33, 126, 23);
		panel_TMSP.add(lblThemMaSP);
		
		JLabel lblThemTenSP = new JLabel("Nhập tên sản phẩm :");
		lblThemTenSP.setBounds(28, 75, 126, 23);
		panel_TMSP.add(lblThemTenSP);
		
		JLabel lblThemDonGia = new JLabel("Nhập giá sản phẩm :");
		lblThemDonGia.setBounds(28, 119, 126, 23);
		panel_TMSP.add(lblThemDonGia);
		
		txtThemMaSP = new JTextField();
		txtThemMaSP.setBounds(164, 32, 176, 25);
		panel_TMSP.add(txtThemMaSP);
		txtThemMaSP.setColumns(10);
		
		txtThemTenSP = new JTextField();
		txtThemTenSP.setColumns(10);
		txtThemTenSP.setBounds(164, 77, 176, 25);
		panel_TMSP.add(txtThemTenSP);
		
		txtThemDonGia = new JTextField();
		txtThemDonGia.setColumns(10);
		txtThemDonGia.setBounds(164, 118, 176, 25);
		panel_TMSP.add(txtThemDonGia);
		
		JButton btnNewButton = new JButton("Thêm sản phẩm");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				themVaoDanhSach(dsSP);
			}
		});
		btnNewButton.setBounds(132, 159, 132, 31);
		panel_TMSP.add(btnNewButton);
		
		JPanel panel_TKSP = new JPanel();
		panel_TKSP.setBorder(new TitledBorder(null, "T\u00ECm ki\u1EBFm s\u1EA3n ph\u1EA9m", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		panel_TKSP.setBounds(20, 261, 238, 135);
		frmChngTrnh.getContentPane().add(panel_TKSP);
		panel_TKSP.setLayout(null);
		
		JLabel lblTKSP = new JLabel("Nhập mã SP :");
		lblTKSP.setBounds(10, 31, 85, 23);
		panel_TKSP.add(lblTKSP);
		
		txtTimSP = new JTextField();
		txtTimSP.setColumns(10);
		txtTimSP.setBounds(97, 28, 131, 25);
		panel_TKSP.add(txtTimSP);
		
		JButton btnTimKiem = new JButton("Tìm kiếm");
		btnTimKiem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String maSPTK = txtTimSP.getText();
				txtTimSP.setText("");
				
				String temp = "Không tìm thấy sản phẩm bạn muốn trong danh sách";
				JFrame frame = new JFrame("JOptionPane showMessageDialog example");
				
				for (int i = 0; i < dsSP.size(); i++) 
					if (dsSP.get(i).getMaSP().equals(maSPTK))
					{ 
						temp = "Thông tin sản phẩm : Mã SP "  + dsSP.get(i).getMaSP() + " -----" 
													+ " Tên SP " + dsSP.get(i).getTenSP() + " -----"
													+  "Giá "    + dsSP.get(i).getDonGia() ;
						break;
					}
					else 
						temp = "Không tìm thấy sản phẩm bạn muốn trong danh sách";

				JOptionPane.showMessageDialog(frame,
			                temp,
			                "Kết quả tìm kiếm",
			                JOptionPane.INFORMATION_MESSAGE);
			}
		});
		btnTimKiem.setBounds(76, 80, 85, 30);
		panel_TKSP.add(btnTimKiem);
		
		JPanel panel_XSP = new JPanel();
		panel_XSP.setBorder(new TitledBorder(null, "X\u00F3a s\u1EA3n ph\u1EA9m", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		panel_XSP.setBounds(283, 261, 244, 135);
		frmChngTrnh.getContentPane().add(panel_XSP);
		panel_XSP.setLayout(null);
		
		JLabel lblXSP = new JLabel("Nhập mã SP :");
		lblXSP.setBounds(10, 31, 84, 23);
		panel_XSP.add(lblXSP);
		
		txtXoaSP = new JTextField();
		txtXoaSP.setBounds(104, 29, 130, 25);
		txtXoaSP.setColumns(10);
		panel_XSP.add(txtXoaSP);
		
		JButton btnXoa = new JButton("Xóa sản phẩm");
		btnXoa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String maSPX = txtXoaSP.getText();
				txtXoaSP.setText("");
				
				String temp = "Sản phẩm không tồn tại trong danh sách";
				JFrame frame = new JFrame("JOptionPane showMessageDialog example");
				
				for (int i = 0; i < dsSP.size(); i++) 
					if (dsSP.get(i).getMaSP().equals(maSPX))
					{ 
						dsSP.remove(i);
						temp = "Đã xóa thành công";
						hienThiDanhSach(dsSP);
						break;
					}
				
				JOptionPane.showMessageDialog(frame,
			                temp,
			                "Kết quả xóa",
			                JOptionPane.INFORMATION_MESSAGE);
			}
		});
		btnXoa.setBounds(68, 81, 112, 30);
		panel_XSP.add(btnXoa);
		
		JPanel panel_STSP = new JPanel();
		panel_STSP.setBorder(new TitledBorder(null, "S\u1EEDa t\u00EAn s\u1EA3n ph\u1EA9m", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		panel_STSP.setBounds(552, 261, 238, 135);
		frmChngTrnh.getContentPane().add(panel_STSP);
		panel_STSP.setLayout(null);
		
		JLabel lblSTSP = new JLabel("Nhập mã SP :");
		lblSTSP.setBounds(10, 31, 97, 23);
		panel_STSP.add(lblSTSP);
		
		textMaSP_Sua = new JTextField();
		textMaSP_Sua.setColumns(10);
		textMaSP_Sua.setBounds(118, 30, 110, 25);
		panel_STSP.add(textMaSP_Sua);
		
		JLabel lblSTSP2 = new JLabel("Nhập tên mới SP:");
		lblSTSP2.setBounds(10, 64, 106, 23);
		panel_STSP.add(lblSTSP2);
		
		textTenSP_Sua = new JTextField();
		textTenSP_Sua.setColumns(10);
		textTenSP_Sua.setBounds(118, 64, 110, 25);
		panel_STSP.add(textTenSP_Sua);
		
		JButton btnSuaTen = new JButton("Sửa tên SP");
		btnSuaTen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String maSP = textMaSP_Sua.getText();
				textMaSP_Sua.setText("");
				
				String tenSP = textTenSP_Sua.getText();
				textTenSP_Sua.setText("");
				
				String temp = "Sản phẩm không tồn tại trong danh sách";
				JFrame frame = new JFrame("JOptionPane showMessageDialog example");
				
				for (int i = 0; i < dsSP.size(); i++) 
					if (dsSP.get(i).getMaSP().equals(maSP))
					{ 
						dsSP.get(i).setTenSP(tenSP);
						temp = "Đã sửa thành công";
						hienThiDanhSach(dsSP);
						break;
					}
				
				JOptionPane.showMessageDialog(frame,
			                temp,
			                "Kết quả sửa tên sản phẩm",
			                JOptionPane.INFORMATION_MESSAGE);
			}
		});
		btnSuaTen.setBounds(69, 94, 106, 29);
		panel_STSP.add(btnSuaTen);
		
		JPanel panel_DSSP = new JPanel();
		panel_DSSP.setBorder(new TitledBorder(null, "Danh s\u00E1ch s\u1EA3n ph\u1EA9m", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		panel_DSSP.setBounds(413, 22, 377, 214);
		frmChngTrnh.getContentPane().add(panel_DSSP);
		panel_DSSP.setLayout(null);
		
		txtHienDS = new JTextArea();
		txtHienDS.setEditable(false);
		txtHienDS.setBounds(32, 21, 308, 176);
		panel_DSSP.add(txtHienDS);
	}
	void themVaoDanhSach(ArrayList<SanPham> ds) {
		String a = txtThemMaSP.getText();
		boolean kt = true;
		JFrame frame = new JFrame("JOptionPane showMessageDialog example");
		
		for (int i = 0; i < dsSP.size(); i++) 
			if (dsSP.get(i).getMaSP().equals(a))
			{ 
				kt=false;
				break;
			}
		
		if (kt == false) 
		{
			txtThemMaSP.setText("");
			txtThemTenSP.setText("");
			txtThemDonGia.setText("");
			JOptionPane.showMessageDialog(frame,
                "Mã SP đã tồn tại, vui lòng nhập lại!",
                "Kết quả xóa",
                JOptionPane.INFORMATION_MESSAGE);
		}
		else 
		{
			String  b = txtThemTenSP.getText();
			Double  c = Double.parseDouble(txtThemDonGia.getText());
			SanPham d = new SanPham(a,b,c);
			ds.add(d);
			
			txtThemMaSP.setText("");
			txtThemTenSP.setText("");
			txtThemDonGia.setText("");
			txtHienDS.setText("");
			int st = 0;
			if (ds.size()>= 11) st= ds.size() - 10;
				for (int index = st; index <ds.size();index++) 
				{
					txtHienDS.append( " Mã SP: "  + ds.get(index).getMaSP() + " -----" 
								+ " Tên SP: " + ds.get(index).getTenSP() + " -----"
								+ " Giá: "    + ds.get(index).getDonGia() + "\n" );
				}
		}

	}
	void hienThiDanhSach(ArrayList<SanPham> ds) {
		txtHienDS.setText("");
		for (int index = 0; index <ds.size();index++) {
			txtHienDS.append( " Mã SP: "  + ds.get(index).getMaSP() + " -----" 
							+ " Tên SP: " + ds.get(index).getTenSP() + " -----"
							+ " Giá: "    + ds.get(index).getDonGia() + "\n" );
		}

	}
}
