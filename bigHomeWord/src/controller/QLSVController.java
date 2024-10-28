package controller;

import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.util.Date;

import javax.swing.Action;
import javax.swing.JOptionPane;

import model.ThiSinh;
import model.Tinh;
import view.QLSVView;

public class QLSVController implements Action {
	public QLSVView view;

	@Override
	public void actionPerformed(ActionEvent e) {
		String cm = e.getActionCommand();
		JOptionPane.showMessageDialog(view, " bạn vừa nhấn vào " + cm);
		if (cm.equals("Thêm")) {
			this.view.xoaFrom();
			this.view.model.setLuaChon("Thêm");
		} else if (cm.equals("Lưu")) {
			try {
				int maThiSinh = Integer.valueOf(this.view.textField_iD.getText());
				String tenThiSinh = this.view.textField_HoVaTen.getText();
				int tinhQueQuan = this.view.comboBox_QueQuan_1.getSelectedIndex();
				Tinh tinh = Tinh.getTinhById(tinhQueQuan);
				Date ngaySinh = new Date(this.view.textField_NgaySinh.getText());
				boolean gioiTinh = true;
				String chonGioiTinh = this.view.btn_gioitinh.getSelection() + "";
				if (chonGioiTinh.equals("Nam")) {
					gioiTinh = true;
				} else if (chonGioiTinh.equals("Nữ")) {
					gioiTinh = false;
				}
				float diemMon1 = Float.valueOf(this.view.textField_Java.getText());
				float diemMon2 = Float.valueOf(this.view.textField_Database.getText());
				float diemMon3 = Float.valueOf(this.view.textField_C.getText());

				ThiSinh ts = new ThiSinh(maThiSinh, tenThiSinh, tinh, ngaySinh, gioiTinh, diemMon1, diemMon2, diemMon3);

				if (this.view.model.getLuaChon().equals("") || this.view.model.getLuaChon().equals("Thêm")) {
					this.view.themThiSinh(ts);
					;
				} else if (this.view.model.getLuaChon().equals("Cập Nhật")) {
					this.view.capNhatThiSinh(ts);
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}

		} else if (cm.equals("")) {

		}

	}

	public QLSVController(QLSVView view) {
		super();
		this.view = view;
	}

	@Override
	public Object getValue(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void putValue(String key, Object value) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setEnabled(boolean b) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void addPropertyChangeListener(PropertyChangeListener listener) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removePropertyChangeListener(PropertyChangeListener listener) {
		// TODO Auto-generated method stub

	}

}
