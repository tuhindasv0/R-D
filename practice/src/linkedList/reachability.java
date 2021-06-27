package linkedList;

import java.util.LinkedList;
import java.util.ListIterator;

public class reachability {

    private int V;   // No. of vertices
    private LinkedList<Integer> adj[]; //Adjacency List

    //Constructor
    reachability(int v)
    {
        V = v;
        adj = new LinkedList[v];
        for (int i=0; i<v; ++i)
            adj[i] = new LinkedList();
    }

    //Function to add an edge into the graph
    void addEdge(int v,int w)  {   adj[v].add(w);
       }


    Boolean isReachable(int s, int d)
    {


        // Mark all the vertices as not visited(By default set
        // as false)
        boolean visited[] = new boolean[V];

        // Create a queue for BFS
        LinkedList<Integer> queue = new LinkedList<Integer>();

        // Mark the current node as visited and enqueue it
        visited[s]=true;
        queue.add(s);
        System.out.println("adding new element to Queue " +s);

        // 'i' will be used to get all adjacent vertices of a vertex
        ListIterator<Integer> i;
        while (queue.size()!=0)
        {
            System.out.println("queue size "+queue.size());
            // Dequeue a vertex from queue and print it
            s = queue.poll();
            System.out.println("removing elemt from q");

            int n;
            i = adj[s].listIterator();

            // Get all adjacent vertices of the dequeued vertex s
            // If a adjacent has not been visited, then mark it
            // visited and enqueue it
            while (i.hasNext())
            {
                n = i.next();
                System.out.println(n);
                // If this adjacent node is the destination node,
                // then return true
                if (n==d)
                    return true;

                // Else, continue to do BFS
                if (!visited[n])
                {
                    System.out.println("Visiting node");
                    visited[n] = true;
                    queue.add(n);
                    System.out.println("adding new element to Queue " +n);
                }
            }
        }

        // If BFS is complete without visited d
        return false;
    }

    public static void main(String[] args) {
        reachability g = new reachability(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        int u = 0;
        int v = 3;
        if (g.isReachable(u, v))
            System.out.println("There is a path from " + u +" to " + v);
        else
            System.out.println("There is no path from " + u +" to " + v);
    }

}
