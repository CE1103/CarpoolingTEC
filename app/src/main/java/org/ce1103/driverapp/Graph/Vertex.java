package org.ce1103.driverapp.Graph;

/**
 * Created by angelortizv on 11/23/2018.
 */

public class Vertex implements Comparable<Vertex>{
    public final String name;
    public Edge[] adjacencies = new Edge[11];
    public double minDistance = Double.POSITIVE_INFINITY;
    public Vertex previous;
    public Vertex(String argName) { name = argName; }
    public String toString() { return name; }
    public int compareTo(Vertex other) { return Double.compare(minDistance, other.minDistance); }

}
