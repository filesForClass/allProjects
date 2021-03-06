package com.javaoo.store;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.List;


public class BookExerciser {
	
	public static ArrayList<Book> readBooksFromFile(String name){
		
		ArrayList<Book> books = null;
		try {
			FileInputStream inFile = new FileInputStream(name);
			InputStreamReader inReader= new InputStreamReader(inFile);
			LineNumberReader lineReader = new LineNumberReader(inReader);
			
			books = new ArrayList<Book>();
			
			String line;
			
			while( (line = lineReader.readLine() ) != null) {
				
				String title = line;
				
				line = lineReader.readLine();
				
				String author = line;
				
				line = lineReader.readLine();
				
				double price =  Double.parseDouble(line);
				
				Book b = new Book(title,price, 1, author, "A", "Sci0-FI");	
				
				books.add(b);
			}		
			
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return books;
			
	}
	
	
	public static void main(String[] args) {
	


		String name = "D:\\deleteLater\\book\\books.txt";
		
		List<Book> books = readBooksFromFile(name);
		for (Book s : books) {
		 System.out.println( s.getTitle() );
		}
	}
	
}
