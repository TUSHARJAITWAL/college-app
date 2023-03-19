import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Myframe extends JFrame implements ActionListener{
	Container c;
	JLabel label1,label2;
	JTextField user;
	JPasswordField pass;
	JButton btn;
	JButton b;

	Myframe(){
		setTitle("LoginForm");
		setBounds(100,100,400,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		c = getContentPane();
		c.setBackground(Color.GRAY);
		c.setLayout(null);

		label1 = new JLabel("Username");
		label2 = new JLabel("Password");

		label1.setBounds(10,50,100,20);
		label2.setBounds(10,100,100,20);

		c.add(label1);
		c.add(label2);

		user = new JTextField();
		user.setBounds(120,50,150,20);
		c.add(user);

		pass = new JPasswordField();
		pass.setBounds(120,100,150,20);
		c.add(pass);

		btn = new JButton("Login");
		btn.setBounds(130,150,100,30);
		btn.setForeground(Color.WHITE);
		btn.setBackground(Color.BLACK);
		c.add(btn);
		btn.addActionListener(this);
		

		b = new JButton();
		c.add(b);
		b.addActionListener(this);
		setVisible(true);

		
	}

	public void actionPerformed(ActionEvent e){
		System.out.println("Username :--\t"+user.getText());
		System.out.println("Password :--\t"+pass.getText()); 	
		user.setText("");
		pass.setText("");
}
}

class login_form{
	public static void main(String[]args){
		Myframe frame = new Myframe();

	}
}