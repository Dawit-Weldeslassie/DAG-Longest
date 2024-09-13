package longest.path.dag;

import longest.path.dag.GraphProcessor.GraphBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DagApplication {

    public static void main(String[] args) {
        SpringApplication.run(DagApplication.class, args);
        GraphBuilder graphBuilder = new GraphBuilder();
        graphBuilder.buildGraph();
    }

}
