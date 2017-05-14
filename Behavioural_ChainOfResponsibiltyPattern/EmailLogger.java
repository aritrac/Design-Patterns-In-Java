
public class EmailLogger extends Logger{

	@Override
	protected void log(String message) {
		System.out.println("Email::Logger: " + message);
	}
	
	public EmailLogger(){
		
	}
}
