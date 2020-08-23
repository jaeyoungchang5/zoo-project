class Reptile extends Animal {
    boolean resurfaceToBreath;
    boolean liveInSaltwater;

    Reptile(String uniqueName, String conservationStatus, String animalType, String gender, boolean resurfaceToBreath, boolean liveInSaltwater){
        super(uniqueName, conservationStatus, animalType, gender);
        this.resurfaceToBreath = resurfaceToBreath;
        this.liveInSaltwater = liveInSaltwater;
    }

    void setResurfaceToBreath(boolean resurfaceToBreath){
        this.resurfaceToBreath = resurfaceToBreath;
    }
    void setLiveInSaltwater(boolean liveInSaltwater){
        this.liveInSaltwater = liveInSaltwater;
    }

    boolean getResurfaceToBreath() { return this.resurfaceToBreath; }
    boolean getLiveInSaltwater() { return this.liveInSaltwater; }
}