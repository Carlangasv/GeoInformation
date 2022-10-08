package basicStructure;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class TourismPlace extends Node {

    private String specificState;

    @Override
    public String geoInformation() {
        return "Tourism place";
    }
}
