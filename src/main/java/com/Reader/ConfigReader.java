package com.Reader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	
	public static Properties p;
	
	public ConfigReader() throws IOException {
	
	
	File f = new File("C:\\Users\\ELCOT\\eclipse-workspace\\Adactin\\src\\main\\java\\com\\configure_properties\\Config.Properties");

	FileInputStream fis = new FileInputStream(f);
	
	 p = new Properties();
	 p.load(fis);
	}
    public String getusername()  {
    	
    	 String User = p.getProperty("Username");
    	 return User;
	}
    
    public String getpassword()  {
    	
    	String pass = p.getProperty("Password");
    	return pass;
    	
    	
	}
    
    public String getName() {
    String name = p.getProperty("Name");
    return name;
    
	}
    
    public String getLastname() {
    	String lastname = p.getProperty("Lastname");
    	return lastname;

	}
    
    public String getAddress() {
    	String address = p.getProperty("Address");
    	return address;

	}
    
    public String getCreditcardNo() {
    	String CCno = p.getProperty("CreditcardNo");
    	return CCno;
    	

	}
    public String getCVV() {
    	String cvv = p.getProperty("CVV");
    	return cvv;

	}

}
