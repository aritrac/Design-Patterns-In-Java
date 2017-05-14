
public class EmailVisitor implements NodeVisitor{
	public void visit(TreeNode n){
		System.out.println("email:" + n.getName());
	}
}
