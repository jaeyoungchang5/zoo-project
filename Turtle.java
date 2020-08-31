class Turtle extends Reptile {
    boolean hasLaidEggs;
    boolean isLandBased;

    Turtle(String uniqueName, String gender, boolean hasLaidEggs, boolean isLandBased){
        super(uniqueName, "endangered", "turtle", gender, true, true);
        this.hasLaidEggs = hasLaidEggs;
        this.isLandBased = isLandBased;
    }

    void displaySpecialInfo(){
        System.out.println(this.uniqueName + " is a " + this.gender + " " + this.animalType + " that " + (this.hasLaidEggs ? "has" : "has not") + " laid eggs and " + (this.isLandBased ? "is" : "is not") + " land based.");
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