package Clases;

import java.util.HashMap;
import java.util.Map;
import java.util.NavigableSet;
import java.util.TreeSet;

public class Graph {
	  //mapeo de vertices
	  private final Map<String, Vertex> graph;

	  public static class Edge {
	    public final String v1, v2;
	    public final int dist;

	    public Edge(String v1, String v2, int dist) {
	      this.v1 = v1;
	      this.v2 = v2;
	      this.dist = dist;
	    }
	  }

	  public static class Vertex implements Comparable<Vertex> {
	    public final String nombre;
	    public int dist = Integer.MAX_VALUE;
	    public Vertex previous = null;
	    public final Map<Vertex, Integer> neighbours = new HashMap<>();

	    public Vertex(String name) {
	      this.nombre = name;
	    }

	    private String printPath() {
	      if (this == this.previous) {
	        return this.nombre;
	      } else if (this.previous == null) {
	        return this.nombre;
	      } else {
	    	  int hora = this.dist/60;
	    	  int minutos = this.dist%60;
	          return this.previous.printPath()+" -> " + this.nombre + " ("+hora+":"+minutos+" horas) ";
	      }
	    }

	    public int compareTo(Vertex other) {
	      if (dist == other.dist) 
	    	  return nombre.compareTo(other.nombre);
	      return Integer.compare(dist, other.dist);
	    }
	  }

	  // Construye un grafo a partir de un conjunto de aristas
	  public Graph(Edge[] edges) {
	    graph = new HashMap<>(edges.length);

	    for (Edge e : edges) {
	      if (!graph.containsKey(e.v1)) graph.put(e.v1, new Vertex(e.v1));
	      if (!graph.containsKey(e.v2)) graph.put(e.v2, new Vertex(e.v2));
	    }

	    for (Edge e : edges) {
	      graph.get(e.v1).neighbours.put(graph.get(e.v2), e.dist);
	    }
	  }

	  //corre dijkstra usando un vértice de origen especificado
	  public void dijkstra(String startName) {
	    final Vertex source = graph.get(startName);
	    NavigableSet<Vertex> q = new TreeSet<>();

	    for (Vertex v : graph.values()) {
	      v.previous = v == source ? source : null;
	      v.dist = v == source ? 0 : Integer.MAX_VALUE;
	      q.add(v);
	    }

	    dijkstra(q);
	  }

	  //Implementación del algoritmo de dijkstra usando un binary heap
	  private void dijkstra(final NavigableSet<Vertex> q) {
	    Vertex u, v;
	    while (!q.isEmpty()) {
	      // vértice con la distancia más corta
	      u = q.pollFirst();
	      if (u.dist == Integer.MAX_VALUE)
	        break; 
	      // Mira las distancias a cada vecino
	      for (Map.Entry<Vertex, Integer> a : u.neighbours.entrySet()) {
	        v = a.getKey();

	        final int alternateDist = u.dist + a.getValue();
	        if (alternateDist < v.dist) { //Camino más corto al vecino encontrado
	          q.remove(v);
	          v.dist = alternateDist;
	          v.previous = u;
	          q.add(v);
	        }
	      }
	    }
	  }

	  // Imprime una ruta desde la fuente hasta el vértice especificado
	  public String printPath(String endName) {
	    return graph.get(endName).printPath();
	  }
	}
