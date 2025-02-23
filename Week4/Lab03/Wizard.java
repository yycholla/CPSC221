public class Wizard extends Character {

	/**
	 * Creates wizard, sets default status to awake
	 */
	public Wizard(LongRest rest) {
			super(rest);
			//TODO Auto-generated constructor stub
		}

		/**
		 * Set toString for wizard.
		 *
		 * @return String description of wizard.
		 */
		public String toString() {
		return "Mysterious, Arcane Wizard";
	}

	/**
	 * Sets attitude for wizard
	 */
	@Override
	public void observeEncounter(Encounter encounter) {
		switch (encounter) {
			case Nothing:
			setAttitude("Reading my spell book.");
				break;
			case Squirrel:
			setAttitude("I could transform that squirrel into a raven.");
				break;
			case Goblin:
			setAttitude("I hope that goblin doesn't see me.");
				break;
			case Troll:
			setAttitude("Oh no a troll! I wish I had prepared my fireball spell.");
				break;
			case Dragon:
			setAttitude("See ya, I'm outta here!");
				break;
			default:
				setAttitude("Needs to be updated.");
				break;
		}
	}
}
