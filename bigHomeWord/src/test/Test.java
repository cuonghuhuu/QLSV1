package test;

import javax.swing.UIManager;

import view.QLSVView;

public class Test {

	public static void main(String[] args) {
		try {
			// Thiết lập LookAndFeel của hệ thống
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

			// Khởi tạo giao diện QLSVView
			QLSVView frame = new QLSVView();
			frame.setVisible(true);

		} catch (Exception e) {
			e.printStackTrace(); // In ra lỗi nếu có vấn đề xảy ra
		}
	}

}
