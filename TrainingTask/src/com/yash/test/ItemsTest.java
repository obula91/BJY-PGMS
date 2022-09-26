package com.yash.test;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

import com.yash.Items;
import com.yash.ItemsDTO;

public class ItemsTest {

	public static List<Items>  getListOfItems(){
		
		List<Items> itemsList=new ArrayList<>();
		itemsList.add(new Items(1, "bottle", LocalDateTime.of(2017, 2,13,15,56), LocalDateTime.of(2019, 2,13,15,56), 1555.01f));
		itemsList.add(new Items(2, "laptop", LocalDateTime.of(2019, 2,13,15,56), LocalDateTime.of(2013, 2,13,15,56), 1655.01f));
		itemsList.add(new Items(3, "mouse", LocalDateTime.of(2016, 2,13,15,56), LocalDateTime.of(2015, 2,13,15,56), 1655.01f));
		itemsList.add(new Items(4, "Dresses", LocalDateTime.of(2018, 2,13,15,56), null, 17555.01f));
		itemsList.add(new Items(5, "mobile", LocalDateTime.of(2016, 2,13,15,56), LocalDateTime.of(2011, 2,13,15,56), 15595.01f));
		
		return itemsList;
		
	}
	
	public static void main(String[] args) {
		List<Items> itemsList=getListOfItems();
		
		System.out.println("Average Price of an item is : ****************************************");
	Double averagePrice=	itemsList.stream().collect(Collectors.averagingDouble(Items::getPrice));
	System.out.println(averagePrice);
	
	
	
	//WAP to print detail of item which is having highest and lowest price. 
	System.out.println("Maximum price value of an item is : **************************************                 ");
	itemsList.stream().sorted(Comparator.comparingDouble(Items::getPrice).reversed()).findFirst().ifPresent(System.out::println);
	
	System.out.println("Minimum price value of an item is : **************************************                 ");
	itemsList.stream().sorted(Comparator.comparingDouble(Items::getPrice)).findFirst().ifPresent(System.out::println);
	
	
	/**
	 * WAP to print the item with maximum price and not having any expiry 
	date(item like water bottle, and dresses not having any expiry date)
	 */
	System.out.println("No expiry date of an items is :              ");
		itemsList.stream().filter(n->n.getDate_of_expiry()==null).collect(Collectors.toList()).forEach(System.out::println);
		
		/**
		 * WAP to store item name and price from list to set.
		 */
		System.out.println("set of item name and price is : ");
	Set<ItemsDTO> items=	itemsList.stream().map((n)->new ItemsDTO(n.getIname(), n.getPrice()))
		.collect(Collectors.toSet());
	
	items.forEach(n->System.out.println(n));
	
	/**
	 * WAP to remove duplicate prices from the list of the items.

	 */
	
	System.out.println("After removing dulicate prices from list is: ");
	itemsList.stream().collect(Collectors.toCollection(()->new TreeSet<>(Comparator.comparing(Items::getPrice)))).stream()
	.collect(Collectors.toList()).forEach(n->System.out.println(n));
	}
}
