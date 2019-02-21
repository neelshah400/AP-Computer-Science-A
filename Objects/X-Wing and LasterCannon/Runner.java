public class Runner{

	public static void main(String[]args){

		XWing x = new XWing(100, "Neel", 100);
		x.fireCannon();

		x.setLaserPower(90);
		x.fireCannon();

	}

}