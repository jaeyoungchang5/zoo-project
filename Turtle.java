class Turtle extends Reptile {
    boolean hasLaidEggs;
    boolean isLandBased;

    Turtle(String uniqueName, String conservationStatus, String animalType, String gender, boolean resurfaceToBreath, boolean liveInSaltwater, boolean hasLaidEggs, boolean isLandBased){
        super(uniqueName, conservationStatus, animalType, gender, resurfaceToBreath, liveInSaltwater);
        this.hasLaidEggs = hasLaidEggs;
        this.isLandBased = isLandBased;
    }

    void setHasLaidEggs(boolean hasLaidEggs){
        this.hasLaidEggs = hasLaidEggs;
    }
    void setIsLandBased(boolean isLandBased){
        this.isLandBased = isLandBased;
    }

    boolean getHasLaidEggs() { return this.hasLaidEggs; }
    boolean getIsLandBased() { return this.isLandBased; }
}