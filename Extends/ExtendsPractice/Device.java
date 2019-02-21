public class Device{

	private String storage;
	private String memory;

	public Device(String storage, String memory){

		this.storage = storage;
		this.memory = memory;

	}

	public String getStorage(){

		return storage;

	}

	public String getMemory(){

		return memory;

	}

	public String toString(){

		return "This device has " + storage + " storage and " + memory + " memory.";

	}

}