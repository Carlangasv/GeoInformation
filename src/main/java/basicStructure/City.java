package basicStructure;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class City extends Node{

    private String specificState;
    @Override
    public String geoInformation() {
        return "City";
    }
}
