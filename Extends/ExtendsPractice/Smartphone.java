public class Smartphone extends Phone{

	private String operatingSystem;
	private String unlockMethod;

	public Smartphone(String storage, String memory, String carrier, String phoneNumber, String operatingSystem, String unlockMethod){

		super(storage, memory, carrier, phoneNumber);
		this.operatingSystem = operatingSystem;
		this.unlockMethod = unlockMethod;

	}

	public String getOperatingSystem(){

		return operatingSystem;

	}

	public String getUnlockMethod(){

		return unlockMethod;

	}

	public String toString(){

		return "This smartphone runs " + operatingSystem + " and can be unlocked using " + unlockMethod;

	}

}