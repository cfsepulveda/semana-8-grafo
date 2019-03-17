package co.com.uniandes.grafo.model;

import java.util.List;

public class ComplexNode {

	private String name;
	private List<Arista> connections;

	public ComplexNode(String name, List<Arista> connections) {
		super();
		this.name = name;
		this.connections = connections;
	}

	public ComplexNode() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Arista> getConexiones() {
		return connections;
	}

	public void setConexiones(List<Arista> connections) {
		this.connections = connections;
	}

}
