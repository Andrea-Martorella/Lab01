package it.polito.tdp.parole.model;

import java.util.*;

public class Parole {
	
	List<String> elenco = new ArrayList<>();
	List<String> elencoL = new LinkedList<>();
		
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
	
	public void cancellaParola(String s) {
		for(String si : elenco)
			if(si.equals(s))
				elenco.remove(si);
	}
	
	public void reset() {
		elenco.clear();
		elencoL.clear();
	}
	
	
	// METODI LINKEDLIST
	public void addParolaL(String p) {
		elencoL.add(p);
	}
	
	public List<String> getElencoL() {
		//TOD
		Collections.sort(elencoL, new Comparator<String>() {
			@Override
			public int compare(String p1, String p2) {
				return p1.compareTo(p2);
			}
		});
		return elencoL;
	}
	
	public void cancellaParolaL(String s) {
		for(String si : elencoL)
			if(si.equals(s))
				elencoL.remove(si);
	}
}
