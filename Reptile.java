abstract class Reptile extends Animal {
    boolean resurfaceToBreath;
    boolean liveInSaltwater;

    Reptile(String uniqueName, String conservationStatus, String animalType, String gender, boolean resurfaceToBreath, boolean liveInSaltwater){
        super(uniqueName, conservationStatus, animalType, gender);
        this.resurfaceToBreath = resurfaceToBreath;
        this.liveInSaltwater = liveInSaltwater;
    }

    final void setResurfaceToBreath(boolean resurfaceToBreath){
        this.resurfaceToBreath = resurfaceToBreath;
    }
    final void setLiveInSaltwater(boolean liveInSaltwater){
        this.liveInSaltwater = liveInSaltwater;
    }

    final boolean getResurfaceToBreath() { return this.resurfaceToBreath; }
    final boolean getLiveInSaltwater() { return this.liveInSaltwater; }
}