package com.Reader;

import java.io.IOException;

public class FileReaderManger {
	
	private FileReaderManger() {
		
		
	}
	
	public static FileReaderManger getInstanceFRM() {
		
		FileReaderManger FRM = new  FileReaderManger();
		
		return FRM;

	}
	public  ConfigReader getInstance() throws IOException {
		
		ConfigReader reader = new ConfigReader();
		
		return reader;
		
		

	}

}
