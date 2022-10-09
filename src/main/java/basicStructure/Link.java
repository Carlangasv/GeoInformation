package basicStructure;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class Link {
    private Node source;
    private Node target;

    public Link(Node source, Node destiny) {
        this.source = source;
        this.target = destiny;
        this.source.getLinks().add(this);
        this.target.getLinks().add(this);
    }
}
