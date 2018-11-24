package org.ce1103.driverapp.Graph;

/**
 * Created by angelortizv on 11/23/2018.
 */

import android.os.Build;
import android.support.annotation.RequiresApi;

import java.util.PriorityQueue;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ThreadLocalRandom;

public class Dijkstra {

    public static void computePaths(Vertex source)
    {
        source.minDistance = 0.;
        PriorityQueue<Vertex> vertexQueue = new PriorityQueue<Vertex>();
        vertexQueue.add(source);

        while (!vertexQueue.isEmpty()) {
            Vertex u = vertexQueue.poll();

            // Visit each edge exiting u
            for (Edge e : u.adjacencies)
            {
                Vertex v = e.target;
                double weight = e.weight;
                double distanceThroughU = u.minDistance + weight;
                if (distanceThroughU < v.minDistance) {
                    vertexQueue.remove(v);

                    v.minDistance = distanceThroughU ;
                    v.previous = u;
                    vertexQueue.add(v);
                }
            }
        }
    }

    public static List<Vertex> getShortestPathTo(Vertex target)
    {
        List<Vertex> path = new ArrayList<Vertex>();
        for (Vertex vertex = target; vertex != null; vertex = vertex.previous)
            path.add(vertex);

        Collections.reverse(path);
        return path;
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public static void main(String[] args)
    {
        // mark all the vertices
        Vertex A = new Vertex("A");
        Vertex B = new Vertex("B");
        Vertex D = new Vertex("D");
        Vertex F = new Vertex("F");
        Vertex K = new Vertex("K");
        Vertex J = new Vertex("J");
        Vertex M = new Vertex("M");
        Vertex O = new Vertex("O");
        Vertex P = new Vertex("P");
        Vertex R = new Vertex("R");
        Vertex Z = new Vertex("Z");

        Vertex[] v1 = {A,B,D,F,K,J,M,O,P,R,Z};
        int j = 0;
        for (Vertex vertex1 : v1) {
            for(int i = 0; i<11;i++) {
                vertex1.adjacencies[j] =  new Edge(v1[i], ThreadLocalRandom.current().nextInt(10, 50));
                j++;
            }
            j = 0;
        }

        computePaths(A); // run Dijkstra
        System.out.println("Distance to " + O + ": " + O.minDistance);
        List<Vertex> path = getShortestPathTo(O);
        System.out.println("Path: " + path);
    }


}
