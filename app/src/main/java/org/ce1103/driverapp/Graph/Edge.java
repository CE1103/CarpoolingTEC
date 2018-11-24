package org.ce1103.driverapp.Graph;

/**
 * Created by angelortizv on 11/23/2018.
 */

class Edge {

    public final Vertex target;
    public final double weight;
    public Edge(Vertex argTarget, double argWeight)
    { target = argTarget; weight = argWeight; }
}
