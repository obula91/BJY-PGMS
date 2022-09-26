package com.yash.test;

import java.awt.dnd.DropTargetListener;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.yash.City;
import com.yash.State;

public class CityTest {

	public static List<City> getListOfCity() {
		ArrayList<City> listofCity = new ArrayList<>();
		listofCity.add(new City(1, "Hyderabad", new State(1, "Telangana"), 10.98f, 12, 19));
		listofCity.add(new City(2, "th", new State(2, "kerala"), 10.99f, 13, 22));
		listofCity.add(new City(3, "Hyderabad", new State(1, "Telangana"), 11.98f, 13, 23));
		listofCity.add(new City(4, "Hyderabad", new State(1, "Telengana"), 12.98f, 14, 24));
		listofCity.add(new City(5, "hg", new State(5, "Andhra"), 13.98f, 15, 25));
		listofCity.add(new City(6, "kadapa", new State(5, "Andhra"), 14.98f, 19, 26));
		return listofCity;
	}

	public static void main(String[] args) {
		List<City> cityList = getListOfCity();

		/**
		 * WAP to find the city with less area and highest population
		 */

		System.out.println("city with less area ");
		cityList.stream().sorted(Comparator.comparing(City::getArea_of_city)).findFirst()
				.ifPresent(n -> System.out.println(n));
		System.out.println("city with  highest population ");
		cityList.stream().sorted(Comparator.comparing(City::getPopulation).reversed()).findFirst()
				.ifPresent(n -> System.out.println(n));

		/**
		 * WAP to find the city with high pollution_index and high city area.
		 */

		System.out.println("City with high pollution index is: ");
		cityList.stream().sorted(Comparator.comparing(City::getPollutionIndex).reversed()).findFirst()
				.ifPresent(n -> System.out.println(n));

		System.out.println("City with high city area: ");
		cityList.stream().sorted(Comparator.comparing(City::getArea_of_city).reversed()).findFirst()
				.ifPresent(n -> System.out.println(n));

		/**
		 * WAP to print the city detail on the basis of lowest pollution_index first and
		 * so on.
		 * 
		 */
		
		System.out.println("city detail on the basis of lowest pollution_index first:           ");
		cityList.stream().sorted(Comparator.comparing(City::getPollutionIndex)).forEach(n->System.out.println(n));
		
		/**
		 * WAP to print city with lowest pollution index and lowest area of city
		 */
		System.out.println("city with lowest pollution : ");
		cityList.stream().sorted(Comparator.comparing(City::getPopulation)).findFirst().ifPresent(n->System.out.println(n));
		
		System.out.println("lowest area of city : ");
		cityList.stream().sorted(Comparator.comparing(City::getArea_of_city)).findFirst().ifPresent(n->System.out.println(n));
		
		
		/**
		 * WAP to count how many cities in every state we are having.
		 */
		System.out.println("cities in every state : ************************* ");
		
		cityList.stream().collect(Collectors.groupingBy(City::getObjState,Collectors.counting()))
		.forEach((k,v)->System.out.println(k+"city count is :  "+v));
		
		/**
		 * WAP to print total area of each state
		 */
		
		cityList.stream().collect(Collectors.groupingBy(City::getObjState,Collectors.averagingDouble(City::getArea_of_city)))
		.forEach((k,v)->System.out.println(k+"total area is:  "+v));
		
	}
}
