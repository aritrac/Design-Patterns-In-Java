
public class Printer3D extends PrinterDecorator {

	public Printer3D(Printer d) {
		super(d);
	}

	public void print(){
		System.out.println("3D.");
		decoratedPrinter.print();
	}
}
