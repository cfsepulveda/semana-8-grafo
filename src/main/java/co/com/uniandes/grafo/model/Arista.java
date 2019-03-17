package co.com.uniandes.grafo.model;

public class Arista {

	private ComplexNode origin;
	private ComplexNode destinition;
	private int weight;

	public Arista(ComplexNode origin, ComplexNode destinition, int weight) {
		super();
		this.origin = origin;
		this.destinition = destinition;
		this.weight = weight;
	}

	public Arista() {
		super();
	}

	public ComplexNode getOrigen() {
		return origin;
	}

	public void SetOrigin(ComplexNode origin) {
		this.origin = origin;
	}

	public ComplexNode getDestination() {
		return destinition;
	}

	public void setDestination(ComplexNode destinition) {
		this.destinition = destinition;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

}
