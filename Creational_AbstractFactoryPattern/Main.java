
public class Main {
	public static void main(String[] args) {
		//get shape factory
		AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
		
		//get an object of Shape Circle
		Shape shape1 = shapeFactory.getShape("CIRCLE");
		
		//call draw method of Shape Circle
		shape1.draw();
		
		//get an object of Shape Rectangle
		Shape shape2 = shapeFactory.getShape("RECTANGLE");
		
		//call draw method of Shape Rectangle
		shape2.draw();
		
		//get an object of Shape Square
		Shape shape3 = shapeFactory.getShape("Square");
		
		//call draw method of Shape Square
		shape3.draw();
		
		//get printer factory
		AbstractFactory printerFactory = FactoryProducer.getFactory("Printer");
		
		Printer printer1 = printerFactory.getPrinter("paper");
		printer1.print();
		
		Printer printer2 = printerFactory.getPrinter("web");
		printer2.print();
		
		Printer printer3 = printerFactory.getPrinter("screen");
		printer3.print();
	}
}
