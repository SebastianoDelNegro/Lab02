package it.polito.tdp.alien;

import java.util.*;

public class AlienDictionary {
	
	List<Word> dictionary;
	Map<String,Word> mappadizionario;
	
	public AlienDictionary() {
		this.dictionary = new LinkedList<Word>();
		this.mappadizionario=new HashMap<String,Word>();
	}

	public void addWord(String alienword, String translation) {
		
		Word f = new Word(alienword);
		f.getTraduzionimultiple().add(translation);
		this.mappadizionario.put(alienword, f);
		this.dictionary.add(f);
	}
	
	public String translateWord(String alienword) {
		Word o = this.mappadizionario.get(alienword);
		if(o == null) return null;
		String d = "";
		for(String c : o.getTraduzionimultiple()) {
			if(d=="") d+=c;
			else d+="\n"+c;
		}
		return d;
	}

	public List<Word> getDictionary() {
		return dictionary;
	}

	public void setDictionary(List<Word> dictionary) {
		this.dictionary = dictionary;
	}

	public Map<String, Word> getMappadizionario() {
		return mappadizionario;
	}

	public void setMappadizionario(Map<String, Word> mappadizionario) {
		this.mappadizionario = mappadizionario;
	}
	public String result(String word) {
		String result="";
		Word f = this.mappadizionario.get(word);
		for(String v : f.getTraduzionimultiple()) {
			if(result=="") result=result+v;
			else result= result+"\n"+v;
		}
		return result;
	}
	
	

}
