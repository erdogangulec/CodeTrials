package hesapMak;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Color;

public class hsp extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	
	int s1, s2,sonuc,m;
	int islem;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					hsp frame = new hsp();
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
	public hsp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 287, 309);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setFont(new Font("Tahoma", Font.BOLD, 15));
		textField.setBounds(10, 25, 248, 50);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton b0 = new JButton("0");
		b0.setFont(new Font("Tahoma", Font.BOLD, 16));
		b0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"0");
			}
		});
		b0.setBounds(64, 236, 56, 29);
		contentPane.add(b0);
		
		JButton b2 = new JButton("2");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"2");
			}
		});
		b2.setFont(new Font("Tahoma", Font.BOLD, 16));
		b2.setBounds(64, 209, 56, 29);
		contentPane.add(b2);
		
		JButton b1 = new JButton("1");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"1");
			}
		});
		b1.setFont(new Font("Tahoma", Font.BOLD, 16));
		b1.setBounds(10, 209, 56, 29);
		contentPane.add(b1);
		
		JButton b3 = new JButton("3");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"3");
			}
		});
		b3.setFont(new Font("Tahoma", Font.BOLD, 16));
		b3.setBounds(118, 209, 56, 29);
		contentPane.add(b3);
		
		JButton b4 = new JButton("4");
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"4");
			}
		});
		b4.setFont(new Font("Tahoma", Font.BOLD, 16));
		b4.setBounds(10, 185, 56, 29);
		contentPane.add(b4);
		
		JButton b5 = new JButton("5");
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"5");
			}
		});
		b5.setFont(new Font("Tahoma", Font.BOLD, 16));
		b5.setBounds(64, 185, 56, 29);
		contentPane.add(b5);
		
		JButton b6 = new JButton("6");
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"6");
			}
		});
		b6.setFont(new Font("Tahoma", Font.BOLD, 16));
		b6.setBounds(118, 185, 56, 29);
		contentPane.add(b6);
		
		JButton b7 = new JButton("7");
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"7");
			}
		});
		b7.setFont(new Font("Tahoma", Font.BOLD, 16));
		b7.setBounds(10, 158, 56, 29);
		contentPane.add(b7);
		
		JButton b8 = new JButton("8");
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"8");
			}
		});
		b8.setFont(new Font("Tahoma", Font.BOLD, 16));
		b8.setBounds(64, 158, 56, 29);
		contentPane.add(b8);
		
		JButton b9 = new JButton("9");
		b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"9");
			}
		});
		b9.setFont(new Font("Tahoma", Font.BOLD, 16));
		b9.setBounds(118, 158, 56, 29);
		contentPane.add(b9);
		
		JButton bes = new JButton("=");
		bes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s2 = Integer.parseInt(textField.getText());
				if (islem==1) {
					sonuc = s1 + s2;
					textField.setText(Integer.toString(sonuc));					
				}else if(islem==2) {
					sonuc = s1 - s2;
					textField.setText(Integer.toString(sonuc));					
				}else if(islem==3) {
					sonuc = s1 * s2;
					textField.setText(Integer.toString(sonuc));		
				}else if(islem==4) {
					sonuc = s1 / s2;
					textField.setText(Integer.toString(sonuc));	
				}
				 
			
			}
		});
		bes.setForeground(Color.BLUE);
		bes.setFont(new Font("Tahoma", Font.BOLD, 20));
		bes.setBounds(173, 236, 85, 29);
		contentPane.add(bes);
		
		JButton bt = new JButton("+");
		bt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s1 = Integer.parseInt(textField.getText());
				islem = 1;
				textField.setText("");
			}
		});
		bt.setFont(new Font("Tahoma", Font.BOLD, 20));
		bt.setBounds(173, 209, 85, 29);
		contentPane.add(bt);
		
		JButton bc = new JButton("-");
		bc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s1 = Integer.parseInt(textField.getText());
				islem = 2;
				textField.setText("");
			}
		});
		bc.setFont(new Font("Tahoma", Font.BOLD, 20));
		bc.setBounds(173, 185, 85, 29);
		contentPane.add(bc);
		
		JButton bcr = new JButton("x");
		bcr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s1 = Integer.parseInt(textField.getText());
				islem = 3;
				textField.setText("");
			}
		});
		bcr.setFont(new Font("Tahoma", Font.BOLD, 20));
		bcr.setBounds(173, 158, 85, 29);
		contentPane.add(bcr);
		
		JButton bb = new JButton("/");
		bb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s1 = Integer.parseInt(textField.getText());
				islem = 4;
				textField.setText("");
			}
		});
		bb.setFont(new Font("Tahoma", Font.BOLD, 20));
		bb.setBounds(173, 132, 85, 29);
		contentPane.add(bb);
		
		JButton btnM = new JButton("M");
		btnM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				m = Integer.parseInt(textField.getText());
			
			}
		});
		btnM.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnM.setBounds(10, 132, 56, 29);
		contentPane.add(btnM);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");		
			}
		});
		btnC.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnC.setBounds(118, 132, 59, 29);
		contentPane.add(btnC);
		
		JButton nok = new JButton(".");
		nok.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+".");
			}
		});
		nok.setFont(new Font("Tahoma", Font.BOLD, 16));
		nok.setBounds(10, 236, 56, 29);
		contentPane.add(nok);
		
		JButton btnMa = new JButton("M+");
		btnMa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(Integer.toString(m));	
			
			}
		});
		btnMa.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnMa.setBounds(64, 132, 56, 29);
		contentPane.add(btnMa);
	}
}
