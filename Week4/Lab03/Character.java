public abstract class Character implements OnWatch, DisplayAttitude {
	private String attitude;
	private LongRest rest;


	/**
	 * Creates character, assigns default status to awake,saves LongRest under rest for changing subscribe status.
	 * @param rest
	 */
	public Character(LongRest rest) {
		rest.stayAwake(this);
		this.rest = rest;

	}

	/**
	 * Unsubscribes character from watch and sets attitude to reflect sleeping status.
	 */
	public void goToSleep() {
		rest.goToSleep(this);
		this.attitude = "Sleeping the night away.";
	}

	/**
	 * Subscribes character to watch status.
	 */
	public void stayAwakeForWatch() {
		rest.stayAwake(this);
	}

	/**
	 * Sets attitude variable per child of character
	 * @param attitude
	 */
	public void setAttitude(String attitude) {
		this.attitude = attitude;
	}

	/**
	 * Prints the characters attitude string.
	 */
	public void display() {
		System.out.println(this.attitude);
	}
}
