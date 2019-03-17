package co.com.uniandes.grafo.model;

import java.util.List;

import co.com.uniandes.grafo.Interface.Strategy;
import co.com.uniandes.grafo.Interface.Grafo;

public class NotDirectedWithWeight implements Grafo {

	private Strategy strategy;
	private List<ComplexNode> nodes;

	public NotDirectedWithWeight(Strategy strategy, List<ComplexNode> nodes) {
		super();
		this.strategy = strategy;
		this.nodes = nodes;
	}

	public NotDirectedWithWeight() {
		super();
	}

	public Strategy getStrategy() {
		return strategy;
	}

	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}

	public List<ComplexNode> getNodes() {
		return nodes;
	}

	public void setNodes(List<ComplexNode> nodes) {
		this.nodes = nodes;
	}

	public boolean hasWeight() {

		return true;
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
