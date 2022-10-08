package basicStructure;

import java.util.ArrayList;
import java.util.List;

public abstract class Node {
    private String commonState;

    public Node() {
    }

    public Node(String commonState) {
        this.commonState = commonState;
    }

    public List<Link> getLinks(){
        return new ArrayList<>();
    }

    public abstract String geoInformation();



    public String getCommonState() {
        return commonState;
    }

    public void setCommonState(String commonState) {
        this.commonState = commonState;
    }
}
