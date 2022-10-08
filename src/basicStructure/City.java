package basicStructure;

public class City extends Node{

    private String specificState;

    public String getSpecificState() {
        return specificState;
    }

    public void setSpecificState(String specificState) {
        this.specificState = specificState;
    }

    @Override
    public String geoInformation() {
        return "basicStructure.City";
    }
}
