package com.lq.ac;

import java.io.*;

public class ReadJFile {

	public static void main(String[] args) {
		
		try {
			InputStream inFile = new FileInputStream("D:\\deleteLater\\test.txt");
			
			Reader inStreamReader = new InputStreamReader(inFile);
			
			LineNumberReader lineReader = new LineNumberReader(inStreamReader);
			
			lineReader.lines().forEach( line -> System.out.println(line) );
		}
		
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}