
public class MoveCursor implements Command{

	private MouseCursor abcStock;
	
	@Override
	public void execute() {
		abcStock.move();
	}
	
	public MoveCursor(MouseCursor abcStock){
		this.abcStock = abcStock;
	}

}
