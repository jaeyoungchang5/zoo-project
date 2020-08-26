class Alligator extends Reptile {
    boolean isMother;

    Alligator(String uniqueName, String conservationStatus, String animalType, String gender, boolean resurfaceToBreath, boolean liveInSaltwater, boolean isMother){
        super(uniqueName, conservationStatus, animalType, gender, resurfaceToBreath, liveInSaltwater);
        this.isMother = isMother;
    }

    void setIsMother(boolean isMother){
        this.isMother = isMother;
    }

    boolean getIsMother() { return this.isMother; }
}