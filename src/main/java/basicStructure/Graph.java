package basicStructure;

import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Getter@Setter
public class Graph {
    private List<Link> links;
    private List<Node> nodes;

    public Graph(List<Link> links, List<Node> nodes) {
        this.links = links;
        this.nodes = nodes;
    }
}
