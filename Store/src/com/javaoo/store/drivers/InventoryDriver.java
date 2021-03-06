package com.javaoo.store.drivers;
import java.util.Date;
import com.javaoo.store.*;

import com.javaoo.store.Artist;
import com.javaoo.store.Book;
import com.javaoo.store.CD;
import com.javaoo.store.Item;

public class InventoryDriver {
	
	public static void main(String[] args) {
		Item[] myInventory = new Item[50];
		
		myInventory[0] = new Book("Godzilla on Holiday", 24.95, 5,
				"Wesley Wynham-Price", "Ransom House", "FICTION");
		myInventory[1] = new Book("Loch Ness Memories", 49.95, 1,
				"Fred MacMurray", "Penquin Press", "FICTION");
		myInventory[2] = new Book("MVS JCL", 89.95, 3,
				"Steve Balmer", "Microsoft Press", "NON-FICTION");
		myInventory[3] = new Book("Lingo in a NutShell", 19.95, 8,
				"Bill Bates", "O'Reilly", "NON-FICTION");
		myInventory[4] = new Book("Grid Computing", 79.95, 2,
				"Bobby Beowold", "Trouser Press", "NON-FICTION");
		myInventory[5] = new CD("Going for The One", 12.95, 4,
							new Artist("YES"), new Date("07/07/1977"));
		myInventory[6] = new CD("Baby One More Time", 15.95, 5,
							new Artist("Britney Spears"), new Date("01/08/2000"));
		myInventory[7] = new CD("Three Cheers for Sweet Revenge", 19.00, 2,
							new Artist("My Chemical Romance"), new Date("04/05/2004"));
	}
}
