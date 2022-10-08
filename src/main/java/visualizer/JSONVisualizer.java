package visualizer;

import basicStructure.Graph;

import java.util.concurrent.atomic.AtomicInteger;

public class JSONVisualizer extends AbstractVisualizer {

    @Override
    public String visualize(Graph graph) {
        StringBuilder sb = new StringBuilder();
        AtomicInteger index = new AtomicInteger();
        sb.append("{ \n");
        sb.append("\"info\":{\n");
        graph.getNodes().forEach(e -> {
            sb.append("\"");
            sb.append(e.geoInformation());
            sb.append("\"");
            sb.append(":{ \n");
            e.getLinks().forEach(x -> {
                sb.append("\"Link");
                sb.append(index.get());
                sb.append("\"");
                sb.append(":{ \n");
                sb.append("\"source\":");
                sb.append("\"");
                sb.append(x.getSource().geoInformation());
                sb.append("\"");
                sb.append(", \n");
                sb.append("\"destiny\":");
                sb.append("\"");
                sb.append(x.getDestiny().geoInformation());
                sb.append("\"");
                sb.append("\n");
                sb.append("}, \n");
                index.getAndIncrement();
            });
            sb.append("}, \n");
        });
        sb.append("} \n");
        sb.append("} \n");

        return sb.toString();
    }
}
