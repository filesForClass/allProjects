package com.lq.vehicle;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		

	/*HashSet<Car> carHashSet = new HashSet<Car>();
		
		carHashSet.add( new StationWagon() );
		carHashSet.add( new SportsCar() );
		
		Iterator<Car> iter = carHashSet.iterator();
		
		while( iter.hasNext() ) {
			Car t = iter.next();
			System.out.println( t.getSpeed() );
		} 
		
		
	
		SortedSet<String> names = new TreeSet<String>();
		
		names.add("Zebra");
		names.add("Bear");
		names.add("Apple");
		names.add("Elephant");
		
		Iterator<String> i = names.iterator();
		
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		
		 ArrayList<Car> carList = new ArrayList<Car>();
		
		carList.add( new StationWagon() );
		carList.add( new SportsCar() );
		
		Iterator<Car> iter = carList.iterator();
		
		while( Car r : carList ) {
			System.out.println( r.getSpeed() );
		} 
		*/
		
		SportsCar sp = new SportsCar();
		
		try {
			sp.setSpeed(500);		
		}
		catch(Exception e){
			e.getMessage();
		}
		finally {
			System.out.println("Speed Done");
		}
		
		System.out.println(sp.getSpeed());
		
	} 

	
}
