
abstract class Software {
	abstract void initialize();
	abstract void start();
	abstract void end();
	
	public final void play(){
		initialize();
		start();
		end();
	}
}
