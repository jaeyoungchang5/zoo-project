class Penguin extends Bird {
    boolean hasLaidEggs;
    boolean isCarryingEgg;

    Penguin(String uniqueName, String conservationStatus, String animalType, String gender, boolean hasTalons, boolean canFly, boolean hasLaidEggs, boolean isCarryingEgg){
        super(uniqueName, conservationStatus, animalType, gender, canFly, hasTalons);
        this.hasLaidEggs = hasLaidEggs;
        this.isCarryingEgg = isCarryingEgg;
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