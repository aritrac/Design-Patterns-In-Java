
public class NullCustomer extends AbstractEmployee{

	@Override
	public boolean isNull() {
		return true;
	}

	@Override
	public String getName() {
		return "Not Available";
	}

}
