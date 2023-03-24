package ru.education.data_structures.graph;

public interface Graph {

    /**
     * Vertex - вершина графа
     */
    void addVertex(String label);

    /**
     * Добавление рёбер
     */
    boolean addEdge(String startLabel, String secondLabel, String... others);

    boolean addEdge(String startLabel, String secondLabel);

    int getSize();

    void display();

    /**
     * Depth-first search (DFS)
     */
    void dfs(String startLabel);

    /**
     * breadth-first search (BFS)
     */
    void bfs(String startLabel);
}
