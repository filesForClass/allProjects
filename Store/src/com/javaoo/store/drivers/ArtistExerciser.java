package com.javaoo.store.drivers;
import java.util.*;
import com.javaoo.store.Artist;

public class ArtistExerciser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Artist hotPlate = new Artist("Hot Plate");
		
		SortedSet<String> instruments1 = new TreeSet<String>();
		
		instruments1.add("Piano");
		instruments1.add("Clarinet");
		instruments1.add("Hurdy Gurdy");
		instruments1.add("Tuba");
		
		hotPlate.addMember("john", instruments1);
		
		SortedSet<String> instruments2 = new TreeSet<String>();
		instruments2.add("Guitar");
		
		hotPlate.addMember("Jane", instruments2);
		
		System.out.println(hotPlate.getMemberNames());
		
				
	}

}
