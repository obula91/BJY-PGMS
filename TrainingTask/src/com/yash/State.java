package com.yash;

public class State {
	private int stated;
	private String statename;
	public State(int stated, String statename) {
		super();
		this.stated = stated;
		this.statename = statename;
	}
	public State() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getStated() {
		return stated;
	}
	public void setStated(int stated) {
		this.stated = stated;
	}
	public String getStatename() {
		return statename;
	}
	public void setStatename(String statename) {
		this.statename = statename;
	}
	@Override
	public String toString() {
		return "State [stated=" + stated + ", statename=" + statename + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + stated;
		result = prime * result + ((statename == null) ? 0 : statename.hashCode());
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
		State other = (State) obj;
		if (stated != other.stated)
			return false;
		if (statename == null) {
			if (other.statename != null)
				return false;
		} else if (!statename.equals(other.statename))
			return false;
		return true;
	}
	
	
	
}