public class Phone extends Device{

	private String carrier;
	private String phoneNumber;

	public Phone(String storage, String memory, String carrier, String phoneNumber){

		super(storage, memory);
		this.carrier = carrier;
		this.phoneNumber = phoneNumber;

	}

	public String getCarrier(){

		return carrier;

	}

	public String getPhoneNumber(){

		return phoneNumber;

	}

	public String toString(){

		return "This phone runs on " + carrier + "'s network and can be called at " + phoneNumber + ".";

	}

}