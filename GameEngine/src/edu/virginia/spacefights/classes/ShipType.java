package edu.virginia.spacefights.classes;

public enum ShipType {
	Rhino(1500, 250, 0.5, 200, 333, 0, 0, "ship2.png"), Vulture(1500, 200, 0.8, 300, 500, 1000, 0, "ship.png");
	private final int nrgCap;
	private final int nrgRecharge;
	private final double thrust;
	private final int bulletCost;
	private final int cooldown;
	private final int specialCost;
	private final int specialCD;
	// ~ Next line will eventually become type-based, like the other fields, which will determine
	// ~ which image is displayed for the ship
	private final String imageName;
	
	/**
	 * @param nrgCap The maximum amount of energy this type of ship can have
	 * @param nrgRecharge How quickly energy is refilled, as measured in units/second
	 * @param thrust Determines the acceleration of the ship 
	 * @param firingCost The amount of energy each weapon use incurs
	 * @param cooldown The amount of time that must occur between consecutive shots, expressed in milliseconds
	 */
	private ShipType(int nrgCap, int nrgRecharge, double thrust, int firingCost, int cooldown, int specCost, int specialCD, String fileName) {
		this.nrgCap = nrgCap;
		this.nrgRecharge = nrgRecharge;
		this.thrust = thrust;
		this.bulletCost = firingCost;
		this.cooldown = cooldown;
		this.imageName = fileName;
		this.specialCost = specCost;
		this.specialCD = specialCD;
	}

	public int getNrgCap() {
		return nrgCap;
	}

	public int getNrgRecharge() {
		return nrgRecharge;
	}

	public double getThrust() {
		return thrust;
	}

	public int getFiringCost() {
		return bulletCost;
	}

	public int getCooldown() {
		return cooldown;
	}

	public String getImageName() {
		return imageName;
	}

	public int getBulletCost() {
		return bulletCost;
	}

	public int getSpecialCost() {
		return specialCost;
	}

	public int getSpecialCD() {
		return specialCD;
	}
	
}