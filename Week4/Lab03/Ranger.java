public class Ranger extends Character {

	/**
	 * Creates rogue, sets default status to awake
	 */
	public Ranger(LongRest rest) {
			super(rest);
			rest.stayAwake(this);
		}

		/**
		 * Set toString for rogue.
		 *
		 * @return String description of rogue.
		 */
		public String toString() {
		return "Quick, Stealthy Ranger";
	}

	/**
	 * Sets attitude for rogue
	 */
	@Override
	public void observeEncounter(Encounter encounter) {
		switch (encounter) {
			case Nothing:
			setAttitude("The stars are beautiful.");
				break;
			case Squirrel:
			setAttitude("The simple life of a squirrel is marvelous.");
				break;
			case Goblin:
			setAttitude("Goblins are such a distortion of nature.");
				break;
			case Troll:
			setAttitude("I hate trolls! Time to light up my arrows.");
				break;
			case Dragon:
			setAttitude("My arrows cannot penetrate the dragons scales.");
				break;
			default:
				setAttitude("Needs to be updated.");
				break;
		}
	}

}
