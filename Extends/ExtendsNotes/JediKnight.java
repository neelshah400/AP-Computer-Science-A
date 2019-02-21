public class JediKnight extends Person{

	private String forcePower;

	public JediKnight(String name, String alliance, String forcePower){

		super(name, alliance);
		//super();
		this.forcePower = forcePower;

	}

	public String toString(){

		//return getName() + "'s Force Power is " + forcePower;
		return super.toString() + " and the power is "+  forcePower;

	}

}