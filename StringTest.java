import javax.swing.*;
public class StringTest {
	public static void main(String[] args) {
		JFrame frame = new JFrame("HelloWorld");
		JLabel label = new JLabel("Hello, world!");
		frame.getContentPane().add(label);
		frame.setSize(500,800);
		frame.setVisible(true);
	}
}
