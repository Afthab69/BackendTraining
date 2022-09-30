package com.orthofx;
import java.util.*;
public class Club {

	String name;
	static HashMap<String, String> players = new HashMap<String, String>();	
	
	public Club(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	

}
