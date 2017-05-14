
public class EmailObserver extends Observer{

	@Override
	public void update() {
		System.out.println("Email: " + subject.getState());
	}
	
	public EmailObserver(MyValue subject){
		this.subject = subject;
		this.subject.attach(this);
	}
}
