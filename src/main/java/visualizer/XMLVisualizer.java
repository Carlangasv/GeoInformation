package visualizer;

import basicStructure.Graph;

public class XMLVisualizer extends AbstractVisualizer{

    @Override
    public String visualize(Graph graph) {
        StringBuilder sb = new StringBuilder();
        sb.append("<Info> \n");
        graph.getNodes().forEach(e -> {
            sb.append("<Node>");
            sb.append(e.geoInformation());
            sb.append("\n");
            e.getLinks().forEach( x ->{
                sb.append("<Link>");
                sb.append(x.getSource().geoInformation());
                sb.append("->");
                sb.append(x.getDestiny().geoInformation());
                sb.append("</Link> \n");
            });
            sb.append("</Node> \n");
        });
        sb.append("</Info>");
        return sb.toString();
    }
}