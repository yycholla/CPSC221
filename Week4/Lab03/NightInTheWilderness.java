import java.util.ArrayList;

public class NightInTheWilderness implements LongRest {
	private ArrayList<OnWatch> watchers;
    private Encounter currentEncounter;

	/**
	 * Establishes watcher arrayList and sets default encounter
	 */
    public NightInTheWilderness() {
        this.watchers = new ArrayList<OnWatch>();
        this.currentEncounter = Encounter.Nothing;
    }

	/**
	 * Sets passed encounter on observable class, notifies observers
	 * @param encounter
	 */
	public void setEncounter(Encounter encounter) {
		this.currentEncounter = encounter;
		somethingHappened();
	}

	/**
	 * Adds character as watcher to observer list if they are not already contained.
	 * @param watcher
	 */
	@Override
	public void stayAwake(OnWatch watcher) {
		if (!watchers.contains(watcher)) {
            this.watchers.add(watcher);
        }
	}

	/**
	 * removes character as watcher from observer list if in list.
	 * @param watcher
	 */
	@Override
	public void goToSleep(OnWatch watcher) {
		if (watchers.contains(watcher)) {
            this.watchers.remove(watcher);
        }
	}

	/**
	 * Notifies observers of updated encounter.
	 */
	@Override
	public void somethingHappened() {
		for (OnWatch watcher : watchers) {
			watcher.observeEncounter(currentEncounter);
		}
	}

}
