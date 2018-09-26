package reusing;
//: reusing/SpaceShipDelegation.java

public class SpaceShipDelegation {
	private String name;
	private SpaceShipControls controls = 
			new SpaceShipControls();
	
	public SpaceShipDelegation(String name) {
		this.name = name;
	}
	
	// Delegated methods:Î¯ÍÐ·½·¨
	public void back(int velocity) {
		controls.back(velocity);
	}
	
	public void down(int velocity) {
		controls.down(velocity);
	}
	
	public void forward(int velocity) {
		controls.forward(velocity);
	}
	
	public void left(int volecity) {
		controls.left(volecity);
	}
	
	public void right(int volecity) {
		controls.right(volecity);
	}
	
	public void up(int volecity) {
		controls.up(volecity);
	}
	
	public void turboBoost() {
		controls.turboBoost();
	}
	
	public String toString() {
		return name;
	}
	
	public static void main(String[] args) {
		SpaceShipDelegation protector = new SpaceShipDelegation("NESA Protector");
		protector.forward(100);
	}
}
