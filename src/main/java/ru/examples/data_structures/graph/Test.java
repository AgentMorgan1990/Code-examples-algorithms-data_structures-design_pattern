package ru.examples.data_structures.graph;

public class Test {


    public static void main(String[] args) {

//        testGraph();
//        testDFS();
        testBFS();
    }

    private static void testGraph() {
        Graph graph = new GraphImpl(7);

        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");

        graph.addEdge("A","B","C");
        graph.addEdge("B","C","D");
        graph.addEdge("C","A","B","D");
        graph.addEdge("D","B","C");

        System.out.println("Size of graph is " + graph.getSize());
        graph.display();
    }

    private static void testDFS(){
        Graph graph = new GraphImpl(7);

        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");
        graph.addVertex("E");
        graph.addVertex("F");
        graph.addVertex("G");

        graph.addEdge("A","B","C","D");
        graph.addEdge("B","E");
        graph.addEdge("D","F");
        graph.addEdge("F","G");

        graph.dfs("A");

    }
    private static void testBFS(){
        Graph graph = new GraphImpl(8);

        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");
        graph.addVertex("E");
        graph.addVertex("F");
        graph.addVertex("G");
        graph.addVertex("H");

        graph.addEdge("A","B","C","D");
        graph.addEdge("B","E");
        graph.addEdge("E","H");
        graph.addEdge("C","F");
        graph.addEdge("D","G");

        graph.bfs("H");

    }
}
