
public class PlayState implements State{

	@Override
	public void doAction(Context context) {
		System.out.println("In Play State");
		context.setState(this);
	}
	
	public String toString(){
		return "Play State";
	}
	
}
