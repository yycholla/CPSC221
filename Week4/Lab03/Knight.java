public class Knight extends Character {

	/**
	 * Creates knight, sets default status to awake
	 */
	public Knight(LongRest rest) {
			super(rest);
			rest.stayAwake(this);
		}

		/**
		 * Set toString for knight.
		 *
		 * @return String description of knight.
		 */
		public String toString() {
		return "Knight in Shining Armor";
	}

	/**
	 * Sets attitude for knight
	 */
	@Override
	public void observeEncounter(Encounter encounter) {
		switch (encounter) {
			case Nothing:
			setAttitude("Enjoying some quiet time polishing my sword.");
				break;
			case Squirrel:
			setAttitude("I hope the squirrel doesn't encounter an owl.");
				break;
			case Goblin:
			setAttitude("I bet I could scare that goblin away with a creepy noise.");
				break;
			case Troll:
			setAttitude("Now it's time to prove my mettle on this troll.");
				break;
			case Dragon:
			setAttitude("I don't like this dragon... I've been burnt before.");
				break;
			default:
				setAttitude("Needs to be updated.");
				break;
		}
	}

}
