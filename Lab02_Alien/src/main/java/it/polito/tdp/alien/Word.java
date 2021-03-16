package it.polito.tdp.alien;

import java.util.*;

public class Word {
	
	private String alienword;
	//private String traduzione;
	List<String> traduzionimultiple;
	
	
	public Word(String alienword) {
		super();
		this.alienword = alienword;
		//this.traduzione = traduzione;
		this.traduzionimultiple= new LinkedList<String>();
	}


	public String getAlienword() {
		return alienword;
	}


	public void setAlienword(String alienword) {
		this.alienword = alienword;
	}


	//public String getTraduzione() {
	//	return traduzione;
	//}


	//public void setTraduzione(String traduzione) {
	//	this.traduzione = traduzione;
	//}


	


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((alienword == null) ? 0 : alienword.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Word other = (Word) obj;
		if (alienword == null) {
			if (other.alienword != null)
				return false;
		} else if (!alienword.equals(other.alienword))
			return false;
		return true;
	}


	public List<String> getTraduzionimultiple() {
		return traduzionimultiple;
	}


	public void setTraduzionimultiple(List<String> traduzionimultiple) {
		this.traduzionimultiple = traduzionimultiple;
	}


	
	public String risultato() {
		String c ="";
		for(String x : traduzionimultiple) {
			if(c=="") c+=x;
			else c="\n"+x;
		}
		return c; 
	}


	
	
	
}
