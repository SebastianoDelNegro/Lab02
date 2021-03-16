package it.polito.tdp.alien;

public class Word {
	
	private String alienword;
	private String traduzione;
	
	
	public Word(String alienword, String traduzione) {
		super();
		this.alienword = alienword;
		this.traduzione = traduzione;
	}


	public String getAlienword() {
		return alienword;
	}


	public void setAlienword(String alienword) {
		this.alienword = alienword;
	}


	public String getTraduzione() {
		return traduzione;
	}


	public void setTraduzione(String traduzione) {
		this.traduzione = traduzione;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((alienword == null) ? 0 : alienword.hashCode());
		result = prime * result + ((traduzione == null) ? 0 : traduzione.hashCode());
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
		if (traduzione == null) {
			if (other.traduzione != null)
				return false;
		} else if (!traduzione.equals(other.traduzione))
			return false;
		return true;
	}
	

}
