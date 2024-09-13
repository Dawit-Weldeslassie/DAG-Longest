# Longest Path in DAG Application

This is a Java application that finds the longest path in a Directed Acyclic Graph (DAG). Implements topological sorting and dynamic 
programming to efficiently solve the problem. Inspired by a real-world IPaC challenge involving graph-based questionnaires. Includes 
optimizations for larger graphs and handles edge cases.

## Technologies Used

- Java
- Spring Boot
- Maven

## Project Structure

The project is divided into two main packages:

1. `longest.path.dag.GraphProcessor`: This package contains the main logic for processing the graph.
2. `longest.path.dag.Model`: This package contains the model classes (`Vertex` and `Edge`) used in the application.

## Setup

To run this project, you need to have Java and Maven installed on your machine.

1. Clone the repository: `git clone https://github.com/your-repo-url`
2. Navigate to the project directory: `cd your-project-directory`
3. Build the project: `mvn clean install`
4. Run the application: `mvn spring-boot:run`

## Testing

The project contains unit tests for the `Graph`, `GraphBuilder`, and `DAGLongestPath` classes. You can run the tests using the following command:

`mvn test`

## Contributing

Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

