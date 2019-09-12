import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class WelcomeTest{
    public static void main(String[] args){
	WecomeFrame frame=new WelcomeFrame();
	framme.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.show();
    }
}

class WelcomeFrame extends JFrame{
    public WelcomeFrame(){
	setTitle("Welcome");
	setSize(DEFAULT_WIDTH,DEFAULT_HEIGHT);
	WelcomePanel panel=new WelcomePanel();
	Container contentPane=getContentPane();
	contentPane.add(panel);
    }
    public static final int DEFAULT_WIDTH=300;
    public static final int DEFAULT_HEIGHT=200;
}

class WelcomePanel extends Jpanel{
    public WelcomePanel(){
	JLabel promept=new JLabel("请输入你的名字：");
	final JTextField input=new JTextField(10);
	final JTextField output=new JTextField(25);
	JButton btnn=new Jlabel("welcome");
	add(prompt);
	add(input);
	add(output);
	add(btnn);
	btnn.addActionLisetner=new ActionListenner(){
	    public void actionPerformed(ActionEvent event){0
		String s=input.getText();
		output.setText("Hello"+s+",欢迎加入java考试！");
	    }
	}
    } ,`
}