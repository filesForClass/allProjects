package com.javaoo.store;
import java.util.Date;

public class ClassicalCD extends Item {
	
		private String composer;
		private String[] performers = new String[5];
		private String recordingLocation;
		private Date releaseDate;
		private int performerCount = 0;
	
			
		public ClassicalCD(String title, double price, int quantity, String composer,
				String recordingLocation, Date releaseDate) {
			super(title, price, quantity);
			setComposer(composer);
			setRecordingLocation(recordingLocation);
			setReleaseDate(releaseDate);
		}
		
		String getComposer() {
			return composer;
		}
		public void setComposer(String composer) {
			this.composer = composer;
		}
		public String getRecordingLocation() {
			return recordingLocation;
		}
		public void setRecordingLocation(String recordingLocation) {
			this.recordingLocation = recordingLocation;
		}
		public Date getReleaseDate() {
			return releaseDate;
		}
		public void setReleaseDate(Date releaseDate) {
			this.releaseDate = releaseDate;
		}
		
		public void addPerformer(String p){
			if (performerCount >= performers.length) {
				System.out.println("Cannot add more to " + getTitle());
			}
			else{
				performers[performerCount] = p;
				performerCount++;
			}
		}
		public String showPerformers() {
			String performerArray = "";
			
			for(int i = 0; i < performerCount; i++) {
				performerArray += (performers[i]);
				
				if( i != (performerCount-1)) {
					performerArray += (" ");
				}
			}
			return performerArray;
		}


}
