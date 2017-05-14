
public class ResetCursor implements Command{
	
	private MouseCursor abcStock;
	
	@Override
	public void execute() {
		abcStock.reset();
	}
	
	public ResetCursor(MouseCursor abcStock){
		this.abcStock = abcStock;
	}
}
