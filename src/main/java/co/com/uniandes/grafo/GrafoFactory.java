package co.com.uniandes.grafo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import co.com.uniandes.grafo.Interface.Grafo;
import co.com.uniandes.grafo.Interface.Strategy;
import co.com.uniandes.grafo.model.DirectedWithWeight;
import co.com.uniandes.grafo.model.DirectedWithoutWeight;
import co.com.uniandes.grafo.model.NotDirectedWithWeight;
import co.com.uniandes.grafo.model.NotDirectedWithoutWeight;
import co.com.uniandes.grafo.model.StrategyBFS;
import co.com.uniandes.grafo.model.StrategyDFS;

public class GrafoFactory {

	public static boolean getWeight() {

		return getProperties().getProperty("weight", "false").equals("true");

	}

	public static boolean getDirected() {

		return getProperties().getProperty("directed", "false").equals("true");

	}

	public static String getSearch() {

		String busqueda = null;
		if (getProperties().getProperty("bfs", "false").equals("true")) {
			busqueda = "bfs";
		}
		if (getProperties().getProperty("dfs", "false").equals("true")) {
			busqueda = "dfs";
		}
		return busqueda;

	}

	public static Properties getProperties() {

		Properties opciones = new Properties();
		try {
			opciones.load(new FileReader("src/main/resources/config.properties"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
		return opciones;
	}

	public static Strategy getStrategy() {

		String busqueda = getSearch();
		Strategy strategy = null;
		if (busqueda.equals("bfs")) {
			strategy = new StrategyBFS();
		}
		if (busqueda.equals("dfs")) {
			strategy = new StrategyDFS();
		}
		return strategy;
	}

	public static Grafo getGrafo() {

		Grafo miGrafo = null;
		boolean hasWeight = getWeight();
		boolean isDirected = getDirected();

		if (!hasWeight && !isDirected) {
			miGrafo = new NotDirectedWithoutWeight();
		}
		if (!hasWeight && isDirected) {
			miGrafo = new DirectedWithoutWeight();
		}
		if (hasWeight && !isDirected) {
			miGrafo = new NotDirectedWithWeight();
		}
		if (hasWeight && isDirected) {
			miGrafo = new DirectedWithWeight();
		}
		miGrafo.putStrategy(getStrategy());
		return miGrafo;
	}
}
