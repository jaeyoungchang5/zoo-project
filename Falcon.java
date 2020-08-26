class Falcon extends Bird {
    String continent;
    boolean wingsClipped;

    Falcon(String uniqueName, String conservationStatus, String animalType, String gender, boolean hasTalons, boolean canFly, String continent, boolean wingsClipped){
        super(uniqueName, conservationStatus, animalType, gender, hasTalons, canFly);
        this.continent = continent;
        this.wingsClipped = wingsClipped;
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