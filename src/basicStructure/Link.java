package basicStructure;

public class Link {
    private Node source;
    private Node destiny;

    public Link(Node source, Node destiny) {
        this.source = source;
        this.destiny = destiny;
    }

    public Node getSource() {
        return source;
    }

    public void setSource(Node source) {
        this.source = source;
    }

    public Node getDestiny() {
        return destiny;
    }

    public void setDestiny(Node destiny) {
        this.destiny = destiny;
    }
}
