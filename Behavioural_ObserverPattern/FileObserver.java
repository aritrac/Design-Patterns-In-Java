
public class FileObserver extends Observer{

	@Override
	public void update() {
		System.out.println("File: " + subject.getState());
	}
	
	public FileObserver(MyValue subject){
		this.subject = subject;
		this.subject.attach(this);
	}

}
