package co.com.uniandes.grafo.model;

import java.util.List;

import co.com.uniandes.grafo.Interface.Strategy;
import co.com.uniandes.grafo.Interface.Grafo;

public class NotDirectedWithoutWeight implements Grafo {

	private Strategy strategy;
	private List<SimpleNode> nodes;

	public NotDirectedWithoutWeight() {
		super();
	}

	public Strategy getStrategy() {
		return strategy;
	}

	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}

	public List<SimpleNode> getNodes() {
		return nodes;
	}

	public void setNodes(List<SimpleNode> nodes) {
		this.nodes = nodes;
	}

	public boolean hasWeight() {

		return false;
	}

	public boolean isDirected() {

		return false;
	}

	public void putStrategy(Strategy strategy) {
		this.strategy = strategy;

	}

	@Override
	public String toString() {
		return "\n Grafo [Directed = " + isDirected() + ", weight = " + hasWeight() + ", strategy = "
				+ strategy.strategyName() + "]";
	}

}
