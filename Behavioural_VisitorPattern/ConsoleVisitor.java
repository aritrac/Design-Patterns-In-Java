
public class ConsoleVisitor implements NodeVisitor{
	public void visit(TreeNode n){
		System.out.println("console:" + n.getName());
	}
}
