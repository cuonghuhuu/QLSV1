package view;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.Action;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import controller.QLSVController;
import model.QLSVModel;
import model.ThiSinh;
import model.Tinh;

public class QLSVView extends JFrame {

	private JPanel contentPane;
	public QLSVModel model;
	public JTextField textField_MaSinhVien;
	public JTable table;
	public JTextField textField_iD;
	public JTextField textField_HoVaTen;
	public JTextField textField_NgaySinh;
	public JTextField textField_Java;
	public JTextField textField_Database;
	public JTextField textField_C;
	public JComboBox comboBox_QueQuan_1;
	public ButtonGroup btn_gioitinh;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QLSVView frame = new QLSVView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public QLSVView() {

		Action action = new QLSVController(this);
		this.model = new QLSVModel();

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu menuFile = new JMenu("File");
		menuFile.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 20));
		menuBar.add(menuFile);

		JMenuItem menuOpen = new JMenuItem("Open");
		menuOpen.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		menuFile.add(menuOpen);

		JMenuItem menuClose = new JMenuItem("Close");
		menuClose.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		menuFile.add(menuClose);

		JSeparator separator = new JSeparator();
		menuFile.add(separator);

		JMenuItem menuExit = new JMenuItem("Exit");
		menuExit.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		menuFile.add(menuExit);

		JMenu menuAbout = new JMenu("About");
		menuAbout.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		menuBar.add(menuAbout);

		JMenuItem mntmNewMenuItem = new JMenuItem("About me");
		mntmNewMenuItem.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		menuAbout.add(mntmNewMenuItem);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 907, 737);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel Label_QueQuan = new JLabel("Quê Quán");
		Label_QueQuan.setFont(new Font("Tahoma", Font.PLAIN, 18));
		Label_QueQuan.setBounds(10, 17, 79, 36);
		contentPane.add(Label_QueQuan);

		JLabel lblMThSinh = new JLabel("Mã Thí Sinh");
		lblMThSinh.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblMThSinh.setBounds(408, 17, 102, 36);
		contentPane.add(lblMThSinh);

		textField_MaSinhVien = new JTextField();
		textField_MaSinhVien.setFont(new Font("Tahoma", Font.PLAIN, 19));
		textField_MaSinhVien.setColumns(10);
		textField_MaSinhVien.setBounds(520, 11, 206, 47);
		contentPane.add(textField_MaSinhVien);

		JButton btnNewButton = new JButton("Tìm");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(751, 16, 94, 36);
		contentPane.add(btnNewButton);

		JComboBox comboBox_QueQuanTimKiem = new JComboBox();
		ArrayList<Tinh> listTinh = Tinh.getDSTinh();
		comboBox_QueQuanTimKiem.addItem("");
		for (Tinh tinh : listTinh) {
			comboBox_QueQuanTimKiem.addItem(tinh.getTenTinh());
		}
		comboBox_QueQuanTimKiem.setBounds(99, 11, 188, 47);
		contentPane.add(comboBox_QueQuanTimKiem);

		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 69, 851, 2);
		contentPane.add(separator_1);

		JLabel Label_DanhSachThiSinh = new JLabel("Danh Sách Thí Sinh");
		Label_DanhSachThiSinh.setFont(new Font("Tahoma", Font.PLAIN, 18));
		Label_DanhSachThiSinh.setBounds(10, 82, 159, 36);
		contentPane.add(Label_DanhSachThiSinh);

		table = new JTable();
		table.setFont(new Font("Tahoma", Font.PLAIN, 16));
		table.setModel(new DefaultTableModel(new Object[][] {},
				new String[] { " M\u00E3 th\u00ED sinh ", " H\u1ECD t\u00EAn ", " Qu\u00EA Qu\u00E1n ",
						"Gi\u1EDBi T\u00EDnh", "Ng\u00E0y Sinh", " DATABASE", " JAVA OOP ", " C++ " }));

		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(10, 129, 851, 141);
		contentPane.add(scrollPane);

		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBounds(0, 292, 861, 2);
		contentPane.add(separator_1_1);

		JLabel Label_ThongTinThiSinh = new JLabel("Thông Tin Thí Sinh");
		Label_ThongTinThiSinh.setFont(new Font("Tahoma", Font.PLAIN, 18));
		Label_ThongTinThiSinh.setBounds(10, 307, 159, 36);
		contentPane.add(Label_ThongTinThiSinh);

		JLabel lable_iD = new JLabel("Mã Thí Sinh");
		lable_iD.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lable_iD.setBounds(10, 340, 102, 36);
		contentPane.add(lable_iD);

		textField_iD = new JTextField();
		textField_iD.setFont(new Font("Tahoma", Font.PLAIN, 19));
		textField_iD.setColumns(10);
		textField_iD.setBounds(113, 340, 206, 36);
		contentPane.add(textField_iD);

		JLabel lable_HoVaTen = new JLabel("Họ Và Tên ");
		lable_HoVaTen.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lable_HoVaTen.setBounds(10, 401, 102, 36);
		contentPane.add(lable_HoVaTen);

		textField_HoVaTen = new JTextField();
		textField_HoVaTen.setFont(new Font("Tahoma", Font.PLAIN, 19));
		textField_HoVaTen.setColumns(10);
		textField_HoVaTen.setBounds(113, 401, 206, 36);
		contentPane.add(textField_HoVaTen);

		JLabel lable_QueQuan = new JLabel("Quê Quán");
		lable_QueQuan.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lable_QueQuan.setBounds(10, 463, 102, 36);
		contentPane.add(lable_QueQuan);

		comboBox_QueQuan_1 = new JComboBox();
		comboBox_QueQuan_1.addItem("");
		for (Tinh tinh : listTinh) {
			comboBox_QueQuan_1.addItem(tinh.getTenTinh());
		}
		comboBox_QueQuan_1.setBounds(113, 463, 206, 36);
		contentPane.add(comboBox_QueQuan_1);

		JLabel lable_NgaySinh = new JLabel("Ngày Sinh");
		lable_NgaySinh.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lable_NgaySinh.setBounds(10, 521, 102, 36);
		contentPane.add(lable_NgaySinh);

		textField_NgaySinh = new JTextField();
		textField_NgaySinh.setFont(new Font("Tahoma", Font.PLAIN, 19));
		textField_NgaySinh.setColumns(10);
		textField_NgaySinh.setBounds(113, 521, 206, 36);
		contentPane.add(textField_NgaySinh);

		JRadioButton rdbtn_Nam = new JRadioButton("Nam");
		rdbtn_Nam.setFont(new Font("Tahoma", Font.PLAIN, 16));
		rdbtn_Nam.setBounds(751, 343, 59, 33);
		contentPane.add(rdbtn_Nam);

		JLabel lable_GioiTinh = new JLabel("Giới Tính");
		lable_GioiTinh.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lable_GioiTinh.setBounds(520, 340, 102, 36);
		contentPane.add(lable_GioiTinh);

		JRadioButton rdbtn_nu = new JRadioButton("Nữ");
		rdbtn_nu.setFont(new Font("Tahoma", Font.PLAIN, 16));
		rdbtn_nu.setBounds(653, 343, 59, 33);
		contentPane.add(rdbtn_nu);

		btn_gioitinh = new ButtonGroup();
		btn_gioitinh.add(rdbtn_Nam);
		btn_gioitinh.add(rdbtn_nu);

		JSeparator separator_1_2 = new JSeparator();
		separator_1_2.setBounds(10, 568, 851, 2);
		contentPane.add(separator_1_2);

		JButton btnNewButton_Them = new JButton("Thêm");
		btnNewButton_Them.addActionListener(action);
		btnNewButton_Them.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_Them.setBounds(18, 576, 94, 36);
		contentPane.add(btnNewButton_Them);

		JButton btnNewButton_Xoa = new JButton("Xóa");
		btnNewButton_Xoa.addActionListener(action);
		btnNewButton_Xoa.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_Xoa.setBounds(193, 576, 94, 36);
		contentPane.add(btnNewButton_Xoa);

		JButton btnNewButton_Luu = new JButton("Lưu");
		btnNewButton_Luu.addActionListener(action);
		btnNewButton_Luu.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_Luu.setBounds(566, 576, 94, 36);
		contentPane.add(btnNewButton_Luu);

		JLabel lable_Java = new JLabel("Java");
		lable_Java.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lable_Java.setBounds(520, 401, 42, 36);
		contentPane.add(lable_Java);

		textField_Java = new JTextField();
		textField_Java.setFont(new Font("Tahoma", Font.PLAIN, 19));
		textField_Java.setColumns(10);
		textField_Java.setBounds(604, 401, 206, 36);
		contentPane.add(textField_Java);

		textField_Database = new JTextField();
		textField_Database.setFont(new Font("Tahoma", Font.PLAIN, 19));
		textField_Database.setColumns(10);
		textField_Database.setBounds(604, 463, 206, 36);
		contentPane.add(textField_Database);

		textField_C = new JTextField();
		textField_C.setFont(new Font("Tahoma", Font.PLAIN, 19));
		textField_C.setColumns(10);
		textField_C.setBounds(604, 521, 206, 36);
		contentPane.add(textField_C);

		JLabel lable_Java_1 = new JLabel("Database");
		lable_Java_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lable_Java_1.setBounds(520, 463, 74, 36);
		contentPane.add(lable_Java_1);

		JLabel lable_C = new JLabel("C++");
		lable_C.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lable_C.setBounds(520, 521, 42, 36);
		contentPane.add(lable_C);

		JButton btnNewButton_HuyBo = new JButton("Hủy Bỏ");
		btnNewButton_HuyBo.addActionListener(action);
		btnNewButton_HuyBo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_HuyBo.setBounds(716, 576, 94, 36);
		contentPane.add(btnNewButton_HuyBo);

		JButton btnNewButton_CapNhat = new JButton("Cập Nhật");
		btnNewButton_CapNhat.addActionListener(action);

		btnNewButton_CapNhat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_CapNhat.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_CapNhat.setBounds(377, 576, 115, 36);
		contentPane.add(btnNewButton_CapNhat);

	}

	public void xoaFrom() {
		textField_iD.setText("");
		textField_HoVaTen.setText("");
		textField_MaSinhVien.setText("");
		textField_NgaySinh.setText("");
		textField_C.setText("");
		textField_Database.setText("");
		textField_Java.setText("");
		comboBox_QueQuan_1.setSelectedIndex(-1);
		btn_gioitinh.clearSelection();
	}

	public void themThiSinh(ThiSinh ts) {
		this.model.insert(ts);
		DefaultTableModel model_table = (DefaultTableModel) table.getModel();
		model_table.addRow(new Object[] { ts.getMaThiSinh() + "", ts.getTenThiSinh() + "",
				ts.getTinhQueQuan().getTenTinh(), (ts.isGioiTinh() ? "Nam " : "Nữ"),
				ts.getNgaySinh().getDate() + "/" + (ts.getNgaySinh().getMonth() + 1) + "/"
						+ (ts.getNgaySinh().getYear() + 1900),
				ts.getDiemMon1() + "", ts.getDiemMon3() + "", ts.getDiemMon3() + ""

		});

	}

	public void capNhatThiSinh(ThiSinh ts) {

	}

	public void hienThiThongTinThiSinhDaChon() {
		DefaultTableModel model_table = (DefaultTableModel) table.getModel();
		int i_row = table.getSelectedRow();

		int maThiSinh = Integer.valueOf(model_table.getValueAt(i_row, 0) + "");
		String tenThiSinh = model_table.getValueAt(i_row, 1) + "";
		Tinh tinh = Tinh.getTinhByTen(model_table.getValueAt(i_row, 2) + "");
		String textGioiTinh = model_table.getValueAt(i_row, 3) + "";
		boolean gioiTinh = textGioiTinh.equals("Nam");
		String s_ngaySinh = model_table.getValueAt(i_row, 4) + "";
		Date ngaySinh = new Date(s_ngaySinh);
		float diemMon1 = Float.valueOf(model_table.getValueAt(i_row, 5) + "");
		float diemMon2 = Float.valueOf(model_table.getValueAt(i_row, 6) + "");
		float diemMon3 = Float.valueOf(model_table.getValueAt(i_row, 7) + "");

		this.textField_iD.setText(maThiSinh + "");
		this.textField_HoVaTen.setText(tenThiSinh + "");
		this.comboBox_QueQuan_1.setSelectedItem(tinh.getTenTinh());
		// this.btn_gioitinh.setSelected(null, gioiTinh);
		this.textField_NgaySinh.setText(s_ngaySinh + "");
		this.textField_Database.setText(diemMon1 + "");
		this.textField_Java.setText(diemMon2 + "");
		this.textField_C.setText(diemMon3 + "");

	}

}
