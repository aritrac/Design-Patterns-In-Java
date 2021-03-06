
public class Main {
	public static void main(String[] args) {
		Context context = new Context();
		
		StartState startState = new StartState();
		startState.doAction(context);
		System.out.println(context.getState());
		
		PlayState playState = new PlayState();
		playState.doAction(context);
		System.out.println(context.getState());
		
		StopState stopState = new StopState();
		stopState.doAction(context);
		System.out.println(context.getState());
	}
}
