/*
Example : College Campus Road Network Graph
Imagine 6 locations inside a college campus
0-> main gate
1->library
2->Canteen
3->Academic block
4->Hostel
5-> Sports Ground

Graph DEsign
Connections:
Main gate <-> library
Main gate<-> Canteen
Library<-> Academic block
Canteen<->Academic Block
Academic Block <-> Hostel
Hostel <-> sports fround



          Library
          /     \
         /       \
     main gate    Academic ------ Hostel -------Sports Ground
        \          /
         \        /
          Canteen


        0   1   2   3   4   5
    0   0   1   1   0   0   0
    1   1   0   0   1   0   0
    2   1   0   0   1   0   0
    3   0   1   1   0   1   0
    4   0   0   0   1   0   1
    5   0   0   0   0   1   0
*/


class Graph {
    // 2D boolean array to represent the adjacency matrix
    private boolean[][] adjMatrix;

    // Total number of vertices
    private int vertices;

    // Constructor
    public Graph(int vertices) {
        // Store total vertices
        this.vertices = vertices; // 6
        
        // Instantiate the 2D matrix
        adjMatrix = new boolean[vertices][vertices];
        
        // Note: Java automatically initializes all elements in a boolean array to false.
        // No explicit loops are needed to clear the matrix!
    }

    // Method to add an edge
    public void addEdge(int source, int destination) {
        adjMatrix[source][destination] = true;
        adjMatrix[destination][source] = true; // Remove this line if you want a directed graph
    }

    // Display the matrix
    public void display() {
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                // Converts true to 1 and false to 0 to match your matrix format
                System.out.print((adjMatrix[i][j] ? 1 : 0) + " ");
            }
            System.out.println();
        }
    }
}

public class Graphs{
    public static void main(String[] args) {
        // Initialize graph with 6 vertices
        Graph g = new Graph(6);

        // Add the campus connections
        g.addEdge(0, 1); // Main gate <-> library
        g.addEdge(0, 2); // Main gate <-> Canteen
        g.addEdge(1, 3); // Library <-> Academic block
        g.addEdge(2, 3); // Canteen <-> Academic Block
        g.addEdge(3, 4); // Academic Block <-> Hostel
        g.addEdge(4, 5); // Hostel <-> sports groundQuestion

        // Print the final layout
        g.display();
    }
}
