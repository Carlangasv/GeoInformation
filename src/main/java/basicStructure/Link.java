package basicStructure;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class Link {
    private Node source;
    private Node destiny;

    public Link(Node source, Node destiny) {
        this.source = source;
        this.destiny = destiny;
        this.source.getLinks().add(this);
        this.destiny.getLinks().add(this);
    }
}
