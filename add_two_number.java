import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Myframe extends JFrame implements ActionListener{

	Container c;
	JLabel label1,label2;
	JTextField n1,n2;
	JButton btn;
	JLabel result;
	JTextField sum;

    Myframe(){
    	setBounds(100,100,500,300);
    	setTitle("Addition of Two Number");
    	setDefaultCloseOperation(EXIT_ON_CLOSE);

    	c = getContentPane();
    	c.setBackground(Color.GRAY);
    	c.setLayout(null);

    	label1 = new JLabel("First Number:");
    	label1.setBounds(80,20,120,20);
    	c.add(label1);
    	// Font f1 = new Font("Arial",Font.BOLD,1)

    	label2 = new JLabel("Second Number:");
    	label2.setBounds(80,60,120,20);
    	c.add(label2);

    	n1 = new JTextField();
    	n1.setBounds(220,20,150,20);
    	c.add(n1);

    	n2 = new JTextField();
    	n2.setBounds(220,60,150,20);
    	c.add(n2);

    	btn = new JButton("+");
    	btn.setBounds(240,110,100,20);
    	btn.setForeground(Color.WHITE);
    	btn.setBackground(Color.BLACK);
    	c.add(btn);

    	result = new JLabel("Result :");
    	result.setBounds(130,170,150,20);
    	c.add(result);

    	sum = new JTextField();
    	sum.setBounds(220,170,150,20);
    	c.add(sum);
    	setVisible(true);
    	btn.addActionListener(this);


}
    public void actionPerformed(ActionEvent e){
    		int a  = Integer.parseInt(n1.getText());
 			int b  = Integer.parseInt(n2.getText());
 			int m = a+b;
 			sum.setText(" "+m);

    }
}


class add_two_number{
	public static void main(String[]args){
		Myframe frame = new Myframe();
	}
}
