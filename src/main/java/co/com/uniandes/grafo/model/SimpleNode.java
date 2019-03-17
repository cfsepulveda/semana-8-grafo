package co.com.uniandes.grafo.model;

import java.util.List;

public class SimpleNode {

	private String name;
	private List<SimpleNode> adyacentes;

	public SimpleNode() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<SimpleNode> getAdyacentes() {
		return adyacentes;
	}

	public void setAdyacentes(List<SimpleNode> adyacentes) {
		this.adyacentes = adyacentes;
	}

}
