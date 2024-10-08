package com.vukkumsp.problemsolving.strings;

public class Strings_1 {

	/*
	 * Total 11+ scenarios are there in Strings chapter
	 * 
	 * 1. Interconvert Strings and Integers
	 * 2. Base Conversion
	 * 3. 
	 * 
	 */
	
	public String intToString(int input) {
		boolean isNegative = false;
		if(input<0) isNegative = true;
		
		StringBuilder sb = new StringBuilder();
		
		do {
			sb.append(input%10); //automatic typecasting
//			sb.append('0'+Math.abs(input%10)); //
			input /= 10;
		}while(input!=0);
		
		if(isNegative) sb.append('-');
		
		sb.reverse();
		
		return sb.toString();
	}
	
	public int stringToInt(String input) {
		boolean isNegative = false;
		if(input.startsWith("-")) isNegative = true;
		
		int output = 0;
		
		for(int i=(isNegative?1:0);i < input.length(); ++i) {
			output += (input.charAt(i)-'0');
			if(i!=input.length()-1) output *= 10;
		}
		
		return isNegative?-output:output;
	}
	
	public String convertB1toB2(String input, int b1, int b2) {
		//step 1: convert input from b1 to decimal
		
		//step 2: convert input from decimal to b2
		
		return null;
	}
}
