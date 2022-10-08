package basicStructure;

import java.util.List;

public class Graph {
    private List<Link> links;
    private List<Node> nodes;

    public Graph(List<Link> links, List<Node> nodes) {
        this.links = links;
        this.nodes = nodes;
    }

    public List<Link> getLinks() {
        return links;
    }

    public void setLinks(List<Link> links) {
        this.links = links;
    }

    public List<Node> getNodes() {
        return nodes;
    }

    public void setNodes(List<Node> nodes) {
        this.nodes = nodes;
    }
}
