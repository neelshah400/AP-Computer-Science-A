public class Runner{

	public static void main(String[]args){

		//Device
		System.out.println("DEVICE:\n");
		Device device = new Device("1 TB", "8 GB");
		System.out.println(device);
		System.out.println("Storage: " + device.getStorage());
		System.out.println("Memory: " + device.getMemory());
		System.out.println("Device? " + (device instanceof Device));
		System.out.println("Phone? " + (device instanceof Phone));
		System.out.println("Smartphone? " + (device instanceof Smartphone));
		System.out.println();

		//Phone
		System.out.println("PHONE:\n");
		Phone phone = new Phone("2 GB", "500 MB", "Verizon", "(123)456-7890");
		System.out.println(phone);
		System.out.println("Storage: " + phone.getStorage());
		System.out.println("Memory: " + phone.getMemory());
		System.out.println("Carrier: " + phone.getCarrier());
		System.out.println("Phone number: " + phone.getPhoneNumber());
		System.out.println("Device? " + (phone instanceof Device));
		System.out.println("Phone? " + (phone instanceof Phone));
		System.out.println("Smartphone? " + (phone instanceof Smartphone));
		System.out.println();

		//Phone
		System.out.println("SMARTPHONE:\n");
		Smartphone smartphone = new Smartphone("64 GB", "4 GB", "Verizon", "(123)456-7890", "Android", "a fingerprint sensor");
		System.out.println(smartphone);
		System.out.println("Storage: " + smartphone.getStorage());
		System.out.println("Memory: " + smartphone.getMemory());
		System.out.println("Carrier: " + smartphone.getCarrier());
		System.out.println("Phone number: " + smartphone.getPhoneNumber());
		System.out.println("Operating system: " + smartphone.getOperatingSystem());
		System.out.println("Unlock method: " + smartphone.getUnlockMethod());
		System.out.println("Device? " + (smartphone instanceof Device));
		System.out.println("Phone? " + (smartphone instanceof Phone));
		System.out.println("Smartphone? " + (smartphone instanceof Smartphone));
		System.out.println();

	}

}