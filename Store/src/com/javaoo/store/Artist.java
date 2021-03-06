package com.javaoo.store;
import java.util.*;

public class Artist {
		private String name;
	    private SortedSet<String> memberNames;
	    private Map<String, SortedSet<String>> memberInstruments;
		
	    public Artist () {
	    	memberNames = new TreeSet<String>();
	    	memberInstruments = new TreeMap<String, SortedSet<String>>();
	    }
	    
	    public Artist(String name) {
	    	this();
	    	setName(name);
	    }
	    
	    public Artist(String name, TreeSet<String> memberNames, Map<String, SortedSet<String>> memberInstruments) {
			super();
			this.name = name;
			this.memberNames = memberNames;
			this.memberInstruments = memberInstruments;
		}


		public SortedSet<String> getMemberNames() {
			return memberNames;
		}

		public Map<String, SortedSet<String>> getMemberInstruments() {
			return memberInstruments;
		}

		public void addMemberInstruments(Map<String, SortedSet<String>> memberInstruments) {
			this.memberInstruments = memberInstruments;
		}

		public void addMember(String name, SortedSet<String> instruments) {
	    	memberNames.add(name);
	    	memberInstruments.put(name, instruments);
	    }
		
		public String getName() {
			return name;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		

	
}
