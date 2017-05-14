
public class PrinterObserver extends Observer{
	
	@Override
	public void update() {
		System.out.println("Printer: " + subject.getState());
	}
	
	public PrinterObserver(MyValue subject){
		this.subject = subject;
		this.subject.attach(this);
	}

}
