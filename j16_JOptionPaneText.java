import javax.swing.JOptionPane;
public class j16_JOptionPaneText{

	public static void main(String[] args){
		String a = new String("hello world!");
		String b = "I love you!";
		String c = a.replace("o","0");
		System.out.println("����java.".concat(c));

		String name = JOptionPane.showInputDialog("���ʲô���֣�");
		String input = JOptionPane.showInputDialog("���������ꣿ");
		int age = Integer.parseInt(input);
		System.out.println("��ã�"+ name + ",���꣬���"+(age+1)+"���ˡ�");
		System.exit(0);
	}
}
