package basicStructure;

import lombok.Getter;
import lombok.Setter;
import java.util.ArrayList;
import java.util.List;
@Getter @Setter
public abstract class Node {
    private String commonState;
    private List<Link> links;
    public Node(String commonState) {
        this.commonState = commonState;
        this.links = new ArrayList<>();
    }

    public Node(){
        this.links = new ArrayList<>();
    }

    public abstract String geoInformation();
}
