import javax.swing.*;
import java.awt.*;
public class a_java1{
	public static void main(String[]args){
		JFrame frame = new JFrame();
		frame.setBounds(200,200,500,300);
		frame.setTitle("My frame");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

		JButton btn = new JButton();
		btn.setBounds(200,120,120,30);
		btn.setText("Submit");
		btn.setForeground(Color.WHITE);
		btn.setBackground(Color.BLACK);
		frame.add(btn);
		frame.setLayout(null);

		Container c = frame.getContentPane();
		c.setBackground(Color.GRAY);
	}
}