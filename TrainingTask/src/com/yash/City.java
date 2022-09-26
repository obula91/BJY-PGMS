package com.yash;

public class City {
	private int cityid;
	private String cityname;
	private State objState;
	private Float pollutionIndex;
	private int population;
	private int area_of_city;
	public City(int cityid, String cityname, State objState, Float pollutionIndex, int population, int area_of_city) {
		super();
		this.cityid = cityid;
		this.cityname = cityname;
		this.objState = objState;
		this.pollutionIndex = pollutionIndex;
		this.population = population;
		this.area_of_city = area_of_city;
	}
	public City() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getCityid() {
		return cityid;
	}
	public void setCityid(int cityid) {
		this.cityid = cityid;
	}
	public String getCityname() {
		return cityname;
	}
	public void setCityname(String cityname) {
		this.cityname = cityname;
	}
	public State getObjState() {
		return objState;
	}
	public void setObjState(State objState) {
		this.objState = objState;
	}
	public Float getPollutionIndex() {
		return pollutionIndex;
	}
	public void setPollutionIndex(Float pollutionIndex) {
		this.pollutionIndex = pollutionIndex;
	}
	public int getPopulation() {
		return population;
	}
	public void setPopulation(int population) {
		this.population = population;
	}
	public int getArea_of_city() {
		return area_of_city;
	}
	public void setArea_of_city(int area_of_city) {
		this.area_of_city = area_of_city;
	}
	@Override
	public String toString() {
		return "City [cityid=" + cityid + ", cityname=" + cityname + ", objState=" + objState + ", pollutionIndex="
				+ pollutionIndex + ", population=" + population + ", area_of_city=" + area_of_city + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + area_of_city;
		result = prime * result + cityid;
		result = prime * result + ((cityname == null) ? 0 : cityname.hashCode());
		result = prime * result + ((objState == null) ? 0 : objState.hashCode());
		result = prime * result + ((pollutionIndex == null) ? 0 : pollutionIndex.hashCode());
		result = prime * result + population;
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
		City other = (City) obj;
		if (area_of_city != other.area_of_city)
			return false;
		if (cityid != other.cityid)
			return false;
		if (cityname == null) {
			if (other.cityname != null)
				return false;
		} else if (!cityname.equals(other.cityname))
			return false;
		if (objState == null) {
			if (other.objState != null)
				return false;
		} else if (!objState.equals(other.objState))
			return false;
		if (pollutionIndex == null) {
			if (other.pollutionIndex != null)
				return false;
		} else if (!pollutionIndex.equals(other.pollutionIndex))
			return false;
		if (population != other.population)
			return false;
		return true;
	}
	
	
}
