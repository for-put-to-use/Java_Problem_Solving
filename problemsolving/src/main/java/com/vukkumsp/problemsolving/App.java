package com.vukkumsp.problemsolving;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.vukkumsp.problemsolving.strings.Strings_1;

public class App {
	@SuppressWarnings("unused")
	private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

	public static void main(String[] args) throws Exception {
		new App().proceed();
	}

	public void proceed() {
		LOGGER.info("Elements of Programming Interviews in Java");
		/*
		 * Elements of Programming Interviews in Java
		 */
		
		//Strings
		LOGGER.info("Strings");
		
		Strings_1 s1 = new Strings_1();
		System.out.println(s1.intToString(12409));
		System.out.println(s1.stringToInt("98765"));
	}
}
