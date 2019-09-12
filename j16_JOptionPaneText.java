import javax.swing.JOptionPane;
public class j16_JOptionPaneText{

	public static void main(String[] args){
		String a = new String("hello world!");
		String b = "I love you!";
		String c = a.replace("o","0");
		System.out.println("我是java.".concat(c));

		String name = JOptionPane.showInputDialog("你叫什么名字？");
		String input = JOptionPane.showInputDialog("你今年多少岁？");
		int age = Integer.parseInt(input);
		System.out.println("你好，"+ name + ",明年，你就"+(age+1)+"岁了。");
		System.exit(0);
	}
}
