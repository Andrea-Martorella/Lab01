package it.polito.tdp.parole.model;

import java.util.*;

public class Parole {
	
	List<String> elenco = new ArrayList<>();
		
	public Parole() {
	}
	
	public void addParola(String p) {
		elenco.add(p);
	}
	
	public List<String> getElenco() {
		//TOD
		Collections.sort(elenco, new Comparator<String>() {
			@Override
			public int compare(String p1, String p2) {
				return p1.compareTo(p2);
			}
		});
		return elenco;
	}
	
	public void reset() {
		elenco.clear();
	}

}
