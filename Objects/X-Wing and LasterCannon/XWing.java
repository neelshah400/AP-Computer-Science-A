public class XWing{

	private int shieldStrength;
	private String pilotName;
	private LaserCannon weaponType;

	public XWing(int shieldStrength, String pilotName, int powerLevel){

		this.shieldStrength = shieldStrength;
		this.pilotName = pilotName;
		weaponType = new LaserCannon(powerLevel);

	}

	public void fireCannon(){

		System.out.println("Firing lasers are " + weaponType.getPowerLevel() + "% power!");

	}

	public void setLaserPower(int powerLevel){

		weaponType.setPowerLevel(powerLevel);

	}

}