class Penguin extends Bird {
    boolean hasLaidEggs;
    boolean isCarryingEgg;

    Penguin(String uniqueName, String gender, boolean hasLaidEggs, boolean isCarryingEgg){
        super(uniqueName, "near threatened", "penguin", gender, false, false);
        this.hasLaidEggs = hasLaidEggs;
        this.isCarryingEgg = isCarryingEgg;
    }

    void displaySpecialInfo(){
        System.out.println(this.uniqueName + " is a " + this.gender + " " + this.animalType + " that " + (this.hasLaidEggs ? "has" : "has not") + " laid eggs and " + (this.isCarryingEgg ? "is" : "is not") + " carrying an egg.");
    }

    void setHasLaidEggs(boolean hasLaidEggs){
        this.hasLaidEggs = hasLaidEggs;
    }
    void setIsCarryingEgg(boolean isCarryingEgg){
        this.isCarryingEgg = isCarryingEgg;
    }

    boolean getHasLaidEggs() { return this.hasLaidEggs; }
    boolean getIsCarryingEgg() { return this.isCarryingEgg; }
}