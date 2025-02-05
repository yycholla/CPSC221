public abstract class Characters {
    private int hitPoints;
    private int armorClass;
    private String soapBox;
    private armorType armortype;
    private weaponType weaponType;
    private String cliche, className;
    private boolean hasManeuvers, tendsToRage, sneaksAround, willToSurvive, picksLock, castsSpell, healsOthers, solvesProblems;

    public enum armorType {
        HEAVY, MEDIUM, LIGHT, NONE, NULL
    }

    public enum weaponType {
        MARTIAL, SIMPLE, STAFF, WORDS
    }

    public Characters(int hitPoints, int armorClass) {
        this.hitPoints = hitPoints;
        this.armorClass = armorClass;

        this.className = className();
        this.armortype = wearArmor();
        this.weaponType = useWeapon();

        if (this.hasManeuvers) {
            this.cliche += "\nMy weapon training and combat prowess is unmatched.";
        } else if (this.tendsToRage) {
            this.cliche += "\nWhen I angry I unstoppable.";
        } else if (this.sneaksAround) {
            this.cliche += "\nI prefer to be unseen and avoid combat.";
        } else if (this.picksLock) {
            this.cliche += "\nI can pick locks to get through doors.";
        } else if (this.castsSpell) {
            this.cliche += "\nI have dedicated my life to learning magic";
        } else if (this.healsOthers) {
            this.cliche += "\nMy healing keeps the party alive";
        } else if (this.solvesProblems) {
            this.cliche += "\nMy intelligence moves the party through difficult situations";
        } else {
            this.cliche = "\nYour mother was a hamster and your father smelled of elderberries. Now go away before I taunt you a second time";
        }

        this.soapBox = "I am a " + this.className + ".\n" +
                "I have " + this.hitPoints + " HP and " + this.armorClass + " AC.\n" +
                "I wear " + this.armortype.name().toLowerCase() + " armor!\n" +
                "I wield " + this.weaponType.name().toLowerCase() + " weapons" +
                this.cliche + "\n\n";

    }

    public abstract String className();
    public abstract weaponType useWeapon();
    public abstract armorType wearArmor();

    public void setHasManeuvers(boolean set) {
        this.hasManeuvers = set;
    }
    public boolean getHasManeuvers() {
        return this.hasManeuvers;
    }

    public void setTendsToRage(boolean set) {
        this.tendsToRage = set;
    }
    public boolean getTendsToRage() {
        return this.tendsToRage;
    }

    public void setSneaksAround(boolean set) {
        this.sneaksAround = set;
    }
    public boolean getSneaksAround() {
        return this.sneaksAround;
    }

    public void setWillToSurvive(boolean set) {
        this.willToSurvive = set;
    }
    public boolean getWillToSurvive() {
        return this.willToSurvive;
    }

    public void setPicksLock(boolean set) {
        this.picksLock = set;
    }
    public boolean getPicksLock() {
        return this.picksLock;
    }

    public void setCastsSpell(boolean set) {
        this.castsSpell = set;
    }
    public boolean getCastsSpell() {
        return this.castsSpell;
    }

    public void setHealsOthers(boolean set) {
        this.healsOthers = set;
    }
    public boolean getHealsOthers() {
        return this.healsOthers;
    }

    public void setSolvesProblems(boolean set) {
        this.solvesProblems = set;
    }
    public boolean getSolvesProblems() {
        return this.solvesProblems;
    }

    public String toString() {
        return this.soapBox;
    }
}
