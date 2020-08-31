class Falcon extends Bird {
    String continent;
    boolean wingsClipped;

    Falcon(String uniqueName, String gender, String continent, boolean wingsClipped){
        super(uniqueName, "least concern", "falcon", gender, true, true);
        this.continent = continent;
        this.wingsClipped = wingsClipped;
    }

    void displaySpecialInfo(){
        System.out.println(this.uniqueName + " is a " + this.gender + " " + this.animalType + " that lives in " + this.continent + " and " + (this.wingsClipped ? "has" : "has not") + " gotten its wings clipped.");
    }

    void setContinent(String continent){
        this.continent = continent;
    }
    void setWingsClipped(boolean wingsClipped){
        this.wingsClipped = wingsClipped;
    }

    String getContinent() { return this.continent; }
    boolean getWingsClipped() { return this.wingsClipped; }
}