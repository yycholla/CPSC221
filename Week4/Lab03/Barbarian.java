public class Barbarian extends Character {

	/**
	 * Creates barbarian, sets default status to awake
	 */
	public Barbarian(LongRest rest) {
			super(rest);
			rest.stayAwake(this);
		}

		/**
		 * Set toString for barbarian.
		 *
		 * @return String description of barbarian.
		 */
		public String toString() {
		return "Fur-clad Raging Barbarian";
	}

	/**
	 * Sets attitude for barbarian
	 */
	@Override
	public void observeEncounter(Encounter encounter) {
		switch (encounter) {
			case Nothing:
			setAttitude("Staring into the fire... feeling hungry.");
				break;
			case Squirrel:
			setAttitude("Squirrel would make a good snack.");
				break;
			case Goblin:
			setAttitude("I could slice that goblin in two with one blow.");
				break;
			case Troll:
			setAttitude("Bet I could dice up troll faster than it regenerates.");
				break;
			case Dragon:
			setAttitude("Wonder how bad the dragons fire hurts.");
				break;
			default:
				setAttitude("Needs to be updated.");
				break;
		}
	}

}
