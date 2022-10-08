import basicStructure.*;
import visualizer.AbstractVisualizer;
import visualizer.JSONVisualizer;
import visualizer.XMLVisualizer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        Graph mainGraph = initialize();
        export(mainGraph);
    }
    private static Graph initialize() {
        Node node1 = new Industry();
        Node node2 = new City();
        Node node3 = new TourismPlace();
        Link linkCityIndustry = new Link(node2, node1);
        Link linkCityPlace = new Link(node2, node3);
        Link linkIndustryPlace = new Link(node1, node3);
        List<Link> links = new ArrayList<>(Arrays.asList(linkCityPlace, linkCityIndustry, linkIndustryPlace));
        List<Node> nodes = new ArrayList<>(Arrays.asList(node1, node2, node3));
        return new Graph(links, nodes);
    }

    private static void export(Graph graph) throws IOException {
        AbstractVisualizer jsonVisualizer = new JSONVisualizer();
        AbstractVisualizer xmlVisualizer = new XMLVisualizer();
        jsonVisualizer.export(graph);
        xmlVisualizer.export(graph);
    }
}
