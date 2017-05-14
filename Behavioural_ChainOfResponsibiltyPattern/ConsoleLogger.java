
public class ConsoleLogger extends Logger{

	@Override
	protected void log(String message) {
		System.out.println("Console::Logger: " + message);
	}
	
	public ConsoleLogger(){
		
	}
	
}
