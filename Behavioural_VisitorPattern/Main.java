
public class Main {
	public static void main(String[] args) {
		TreeNode computer = new TreeNode("Java.com");
		computer.accept(new ConsoleVisitor());
		computer.accept(new EmailVisitor());
	}
}
