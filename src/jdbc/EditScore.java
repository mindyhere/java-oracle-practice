package jdbc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class EditScore extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfStudentNo;
	private JTextField tfName;
	private JTextField tfKor;
	private JTextField tfEng;
	private JTextField tfMat;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public EditScore(ScoreMain parent, ScoreDTO dto) {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 295, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lbl1 = new JLabel("학번");
		lbl1.setBounds(12, 26, 57, 15);
		contentPane.add(lbl1);

		JLabel lbl2 = new JLabel("이름");
		lbl2.setBounds(12, 61, 57, 15);
		contentPane.add(lbl2);

		JLabel lbl3 = new JLabel("국어");
		lbl3.setBounds(12, 99, 57, 15);
		contentPane.add(lbl3);

		JLabel lbl4 = new JLabel("영어");
		lbl4.setBounds(12, 141, 57, 15);
		contentPane.add(lbl4);

		JLabel lbl5 = new JLabel("수학");
		lbl5.setBounds(12, 179, 57, 15);
		contentPane.add(lbl5);

		tfStudentNo = new JTextField();
		tfStudentNo.setBounds(105, 23, 116, 21);
		contentPane.add(tfStudentNo);
		tfStudentNo.setColumns(10);

		tfName = new JTextField();
		tfName.setBounds(105, 58, 116, 21);
		contentPane.add(tfName);
		tfName.setColumns(10);

		tfKor = new JTextField();
		tfKor.setBounds(105, 96, 116, 21);
		contentPane.add(tfKor);
		tfKor.setColumns(10);

		tfEng = new JTextField();
		tfEng.setBounds(105, 138, 116, 21);
		contentPane.add(tfEng);
		tfEng.setColumns(10);

		tfMat = new JTextField();
		tfMat.setBounds(105, 176, 116, 21);
		contentPane.add(tfMat);
		tfMat.setColumns(10);

		JButton btnUpdate = new JButton("수정");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ScoreDAO dao = new ScoreDAO();
				String student_no = tfStudentNo.getText();
				String name = tfName.getText();
				int kor = Integer.valueOf(tfKor.getText());
				int eng = Integer.valueOf(tfEng.getText());
				int mat = Integer.valueOf(tfMat.getText());
				dao.updateScore(new ScoreDTO(student_no, name, kor, eng, mat));
				JOptionPane.showMessageDialog(EditScore.this, "수정되었습니다.");
				parent.refreshTable();
				dispose();
			}
		});
		btnUpdate.setBounds(31, 216, 97, 23);
		contentPane.add(btnUpdate);

		tfStudentNo.setText(dto.getStudent_no());
		tfName.setText(dto.getName());
//		텍스트필드.setText(스트링);
		tfKor.setText(dto.getKor() + "");
//						             "" : 숫자 => 문자열로 변환
		tfEng.setText(dto.getEng() + "");
		tfMat.setText(dto.getMat() + "");

		JButton btnDelete = new JButton("삭제");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnDelete.setBounds(140, 216, 97, 23);
		contentPane.add(btnDelete);
	}

}
